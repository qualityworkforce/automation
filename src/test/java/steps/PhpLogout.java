package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import static java.lang.Thread.currentThread;
import static org.junit.Assert.assertEquals;

public class PhpLogout {

    @Given("I am logged into PHP Travels site")
    public void login() throws InterruptedException {

        hooks.driver.get("https://www.phptravels.net/login");
        Thread.sleep(10000);

        hooks.driver.findElement(By.name("username")).sendKeys("999.ambi@gmail.com");
        hooks.driver.findElement(By.name("password")).sendKeys("Test1234");
        hooks.driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
        Thread.sleep(10000);

    }

    @When("I click Logout button")
    public void ClickOnlogOut() throws InterruptedException {
        Thread.sleep(10000);
        hooks.driver.findElement(By.xpath("//ul/li/a/i[@class='icon_set_1_icon-70 go-right']']"));
        Thread.sleep(10000);
        //hooks.driver.findElement(By.xpath("//li[@class='open']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Logout')]")).click();

    }

    @Then("I expect user must be logged out")
    public void LogOut() {

    }

    @Then("User must be redirected to login Page")
    public void user_must_be_redirected_to_login_Page() {
        // Write code here that turns the phrase above into concrete actions
    }

}
