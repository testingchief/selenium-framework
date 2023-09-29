package org.testingchief.steps.parabank;

import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@QAFTestStepProvider
public class CustomersStepDefs {

    @When("^user clicks on the \"([^\"]*)\" link$")
    public void user_clicks_on_the_link(String arg1) {

    }

    @Then("^the following customer details are displayed$")
    public void the_following_customer_details_are_displayed(DataTable arg1) {

    }

    @When("^the user updates the following customer details$")
    public void the_user_updates_the_following_customer_details(DataTable arg1) {

    }

    @Then("^customer profile is updated successfully$")
    public void customer_profile_is_updated_successfully() {

    }
}
