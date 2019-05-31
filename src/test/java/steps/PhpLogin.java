package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
        currentThread().sleep(10000);
    }
    @Then("I should be navigated to my account page")
    public void navigateToAccountPage() {
        String userName =hooks.driver.findElement(By.xpath("//h3[@class='RTL']")).getText();
        assertEquals("Hi, Ambi Cha", userName);
    }

    @Given("enter invalid email id")
    public void enter_invalid_email_id() {
        hooks.driver.findElement(By.name("username")).sendKeys("999.ambi1@gmail.com");
        hooks.driver.findElement(By.name("password")).sendKeys("Test1234");
    }

    @Given("enter invalid password")
    public void enter_invalid_password() {
        hooks.driver.findElement(By.name("password")).sendKeys("Test12345");
    }

    @Then("I should get a error message as Invalid Email or Password")
    public void i_should_get_a_error_message_as_Invalid_Email_or_Password() {
       String text = hooks.driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
       System.out.println(text);
       assertEquals("Invalid Email or Password",text);


    }

}
