package org.testingchief.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testingchief.utilities.DriverFactory;

public class Parabank {

    @Given("user opens the Parabank web login page")
    public void user_opens_the_parabank_web_login_page() {
        DriverFactory.setDriver("chrome");
        DriverFactory.getDriver().get("http://192.168.0.182:8080/parabank/index.htm");
    }

    @When("user enters the username")
    public void user_enters_the_username() {
        DriverFactory.getDriver().findElement(By.name("username")).sendKeys("john");
    }

    @When("user enters the password")
    public void user_enters_the_password() {
        DriverFactory.getDriver().findElement(By.name("password")).sendKeys("demo");
    }

    @When("user clicks on login")
    public void user_clicks_on_login() {
        DriverFactory.getDriver().findElement(By.xpath("//input[@value='Log In']")).sendKeys("demo");
    }

    @Then("the accounts overview page is displayed")
    public void the_accounts_overview_page_is_displayed() {
        System.out.println(DriverFactory.getDriver().getTitle());
    }

    @When("user navigates to the admin page")
    public void user_navigates_to_the_admin_page() {
        DriverFactory.getDriver().findElement(By.linkText("Admin Page")).click();
    }

    @When("user clicks on initialize")
    public void user_clicks_on_initialize() {
        DriverFactory.getDriver().findElement(By.name("action")).click();
    }
    @Then("the database initialized successfully")
    public void the_database_initialized_successfully() {
        Assert.assertEquals("Database initialized successfully!",
                DriverFactory.getDriver().findElement(By.cssSelector("p:nth-child(2) > b")).getText(),
                "Database Initialized"
        );
    }

    @When("user clicks on clean button")
    public void user_clicks_on_clean_button() {
        DriverFactory.getDriver().findElement(By.cssSelector("button[value='CLEAN']")).click();
    }

    @Then("the database is cleaned successfully")
    public void the_database_is_cleaned_successfully() {
        Assert.assertEquals("Database cleaned successfully!",
                DriverFactory.getDriver().findElement(By.cssSelector("p:nth-child(2) > b")).getText(),
                "Database Cleaned"
        );
    }
}
