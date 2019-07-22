package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SalesForceLogin {
    @Given("I navigate to salesforce login page")
    public void salesforceLoginPage() throws InterruptedException {
    }
    @Given("enter valid user name")
    public void enterUserName() throws InterruptedException {
        Helpers.enterTextByXpath(hooks.driver, 10, Helpers.loc, "chaliki+spring2019@financialforce.com");
    }
    @Given("enter a valid password")
    public void enterPassword() throws InterruptedException {
        Helpers.enterTextByXpath(hooks.driver, 10, Helpers.pass, "Test12345");
    }
    @When("I click on login")
    public void clickLogin() {

        Helpers.clickButtonByXpath(hooks.driver, 10, Helpers.login);
    }
    @Then("you must be logged in to saleforce site")
    public void you_must_be_logged_in_to_saleforce_site() throws InterruptedException {
        String nloc = "//*[@id='home_Tab']";
        Helpers.clickButtonByXpath(hooks.driver, 15, nloc);
        String sysA ="//h1[@class='currentStatusUserName']//a[contains(text(),'System Administrator')]";
        Helpers.clickButtonByXpath(hooks.driver,10,sysA);
        String str ="//input[@id='publishersharebutton']";
        Helpers.verifyElementIsPresent(hooks.driver,10,str);
        String text ="//a[@id='profileTab_sfdc.ProfilePlatformOverview']";
        Helpers.clickButtonByXpath(hooks.driver,10,text);
    }
}
