package com.ff.psa.pageobjects;

import com.ff.psa.helpers.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GanttPage {

    private WebDriverWait webDriverWait;
    private WebDriver driver;
    Helpers helpers;

    public GanttPage(WebDriver driver) {

        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
        helpers = new Helpers();
    }

    @FindBy(xpath = "//div[@id='ganttappheaderbar-1009-title-iconEl']")
    WebElement ganttLogo;

    @FindBy(xpath ="")
    WebElement loadMask;

    @FindBy(xpath = "//span[@id='button-1041-btnIconEl']")
    WebElement newTask;

    @FindBy(xpath = "//span[@id='button-1012-btnInnerEl']")
    WebElement save;


    public void verifyGanttLogo()
    {
        this.ganttLogo.isDisplayed();
        Helpers.waitForLoadMaskToDissappear(driver,30,"//div[@id='loadmask-1057-msgEl']");
    }

    public void addNewTask()
    {
        this.newTask.isEnabled();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Helpers.clickButtonByXpath(driver, 30, "//span[@id='button-1041-btnIconEl']");
    }

    public void saveChanges()
    {
        this.save.click();
    }


}
