package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hooks {

    public static WebDriver driver;

    @Before
    public void beforeScenarios() {
       System.setProperty("webdriver.chrome.driver", "/Users/ambichaliki/Documents/automation/src/main/resources/chromedriver");
       driver = new ChromeDriver();
        //driver.get("https://login.salesforce.com/?locale=uk");
        //driver.get("https://www.eenadu.net/");
        driver.get("https://www.phptravels.net");

//        System.setProperty("webdriver.gecko.driver", "/Users/ambichaliki/Documents/automation/src/main/resources/geckodriver");
//         driver = new FirefoxDriver();
//         driver.get("https://eenadu.net");
//        System.out.println("Navigated to Eenadu successfully  ");

    }

    @After
    public void afterScenarios() {

       driver.quit();
        System.out.println("After Scenario-Closed browser successfully");
    }
}
