package com.ff.psa.steps.salesforce;

import com.ff.psa.pageobjects.LoginPage;
import com.ff.psa.pageobjects.ProjectPage;
import com.ff.psa.steps.Hooks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class ProjectNavigation {

    LoginPage loginPage = new LoginPage(Hooks.driver);
    ProjectPage projectPage = new ProjectPage(Hooks.driver);

public void OpeningGanttSteps(){
  loginPage = new LoginPage(Hooks.driver);
    projectPage = new ProjectPage(Hooks.driver);
}
    @Given("I am logged into Salesforce account")
    public void logintToSalesforce()
    {
        loginPage.enterUserName("chaliki+spring2019@financialforce.com");
        loginPage.enterPassword("Test12345");
        loginPage.clickLoginButton();
        Assert.assertEquals(loginPage.getPageTitle(), "Home Page ~ Salesforce - Developer Edition");
    }
    @Given("I click on Project tab")
    public void navigateToProject()
    {
        projectPage.clickOnProjectsTab();
        projectPage.clickOnGo();
        projectPage.clickOnProjects();
    }

    @Then("Project page should be opened")
    public void project_page_should_be_opened()
    {
        projectPage.ganttButtonDisplayed();
    }

    }


