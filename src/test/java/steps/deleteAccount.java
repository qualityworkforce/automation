package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class deleteAccount {
    @Given("Click on account name link")
    public void click_on_account_name_link()
    {
        System.out.println("Clicked on account");
    }

    @When("I click on delete button")
    public void i_click_on_delete_button()
    {
        System.out.println("Delete button clicked");
    }

    @Then("a popup should open")
    public void a_popup_should_open()
    {
        System.out.println("Popup must be opened ");
    }

    @Then("when i click ok on the popup account should be delete")
    public void when_i_click_ok_on_the_popup_account_should_be_delete()
    {
        System.out.println("Account should be deleted.");
    }

    @Then("I should be navigated to accounts page")
    public void i_should_be_navigated_to_accounts_page()
    {
        System.out.println("User should be navigated to accounts page");
    }

}
