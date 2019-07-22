package com.ff.psa.steps;

import com.ff.psa.configurations.ConfigurationManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void beforeScenarios() {
        ConfigurationManager config = new ConfigurationManager();
        System.setProperty("webdriver.chrome.driver", "/Users/ambichaliki/Documents/automation/src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get(config.url);
    }

    @After
    public void afterScenarios() {
        driver.quit();
        System.out.println("After Scenario-Closed browser successfully");
    }
}
