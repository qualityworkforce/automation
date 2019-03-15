package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hooks {

    public static WebDriver driver;

    @Before
    public void beforeScenarios() {
        System.setProperty("webdriver.chrome.driver", "/Users/ambichaliki/Documents/automation/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=uk");
        System.out.println("Before Scenario-Navigated to salesforce login page successfully ");

    }

    @After
    public void afterScenarios() {

        driver.quit();
        System.out.println("After Scenario-Closed browser successfully");
    }
}
