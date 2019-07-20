package com.ff.psa.pageobjects;
import com.ff.psa.helpers.DriverUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class CommonPage extends BaseClass {

    public CommonPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"home_Tab\"]")
    private WebElement Home;

    public void verifyHomeButtonPresent()
    {
        driverUtilities.visibilityOfElement(Home);
        this.Home.isDisplayed();
    }


}
