package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OpeningGantt {
    @Given("I am logged into Salesforce account")
    public void logintToSalesforce() {
        Helpers.login();
    }
    @Given("I click on Project tab")
    public void navigateToProject() {
        // This will navigate us to Project
        Helpers.navigateToProject();
    }
    @When("I click on Gantt tab")
    public void navigateToGantt(){
        //This will navigate us to Gantt page from Project
        Helpers.navigateToGantt();
    }
    @Then("Gantt page should be opened")
    public void gantt_page_should_be_opened() throws InterruptedException {
        //check if Gantt page is opened correctly
        WebElement web = hooks.driver.findElement(By.xpath("//div[@id='ganttappheaderbar-1009-title-textEl']"));
        Assert.assertEquals("Gantt", web.getText());
        Thread.sleep(10000);

    }

}
