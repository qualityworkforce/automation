package com.ff.psa.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers {

   static String loc = ("//input[@id='username']");
   static String pass = "//input[@id='password']";
   static String login = "//input[@id='Login']";
   static String project ="//a[contains(text(),'Projects')]";
   static String go ="//input[@name='go']";
   static String proj ="//div/a/span[contains(text(),'Proj1')]";
   static String ganttbutton ="//input[@name='gantt_pilot']";
   static String newTask="//span[@id='button-1041-btnIconEl']";
   static String ganttLogo ="//div[@id='ganttappheaderbar-1009-title-iconEl']";
   static String save ="//span[@id='button-1012-btnInnerEl']";


   public static void enterTextByXpath(WebDriver driver, int timeout, String locator, String value){
        WebElement ele = driver.findElement(By.xpath(locator));
        new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(ele));
            ele.sendKeys(value);
    }
    public static void clickButtonByXpath(WebDriver driver, int timeout, String loc){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(loc)));
        WebElement ele = driver.findElement(By.xpath(loc));
        ele.click();
    }
    public static void verifyElementIsPresent(WebDriver driver, int timeout , String loc) {
        WebDriverWait wait =new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc)));
    }
    public static void verifyElementOIsClickable(WebDriver driver, int timeout , String newTask) {
        WebDriverWait wait =new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(newTask)));
    }

}

