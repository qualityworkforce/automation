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


    @Given("I enter valid Username")
    public void enterUsername() {
        hooks.driver.findElement(By.id("username")).sendKeys("achaliki+h10@financialforce.com");
    }

    @Given("I enter valid Password")
    public void enterPassword() {
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
    public void homePage() {
        String pageTitle = hooks.driver.getTitle();
        System.out.println(pageTitle);
        assertEquals("Home Page ~ Salesforce - Developer Edition", pageTitle);
    }

    @Given("user is logged in successfully")
    public void loggedInSuccessfully() {
        System.out.println("Logged in successfully ");
    }

    @When("I click logout link")
    public void clickLogout() {
        hooks.driver.findElement(By.xpath("//div[@id='userNav']")).click();
        hooks.driver.findElement(By.xpath("//a[@title='Logout']")).click();
    }

    @Then("user must be logged out")
    public void loggedOut() {
        System.out.println("Signed out successfully");
    }


}
