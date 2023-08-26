package org.testingchief.steps;


import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@QAFTestStepProvider
public class ParabankStepDefs {

    //user login
    @Given("user opens the Parabank web login page")
    public void user_opens_the_parabank_web_login_page() {
        WebDriverManager.chromedriver().cachePath("drivers").avoidOutputTree().setup();
        new WebDriverTestBase().getDriver().get("http://192.168.0.182:8080/parabank/index.htm");
    }

    @When("user enters the username")
    public void user_enters_the_username() {
        QAFExtendedWebElement usernameElement = new QAFExtendedWebElement(By.name("username"));
        usernameElement.sendKeys("john");
    }

    @When("user enters the password")
    public void user_enters_the_password() {
        QAFExtendedWebElement passwordElement = new QAFExtendedWebElement(By.name("password"));
        passwordElement.sendKeys("demo");
    }

    @When("user clicks on login")
    public void user_clicks_on_login() {
        QAFExtendedWebElement loginButton = new QAFExtendedWebElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
    }

    @Then("the accounts overview page is displayed")
    public void the_accounts_overview_page_is_displayed() {
        assertThat(new WebDriverTestBase().getDriver().getTitle(), containsString("Accounts Overview"));
    }

    //admin features
    @When("user navigates to the admin page")
    public void user_navigates_to_the_admin_page() {
        QAFExtendedWebElement adminPageLink = new QAFExtendedWebElement("linkText=" + "Admin Page");
        adminPageLink.click();
    }

    @When("user clicks on initialize")
    public void user_clicks_on_initialize() {
        QAFExtendedWebElement initializeButton = new QAFExtendedWebElement("name=" + "action");
        initializeButton.click();
    }

    @Then("the database initialized successfully")
    public void the_database_initialized_successfully() {
        assertThat(new QAFExtendedWebElement(By.cssSelector("p:nth-child(2) > b")).getText(),
                equalTo("Database Initialized")
        );
    }

    @When("user clicks on clean button")
    public void user_clicks_on_clean_button() {
        QAFExtendedWebElement cleanButton = new QAFExtendedWebElement(By.cssSelector("button[value='CLEAN']"));
        cleanButton.click();
    }

    @Then("the database is cleaned successfully")
    public void the_database_is_cleaned_successfully() {
        assertThat(new QAFExtendedWebElement(By.cssSelector("p:nth-child(2) > b")).getText(),
                equalTo("Database Cleaned")
        );
    }
}
