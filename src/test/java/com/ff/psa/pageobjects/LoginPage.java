package com.ff.psa.pageobjects;

import com.ff.psa.configurations.ConfigurationManager;
import com.ff.psa.helpers.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait webDriverWait;
    Helpers helpers;
    ConfigurationManager config = new ConfigurationManager();

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
        helpers = new Helpers();
    }

    @FindBy(xpath = "//input[@id='username']")
    WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='Login']")
    WebElement loginButton;

    public void enterUserName()
    {
        this.userName.clear();
        this.userName.sendKeys(config.username);
    }

    public void enterPassword()
    {
        this.password.clear();
        this.password.sendKeys(config.password);
    }

    public void clickLoginButton()
    {
        this.loginButton.click();
        helpers.verifyElementIsPresent(driver, 30, "//*[@id=\"home_Tab\"]");
    }

    public String getPageTitle()
    {
       return driver.getTitle();
    }
}
