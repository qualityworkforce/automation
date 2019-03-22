package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.*;

public class Login {


    @Given("I navigate to Salesforce login page")
    public void navigateToSalesforce() {
        System.out.println("Done via hooks");
    }


    @Given("I enter valid Username and Password")
    public void enterUsernamePassword() {
        hooks.driver.findElement(By.id("username")).sendKeys("achaliki+h10@financialforce.com");
        hooks.driver.findElement(By.id("password")).sendKeys("Test1234");
    }


    @When("I click Login button")
    public void clickLogin() throws InterruptedException {
        hooks.driver.findElement(By.id("Login")).click();
        Thread.sleep(10000);
    }

    @Then("user must be logged in")
    public void userLoggedIn() {
        System.out.println("user logged in successfully");
    }

    @Then("user must see Salesforce home screen")
    public void user_must_see_Salesforce_home_screen() {
        String pageTitle = hooks.driver.getTitle();
        System.out.println(pageTitle);
        assertEquals("Home Page ~ Salesforce - Developer Edition", pageTitle);
    }

}
