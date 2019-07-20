package com.ff.psa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='Login']")
    private WebElement loginButton;

    public void enterUserName(String value){
        driverUtilities.enterText(userName, value);
    }

    public void enterPassword(String value){
        driverUtilities.enterText(password, value);
    }

    public void clickLoginButton(){
        driverUtilities.clickButton(loginButton);
//        driverUtilities.verifyElementIsPresent("//*[@id=\"home_Tab\"]");
    }

    public String getPageTitle() {

        return driver.getTitle();
    }

}
