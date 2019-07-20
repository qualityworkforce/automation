package com.ff.psa.steps.salesforce;

import com.ff.psa.pageobjects.CommonPage;
import com.ff.psa.pageobjects.GanttPage;
import com.ff.psa.pageobjects.LoginPage;
import com.ff.psa.pageobjects.ProjectPage;
import com.ff.psa.steps.Hooks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AddingTasksSteps {

    LoginPage   loginPage   = new LoginPage();
    ProjectPage projectPage = new ProjectPage();
    CommonPage  commonPage  = new CommonPage();
    GanttPage   ganttPage   = new GanttPage();

    public void GanttNavigation() {
        loginPage   = new LoginPage();
        projectPage = new ProjectPage();
        commonPage  = new CommonPage();
        ganttPage   = new GanttPage();
    }

    @Given("I am on project page")
    public void i_am_on_project_page() {
        loginPage.enterUserName("chaliki+spring2019@financialforce.com");
        loginPage.enterPassword("Test12345");
        loginPage.clickLoginButton();
        commonPage.verifyHomeButtonPresent();
        projectPage.clickOnProjectsTab();
        projectPage.clickOnGo();
        projectPage.clickOnProjects();
    }
    @When("I click Gantt Button")
    public void i_click_Gantt_Button() {
        projectPage.ganttButtonClick();
        ganttPage.verifyGanttLogo();
    }

    @When("I click on add task button")
    public void i_click_on_add_task_button()
    {
        ganttPage.addNewTask();
    }

    @Then("new task must be added")
    public void new_task_must_be_added()
    {
    }

    @Then("added tasks must be saved when we will save button")
    public void tasksMustBeSaved() throws InterruptedException {
        ganttPage.saveChanges();
        ganttPage.deleteTask();
    }
}
