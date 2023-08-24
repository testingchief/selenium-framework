package org.testingchief.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

}
