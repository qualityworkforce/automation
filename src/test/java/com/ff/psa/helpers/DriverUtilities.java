package com.ff.psa.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtilities {

    private WebDriverWait webDriverWait;

    public DriverUtilities(WebDriver driver){
        webDriverWait = new WebDriverWait(driver, 30);
    }

    public void enterText(WebElement element, String value) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        System.out.println("Cleared the text from the field");
        element.sendKeys(value);
        System.out.println("Entered the value into the text field");

    }

    public void clickButton(WebElement element) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        System.out.println("Clicked the button.");
    }


    public void verifyElementIsClickable(WebElement element) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void visibilityOfElement(WebElement element){
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public void novisibiltyOfLoadMask(WebElement element){

    }

}

