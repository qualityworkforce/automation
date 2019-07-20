package com.ff.psa.steps;

import com.ff.psa.pageobjects.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BaseClass {

    public static WebDriver driver;

    @Before
    public void beforeScenarios() {
        driver.get("https://login.salesforce.com/?locale=uk");
        System.out.println("Start the scenario.");
    }

    @After
    public void afterScenarios() {
        driver.quit();
        System.out.println("After Scenario-Closed browser successfully");
    }

    public WebDriver initBrowser(){
        System.setProperty("webdriver.chrome.driver", "/Users/ambichaliki/Documents/automation/src/main/resources/chromedriver");
       return driver = new ChromeDriver();
    }
}
