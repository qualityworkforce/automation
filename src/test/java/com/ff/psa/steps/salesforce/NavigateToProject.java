package com.ff.psa.steps.salesforce;

import com.ff.psa.Hooks;
import com.ff.psa.pageobjects.LoginPage;
import com.ff.psa.pageobjects.ProjectPage;
import cucumber.api.java.en.Then;

public class NavigateToProject {
    ProjectPage projectPage = new ProjectPage(Hooks.driver);
    LoginPage loginPage = new LoginPage(Hooks.driver);

    @Then("Project page should be opened")
    public void project_page_should_be_opened() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Debug step");
    }

}
