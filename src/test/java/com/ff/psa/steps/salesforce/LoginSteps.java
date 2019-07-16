package com.ff.psa.steps.salesforce;

import com.ff.psa.Hooks;
import com.ff.psa.helpers.Helpers;
import com.ff.psa.pageobjects.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public  class LoginSteps {

    LoginPage loginPage = new LoginPage(Hooks.driver);

    public void LoginSteps(){

        loginPage = new LoginPage(Hooks.driver);
    }

    @Given("enter valid user name")
    public void enterUserName() {
        loginPage.enterUserName("chaliki+spring2019@financialforce.com");
    }


    @Given("enter a valid password")
    public void enterPassword() {
        loginPage.enterPassword("Test12345");
    }

    @When("I click on login")
    public void clickLogin() {
        loginPage.clickLoginButton();
    }


    @Then("you must be logged in to saleforce site")
    public void you_must_be_logged_in_to_saleforce_site() {

//        String nloc = "//*[@id='home_Tab']";
//        Helpers.clickButtonByXpath(Hooks.driver, 15, nloc);
//        String sysA ="//h1[@class='currentStatusUserName']//a[contains(text(),'System Administrator')]";
//        Helpers.clickButtonByXpath(Hooks.driver,10,sysA);
//        String str ="//input[@id='publishersharebutton']";
//        Helpers.verifyElementIsPresent(Hooks.driver,10,str);
//        String text ="//a[@id='profileTab_sfdc.ProfilePlatformOverview']";
//        Helpers.clickButtonByXpath(Hooks.driver,10,text);

    }
}
