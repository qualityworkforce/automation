//package com.ff.psa.steps.php;
//
//import com.ff.psa.steps.salesforce.AddingTasksSteps.Hooks;
//import com.github.javafaker.Faker;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import java.util.List;
//import java.util.Map;
//import static java.lang.Thread.currentThread;
//import static org.junit.Assert.assertEquals;
//
//
//public class PhpRegistration {
//
//    @Given("I navigate to PHP Travels Sing up page")
//    public void phpSignPage() {
//        Hooks.driver.get("https://www.phptravels.net/register");
//       String url= Hooks.driver.getCurrentUrl();
//        Assert.assertEquals("https://www.phptravels.net/register",url);
//        Hooks.driver.manage().window().maximize();
//    }
//    @Given("I enter valid details to below fields")
//    public void valid(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
//        List<Map<String, String>> fieldValues = dataTable.asMaps(String.class, String.class);
//        for (int i = 0; i < fieldValues.size(); i++) {
//            Hooks.driver.findElement(By.name("firstname")).sendKeys(fieldValues.get(0).get("First Name"));
//            Hooks.driver.findElement(By.name("lastname")).sendKeys(fieldValues.get(0).get("Last Name"));
//            Hooks.driver.findElement(By.name("phone")).sendKeys(fieldValues.get(0).get("Mobile Number"));
//            //Hooks.driver.findElement(By.name("email")).sendKeys(fieldValues.get(0).get("Email"));
//            Hooks.driver.findElement(By.name("password")).sendKeys(fieldValues.get(0).get("Password"));
//            Hooks.driver.findElement(By.name("confirmpassword")).sendKeys(fieldValues.get(0).get("Confirm Password"));
//            System.out.println("All Data is entered");
//            currentThread().sleep(10000);
//        }
//        Faker faker = new Faker();
//        String email = faker.firstName();
//        Hooks.driver.findElement(By.name("email")).sendKeys(email + "@gmail.com");
//    }
//    @Given("I enter invalid details to below fields")
//    public void invalid(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
//        List<Map<String, String>> fieldValues = dataTable.asMaps(String.class, String.class);
//        for (int i = 0; i < fieldValues.size(); i++) {
//            Hooks.driver.findElement(By.name("firstname")).sendKeys(fieldValues.get(0).get("First Name"));
//            Hooks.driver.findElement(By.name("lastname")).sendKeys(fieldValues.get(0).get("Last Name"));
//            Hooks.driver.findElement(By.name("phone")).sendKeys(fieldValues.get(0).get("Mobile Number"));
//            Hooks.driver.findElement(By.name("email")).sendKeys(fieldValues.get(0).get("Email"));
//            Hooks.driver.findElement(By.name("password")).sendKeys(fieldValues.get(0).get("Password"));
//            Hooks.driver.findElement(By.name("confirmpassword")).sendKeys(fieldValues.get(0).get("Confirm Password"));
//            System.out.println("All Data is entered");
//            currentThread().sleep(10000);
//        }
//    }
//    @When("I click Sign UP button")
//    public void clickSignUp() throws InterruptedException {
//        WebElement element = Hooks.driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
//        element.sendKeys(Keys.ENTER);
//        System.out.println("Clicked on Sign up button");
//        currentThread().sleep(10000);
//    }
//    @Then("new account must be created")
//    public void newAccountCreated() {
//        String url = Hooks.driver.getCurrentUrl();
//        System.out.println(url);
//        assertEquals("https://www.phptravels.net/account/", url);
//        System.out.println("New Account Created Successfully ");
//    }
//    @Then("User must be navigated to newly created account page")
//    public void newlyCreatedAccountPage() {
//        String userName = Hooks.driver.findElement(By.xpath("//h3[text()='Hi, Test4 User4']")).getText();
//        assertEquals("Hi, Test4 User4", userName);
//        System.out.println("Navigated to newly created account page ");
//
//
//    }
//    @Then("I should get a error message")
//    public void errorMessage() throws InterruptedException {
//        currentThread().sleep(10000);
//
//        String error = Hooks.driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
//        System.out.println(error);
//        assertEquals("Email Already Exists.", error);
//    }
//}
