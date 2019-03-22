package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class DataTables {


    @Given("I am on Contact tab")
    public void onContactTab() {
        System.out.println("When I am on contact tab");
    }

    @Given("I click New button")
    public void clickNewButton() {
        System.out.println("Clicked on New button");
    }

    @Given("I enter mandatory data")
    public void mandatoryData(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> fieldValues = dataTable.asMaps(String.class, String.class);
        for (int i = 0; i < fieldValues.size(); i++) {
            System.out.println("Last Name " + fieldValues.get(i).get("Last Name"));
            System.out.println("Contact Currency " + fieldValues.get(i).get("Contact Currency"));
            System.out.println("Is Resource " + fieldValues.get(i).get("Is Resource"));
            System.out.println("Is Resource Active " + fieldValues.get(i).get("Is Resource Active"));
        }
    }

    @When("I click Save")
    public void clickSave() {
        System.out.println("Save Button Clicked");
    }

    @Then("new Contact should be created")
    public void newContactCreated() {
        System.out.println("New contact must be created ");
    }

    @Then("User must be navigated to newly created contact page")
    public void navigatedToContactPage() {
        System.out.println("User navigated to contact page");
    }

    @Given("I enter below data")
    public void enterData(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> fieldValues = dataTable.asMaps(String.class, String.class);
        for (int i = 0; i < fieldValues.size(); i++) {
            System.out.println("New Record DATA");
            System.out.println("First Name " + fieldValues.get(i).get("First Name"));
            System.out.println("Last Name " + fieldValues.get(i).get("Last Name"));
            System.out.println("Region " + fieldValues.get(i).get("Region"));
            System.out.println("Resource Role " + fieldValues.get(i).get("Resource Role"));
            System.out.println("Is Resource Active " + fieldValues.get(i).get("Is Resource Active"));
            System.out.println("Is Resource " + fieldValues.get(i).get("Is Resource"));
            System.out.println("Work Calender " + fieldValues.get(i).get("Work Calendar"));
        }
    }

}
