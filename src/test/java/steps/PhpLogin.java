package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import static java.lang.Thread.currentThread;
import static org.junit.Assert.assertEquals;

public class PhpLogin {
    @Given("I navigate to PHP Travels Login page")
    public void navigateToLoginPage() {
        hooks.driver.get("https://www.phptravels.net/login");
        String url = hooks.driver.getCurrentUrl();
        Assert.assertEquals("https://www.phptravels.net/login",url);
    }
    @Given("enter valid email id")
    public void enterValidEmail() {
        hooks.driver.findElement(By.name("username")).sendKeys("999.ambi@gmail.com");
    }
    @Given("enter valid password")
    public void enterValidPassword() {
        hooks.driver.findElement(By.name("password")).sendKeys("Test1234");

    }
    @When("I click Login button")
    public void clickLoginButton() throws InterruptedException {
        hooks.driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
        currentThread().sleep(1000);
    }
    @Then("I should be navigated to my account page")
    public void navigateToAccountPage() {
        String userName = hooks.driver.findElement(By.xpath("//h3[text()='Hi, Test User']")).getText();
        assertEquals("Hi, Test User", userName);
    }
}