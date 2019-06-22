package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class hooks {

    public static WebDriver driver;
    @Before
    public void beforeScenarios() {
        System.setProperty("webdriver.chrome.driver", "/Users/ambichaliki/Documents/automation/src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=uk");
        //driver.get("https://www.eenadu.net/");
        //driver.get("https://www.phptravels.net");
    }
    @After
    public void afterScenarios() {
        driver.quit();
        System.out.println("After Scenario-Closed browser successfully");
    }
}
