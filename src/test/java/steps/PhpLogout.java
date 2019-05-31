package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.lang.Thread.currentThread;
import static org.junit.Assert.assertEquals;

public class PhpLogout {

    @Given("I am logged into PHP Travels site")
    public void login() throws InterruptedException {

        hooks.driver.get("https://www.phptravels.net/login");
        Thread.sleep(2000);
        hooks.driver.findElement(By.name("username")).sendKeys("999.ambi@gmail.com");
        hooks.driver.findElement(By.name("password")).sendKeys("Test1234");
        hooks.driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
        Thread.sleep(2000);
    }

    @When("I click Logout button")
    public void ClickOnlogOut() throws InterruptedException {
        selectValue("logout");
    }



    @Then("User must be redirected to login Page")
    public void user_must_be_redirected_to_login_Page() {
     String url =hooks.driver.getCurrentUrl();
     System.out.println(url);
     assertEquals("https://www.phptravels.net/login",url);
    }

    private void selectValue(String optionValue){
        WebElement dropDown = hooks.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/ul/li[1]/ul"));
        List<WebElement> options = dropDown.findElements(By.xpath("li/a"));
        for(WebElement option : options){
            if(option.getAttribute("href").contains(optionValue)){
                ((JavascriptExecutor)hooks.driver).executeScript("arguments[0].click()",option);
                break;
            }
        }
    }

}

