package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class dataTables {

    @Given("As a user I want to use data tables")
    public void as_a_user_I_want_to_use_data_tables()
    {
        System.out.println("As a user I want to use data tables");
    }

    @When("I enter below data")
    public void i_enter_below_data(io.cucumber.datatable.DataTable dataTable)
    {

        List<Map<String, String>> fieldValues = dataTable.asMaps(String.class,String.class);
        for (int i = 0 ; i <fieldValues.size() ;i++ )
        {
            System.out.println("First Name " + fieldValues.get(i).get("First Name"));
            System.out.println("Last Name " + fieldValues.get(i).get("Last Name"));
            System.out.println("Place of Birth " +fieldValues.get(i).get("Place of Birth"));
            System.out.println("Above field data is entered  ");
        }

    }

    @Then("it should be displayed on the screen")
    public void it_should_be_displayed_on_the_screen()
    {
        System.out.println("Names displayed on the screen");
    }

    @Given("I am on Contact tab")
    public void i_am_on_Contact_tab()
    {
        System.out.println("When I am on contact tab");
    }

    @Given("I click New button")
    public void i_click_New_button() {
      System.out.println("Clicked on New button");
    }

    @Given("I enter")
    public void i_enter(io.cucumber.datatable.DataTable dataTable) {

        List<Map<String ,String >> fieldValues = dataTable.asMaps(String.class,String.class);
        for (int i=0 ; i < fieldValues.size() ;i ++)
        {
            System.out.println("Last Name " + fieldValues.get(i).get("Last Name"));
            System.out.println("Contact Currency " + fieldValues.get(i).get("Contact Currency"));
            System.out.println("Is Resource " + fieldValues.get(i).get("Is Resource"));
            System.out.println("Is Resource Active " + fieldValues.get(i).get("Is Resource Active"));
        }
    }

    @When("I click Save")
    public void i_click_Save()
    {
        System.out.println("Save Button Clicked");
    }

    @Then("new Contact should be created")
    public void new_Contact_should_be_created()
    {
        System.out.println("New contact must be created ");
    }

    @Then("User must be navigated to newly created contact page")
    public void user_must_be_navigated_to_newly_created_contact_page()
    {
        System.out.println("User navigated to contact page");
    }

}
