package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static junit.framework.TestCase.assertEquals;


public class testTags {

    @Given("It's time for lunch")
    public void it_s_time_for_lunch()
    {
        System.setProperty("webdriver.chrome.driver","/Users/ambichaliki/Documents/automation/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://bbc.co.uk");
       String url = driver.getCurrentUrl();
       System.out.println(url);
       assertEquals("https://www.bbc.co.uk/",url);
       driver.quit();
    }

    @When("I go out")
    public void i_go_out()
    {

    }

    @Then("I should take my card")
    public void i_should_take_my_card()
    {
    }
}
