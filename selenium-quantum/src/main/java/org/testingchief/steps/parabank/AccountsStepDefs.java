package org.testingchief.steps.parabank;

import com.github.javafaker.Faker;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import cucumber.api.DataTable;
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
    public void enter_the_required_customer_information(Object[] objArray) {
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

    @When("^user clicks on \"([^\"]*)\" link$")
    public void user_clicks_on_link(String arg1) {


    }

    @Then("^the \"([^\"]*)\" page is displayed$")
    public void the_page_is_displayed(String arg1) {


    }

    @Then("^the following account information is displayed$")
    public void the_following_account_information_is_displayed(DataTable arg1) {


    }



    @Then("^the following account activity details are displayed$")
    public void the_following_account_activity_details_are_displayed(DataTable arg1) {


    }

    @When("^user selects a All value from dropdown$")
    public void user_selects_a_All_value_from_dropdown() {


    }

    @When("^user clicks on \"([^\"]*)\" button$")
    public void user_clicks_on_button(String arg1) {


    }

    @When("^user selects a currentMonth value from dropdown$")
    public void user_selects_a_currentMonth_value_from_dropdown() {


    }

    @When("^user selects a nextMonth value from dropdown$")
    public void user_selects_a_nextMonth_value_from_dropdown() {


    }

    @Then("^\"([^\"]*)\" message is displayed$")
    public void message_is_displayed(String arg1) {


    }

    @When("^user selects a Credit value from dropdown$")
    public void user_selects_a_Credit_value_from_dropdown() {


    }

    @When("^user selects a Debit value from dropdown$")
    public void user_selects_a_Debit_value_from_dropdown() {


    }

    @When("^user enters the transfer details$")
    public void user_enters_the_transfer_details(DataTable arg1) {


    }

    @When("^user clicks on an account number$")
    public void user_clicks_on_an_account_number(DataTable arg1) {


    }


    @When("^user enters the payee details$")
    public void user_enters_the_payee_details(DataTable arg1) {


    }

    @When("^user selects an account$")
    public void user_selects_an_account(DataTable arg1) {


    }

    @Then("^the transaction details are displayed$")
    public void the_transaction_details_are_displayed() {


    }

    @When("^the user enters the loan information$")
    public void the_user_enters_the_loan_information(DataTable arg1) {


    }

    @Then("^the loan details are displayed$")
    public void the_loan_details_are_displayed(DataTable arg1) {


    }

    @Then("^the status is displayed as \"([^\"]*)\"$")
    public void the_status_is_displayed_as(String arg1) {


    }

    @When("^user clicks on the new account created$")
    public void user_clicks_on_the_new_account_created() {


    }

    @Then("^the account type is displayed as LOAN$")
    public void the_account_type_is_displayed_as_LOAN() {


    }

    @Then("^\"([^\"]*)\" is displayed$")
    public void is_displayed(String arg1) {


    }

    @When("^enter the required customer information$")
    public void enter_the_required_customer_information(DataTable arg1) {


    }


}
