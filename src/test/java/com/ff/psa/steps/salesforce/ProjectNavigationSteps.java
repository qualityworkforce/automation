package com.ff.psa.steps.salesforce;

import com.ff.psa.pageobjects.LoginPage;
import com.ff.psa.pageobjects.ProjectPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.io.IOException;

public class ProjectNavigationSteps {

    private LoginPage   loginPage;
    private ProjectPage projectPage;


    public ProjectNavigationSteps() throws IOException {
        loginPage = new LoginPage();
        projectPage = new ProjectPage();
    }


    @Given("I am logged into Salesforce account")
    public void logintToSalesforce()
    {
        loginPage.enterUserName("chaliki+spring2019@financialforce.com");
        loginPage.enterPassword("Test12345");
        loginPage.clickLoginButton();
       // Assert.assertEquals(loginPage.getPageTitle(), "Home Page ~ Salesforce - Developer Edition");
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


