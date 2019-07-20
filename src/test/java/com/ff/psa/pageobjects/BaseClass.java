package com.ff.psa.pageobjects;

import com.ff.psa.helpers.ConfigurationManager;
import com.ff.psa.helpers.DriverUtilities;
import com.ff.psa.steps.Hooks;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    WebDriver driver = Hooks.driver;
    DriverUtilities driverUtilities = new DriverUtilities(driver);
    public ConfigurationManager config = new ConfigurationManager();
}

