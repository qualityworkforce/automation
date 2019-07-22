package com.ff.psa.steps.salesforce;

import com.ff.psa.pageobjects.CommonPage;
import com.ff.psa.pageobjects.GanttPage;
import com.ff.psa.pageobjects.LoginPage;
import com.ff.psa.pageobjects.ProjectPage;
import com.ff.psa.steps.Hooks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AddingTasks {

    LoginPage   loginPage   = new LoginPage(Hooks.driver);
    ProjectPage projectPage = new ProjectPage(Hooks.driver);
    CommonPage  commonPage  = new CommonPage(Hooks.driver);
    GanttPage   ganttPage   = new GanttPage(Hooks.driver);

    @Given("I am on project page")
    public void i_am_on_project_page() {
        loginPage.enterUserName();
        loginPage.enterPassword();
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
    public void i_click_on_add_task_button() {
        ganttPage.addNewTask();
    }

    @Then("new task must be added")
    public void new_task_must_be_added() {
    }
    @Then("added tasks must be saved when we will save button")
    public void tasksMustBeSaved(){
        ganttPage.saveChanges();
    }
}
