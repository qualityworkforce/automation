package com.ff.psa.steps.salesforce;

import com.ff.psa.Hooks;
import com.ff.psa.helpers.Helpers;
import com.ff.psa.pageobjects.LoginPage;
import com.ff.psa.pageobjects.ProjectPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OpeningGanttSteps {

    LoginPage loginPage = new LoginPage(Hooks.driver);
    ProjectPage projectPage = new ProjectPage(Hooks.driver);

public void OpeningGanttSteps(){
  loginPage = new LoginPage(Hooks.driver);
    projectPage = new ProjectPage(Hooks.driver);
}


    @Given("I am logged into Salesforce account")
    public void logintToSalesforce() {
        loginPage.enterUserName("chaliki+spring2019@financialforce.com");
        loginPage.enterPassword("Test12345");
        loginPage.clickLoginButton();
        Assert.assertEquals(loginPage.getPageTitle(), "Home Page ~ Salesforce - Developer Edition");
    }
    @Given("I click on Project tab")
    public void navigateToProject() {
        projectPage.clickOnProjectsTab();
        projectPage.clickOnGo();
        projectPage.clickOnProjects();
    }
    @When("I click on Gantt tab")
    public void navigateToGantt(){
        //This will navigate us to Gantt page from Project
       // Helpers.navigateToGantt();
    }
    @Then("Gantt page should be opened")
    public void gantt_page_should_be_opened() throws InterruptedException {
        //check if Gantt page is opened correctly
//        WebElement web = Hooks.driver.findElement(By.xpath("//div[@id='ganttappheaderbar-1009-title-textEl']"));
//        Assert.assertEquals("Gantt", web.getText());
//        Thread.sleep(10000);

    }

}
