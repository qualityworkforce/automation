package com.ff.psa.pageobjects;
import com.ff.psa.helpers.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPage {

    Helpers helpers;
    @FindBy(xpath = "//*[@id=\"home_Tab\"]")
    WebElement Home;
    private WebDriver driver;
    private WebDriverWait webDriverWait;
    public CommonPage(WebDriver driver){
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
        helpers = new Helpers();
    }

    public void verifyHomeButtonPresent()
    {
        this.Home.isDisplayed();
    }


}
