package org.testingchief.steps.parabank;

import com.github.javafaker.Faker;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

@QAFTestStepProvider
public class AccountsStepDefs {

    @When("^the user clicks on register link$")
    public void the_user_clicks_on_register_link() {
        QAFExtendedWebElement registerLink = new QAFExtendedWebElement("linkText=Register");
        registerLink.click();
    }

    @QAFTestStep(description = "enter the required customer information{0}")
    public void enter_the_required_customer_information(Object[] objArray) throws InterruptedException {
        Faker faker = new Faker();
        String password = "";
        for (Object obj : objArray) {
            QAFExtendedWebElement formField = new QAFExtendedWebElement("id=" + obj);
            if (obj.toString().contains("firstName"))
                formField.sendKeys(faker.name().firstName());
            else if (obj.toString().contains("lastName"))
                formField.sendKeys(faker.name().lastName());
            else if (obj.toString().contains("address.street"))
                formField.sendKeys(faker.address().streetAddress());
            else if (obj.toString().contains("address.city"))
                formField.sendKeys(faker.address().city());
            else if (obj.toString().contains("address.state"))
                formField.sendKeys(faker.address().state());
            else if (obj.toString().contains("address.zipCode"))
                formField.sendKeys(faker.address().zipCode());
            else if (obj.toString().contains("phoneNumber"))
                formField.sendKeys(faker.phoneNumber().phoneNumber());
            else if (obj.toString().contains("ssn"))
                formField.sendKeys(faker.phoneNumber().cellPhone());
            else if (obj.toString().contains("username"))
                formField.sendKeys(faker.random().hex());
            else if (obj.toString().contains("customer.password")) {
                password = faker.random().hex();
                formField.sendKeys(password);
            } else if (obj.toString().contains("repeatedPassword"))
                formField.sendKeys(password);
            else
                System.out.println("### ERROR ### Form field not found");
        }
    }

    @When("^user clicks on register button$")
    public void user_clicks_on_register_button() {
        QAFExtendedWebElement registerBtn = new QAFExtendedWebElement(By.xpath("//input[@value='Register']"));
        registerBtn.click();
        
    }

    @Then("^the user is created successfully$")
    public void the_user_is_created_successfully() {
        QAFExtendedWebElement welcomeMsg = new QAFExtendedWebElement(By.cssSelector(".title"));
        assertThat(welcomeMsg.getText(), containsString("Welcome"));

        QAFExtendedWebElement accountCreationMsg = new QAFExtendedWebElement(By.cssSelector("div[id='rightPanel'] p"));
        assertThat(accountCreationMsg.getText(), containsString("Your account was created successfully. You are now logged in."));
    }

}
