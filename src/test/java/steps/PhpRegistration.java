package steps;

import com.github.javafaker.Faker;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Map;
import static java.lang.Thread.currentThread;
import static org.junit.Assert.assertEquals;


public class PhpRegistration {

    @Given("I navigate to PHP Travels Sing up page")
    public void phpSignPage() {
        hooks.driver.get("https://www.phptravels.net/register");
       String url= hooks.driver.getCurrentUrl();
        Assert.assertEquals("https://www.phptravels.net/register",url);
        hooks.driver.manage().window().maximize();
    }
    @Given("I enter valid details to below fields")
    public void valid(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> fieldValues = dataTable.asMaps(String.class, String.class);
        for (int i = 0; i < fieldValues.size(); i++) {
            hooks.driver.findElement(By.name("firstname")).sendKeys(fieldValues.get(0).get("First Name"));
            hooks.driver.findElement(By.name("lastname")).sendKeys(fieldValues.get(0).get("Last Name"));
            hooks.driver.findElement(By.name("phone")).sendKeys(fieldValues.get(0).get("Mobile Number"));
            //hooks.driver.findElement(By.name("email")).sendKeys(fieldValues.get(0).get("Email"));
            hooks.driver.findElement(By.name("password")).sendKeys(fieldValues.get(0).get("Password"));
            hooks.driver.findElement(By.name("confirmpassword")).sendKeys(fieldValues.get(0).get("Confirm Password"));
            System.out.println("All Data is entered");
            currentThread().sleep(10000);
        }
        Faker faker = new Faker();
        String email = faker.firstName();
        hooks.driver.findElement(By.name("email")).sendKeys(email + "@gmail.com");
    }
    @Given("I enter invalid details to below fields")
    public void invalid(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> fieldValues = dataTable.asMaps(String.class, String.class);
        for (int i = 0; i < fieldValues.size(); i++) {
            hooks.driver.findElement(By.name("firstname")).sendKeys(fieldValues.get(0).get("First Name"));
            hooks.driver.findElement(By.name("lastname")).sendKeys(fieldValues.get(0).get("Last Name"));
            hooks.driver.findElement(By.name("phone")).sendKeys(fieldValues.get(0).get("Mobile Number"));
            hooks.driver.findElement(By.name("email")).sendKeys(fieldValues.get(0).get("Email"));
            hooks.driver.findElement(By.name("password")).sendKeys(fieldValues.get(0).get("Password"));
            hooks.driver.findElement(By.name("confirmpassword")).sendKeys(fieldValues.get(0).get("Confirm Password"));
            System.out.println("All Data is entered");
            currentThread().sleep(10000);
        }
    }
    @When("I click Sign UP button")
    public void clickSignUp() throws InterruptedException {
        WebElement element = hooks.driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
        element.sendKeys(Keys.ENTER);
        System.out.println("Clicked on Sign up button");
        currentThread().sleep(10000);
    }
    @Then("new account must be created")
    public void newAccountCreated() {
        String url = hooks.driver.getCurrentUrl();
        System.out.println(url);
        assertEquals("https://www.phptravels.net/account/", url);
        System.out.println("New Account Created Successfully ");
    }
    @Then("User must be navigated to newly created account page")
    public void newlyCreatedAccountPage() {
        String userName = hooks.driver.findElement(By.xpath("//h3[text()='Hi, Test4 User4']")).getText();
        assertEquals("Hi, Test4 User4", userName);
        System.out.println("Navigated to newly created account page ");


    }
    @Then("I should get a error message")
    public void errorMessage() throws InterruptedException {
        currentThread().sleep(10000);

        String error = hooks.driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
        System.out.println(error);
        assertEquals("Email Already Exists.", error);
    }
}
