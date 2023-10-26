package org.testingchief.steps.parabank;


import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@QAFTestStepProvider
public class LoginStepDefs {

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

    @Then("^the user is logged in successfully$")
    public void the_user_is_logged_in_successfully() {
        QAFExtendedWebElement usernameText = new QAFExtendedWebElement("className=smallText");
        assertThat(usernameText.getText(), equalTo("Welcome John Smith"));
    }

    @Then("^user logs out of the application$")
    public void user_logs_out_of_the_application() {
        QAFExtendedWebElement logoutButton = new QAFExtendedWebElement("linkText=Log Out");
        logoutButton.click();
    }

    @QAFTestStep(description="user enters the username as {0}")
    public void userEntersTheUsernameAs(String str0){

    }

}
