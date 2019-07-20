package com.ff.psa.steps.salesforce;

import com.ff.psa.pageobjects.CommonPage;
import com.ff.psa.pageobjects.LoginPage;
import com.ff.psa.steps.Hooks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

public  class LoginSteps {

    LoginPage  loginPage;
    CommonPage commonpage;

    public LoginSteps()  {
        loginPage  = new LoginPage();
        commonpage = new CommonPage();
    }

    @Given("enter valid user name")
    public void enterUserName()
    {
        loginPage.enterUserName("chaliki+spring2019@financialforce.com");

    }

    @Given("enter a valid password")
    public void enterPassword()
    {
        loginPage.enterPassword("Test12345");
    }

    @When("I click on login")
    public void clickLogin()
    {
        loginPage.clickLoginButton();
    }

    @Then("you must be logged in to saleforce site")
    public void you_must_be_logged_in_to_saleforce_site()
    {
        commonpage.verifyHomeButtonPresent();
    }
}
