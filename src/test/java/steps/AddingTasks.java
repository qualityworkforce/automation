package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class AddingTasks {
    @Given("I click on add task button for {int} times")
    public void i_click_on_add_task_button_for_times(Integer int1) throws InterruptedException {

        for (int i=0 ; i< 10 ; i++) {
            Helpers.clickButtonByXpath(hooks.driver, 40, Helpers.newTask);
        }
            Thread.sleep(10000);
    }

    @When("I click save")
    public void i_click_save() throws InterruptedException {
        Helpers.clickButtonByXpath(hooks.driver,30,Helpers.save);
        Thread.sleep(10000);
      hooks.driver.findElement(By.xpath("//table[@id='treeview-1037-record-59']//td[contains(@class,'f-grid-cell f-grid-td f-grid-cell-wbsColumn f-grid-cell-first f-unselectable')]//div[contains(@class,'f-grid-cell-inner')][contains(text(),'1')]")).click();
        Thread.sleep(10000);
        hooks.driver.findElement(By.xpath("//span[@id='button-1042-btnIconEl']")).click();
        Thread.sleep(10000);
        Helpers.clickButtonByXpath(hooks.driver,30,Helpers.save);
        Thread.sleep(10000);


        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @Then("all the {int} tasks much be saved")
    public void all_the_tasks_much_be_saved(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

}
