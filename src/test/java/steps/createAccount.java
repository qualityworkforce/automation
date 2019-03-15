package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class createAccount {

    @Given("I navigate to Accounts tab")
    public void i_navigate_to_Accounts_tab() {
        System.out.println("Navigated to accounts tab");
    }

    @Given("click new button")
    public void click_new_button() {
        System.out.println("Clicked on new button");
    }

    @When("I enter account name")
    public void i_enter_account_name() {
        System.out.println("Account name entered");
    }


    @Then("user should be navigated to newly created account page")
    public void user_should_be_navigated_to_newly_created_account_page() {
        System.out.println("User is navigated to newly created account ");
    }


    @When("I don't enter account name")
    public void i_don_t_enter_account_name() {
        System.out.println("No account name entered");
    }

    @Then("user should get a error message")
    public void user_should_get_a_error_message() {
        System.out.println("Should get error message");

    }

    @Then("when user click cancel user should be navigated to account tab")
    public void when_user_click_cancel_user_should_be_navigated_to_account_tab() {
        System.out.println("User clicks cancel button user must be navigated to accounts tab");
    }

    @When("I click the save button")
    public void iClickTheSaveButton() {
        System.out.println("Save button clicked");
    }

    @Then("the new account must be created")
    public void theNewAccountMustBeCreated() {
        System.out.println("New account is created ");
    }

    @And("I click the New button")
    public void iClickTheNewButton() {
        System.out.println("Clicked on new button");
    }

    @Given("I enter the following details on new accounts page")
    public void i_enter_the_following_details_on_new_accounts_page(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
//        List<String> values = dataTable.asList(String.class);
//        System.out.println("THIS IS DATA TABLE VALUE_" + values.get(0));
//        System.out.println("THIS IS DATA TABLE VALUE_" + values.get(2));

        List<Map<String, String>> fieldValues = dataTable.asMaps(String.class,String.class);
//        System.out.println("Field Values"+ fieldValues.get(0).get("Field Name"));
//        System.out.println("Field Values"+ fieldValues.get(0).get("Value"));
        for (int i=0 ; i <=fieldValues.size();i++)
        {
            System.out.println("Field Name " + fieldValues.get(i).get("Field Name"));
            System.out.println("Field Value " + fieldValues.get(i).get("Value"));
        }


    }


}



