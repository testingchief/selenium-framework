package org.testingchief.steps.parabank;


import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@QAFTestStepProvider
public class SetupStepDefs {

    //admin features
    @When("user navigates to the admin page")
    public void user_navigates_to_the_admin_page() {
        QAFExtendedWebElement adminPageLink = new QAFExtendedWebElement("linkText=" + "Admin Page");
        adminPageLink.click();
    }

    @When("^user clicks on shutdown button$")
    public void user_clicks_on_shutdown_button() {
        QAFExtendedWebElement shutdownButton = new QAFExtendedWebElement(By.xpath("//input[@value='Shutdown']"));
        shutdownButton.click();
    }

    @When("^user clicks on startup button$")
    public void user_clicks_on_startup_button() {
        QAFExtendedWebElement startupButton = new QAFExtendedWebElement(By.xpath("//input[@value='Startup']"));
        startupButton.click();
    }

    @Then("^the JMS service is \"([^\"]*)\"$")
    public void the_JMS_service_is(String status) {
        assertThat(new QAFExtendedWebElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > form:nth-child(2) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2)")).getText(),
                equalTo(status)
        );
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
