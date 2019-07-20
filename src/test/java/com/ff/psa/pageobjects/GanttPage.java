package com.ff.psa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class GanttPage extends BaseClass {

    public GanttPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='ganttappheaderbar-1009-title-iconEl']")
    private WebElement ganttLogo;

    @FindBy(xpath = "//span[@id='button-1041-btnIconEl']")
    private WebElement newTask;

    @FindBy(xpath = "//span[@id='button-1012-btnInnerEl']")
    private WebElement save;

    @FindBy(xpath = "//span[@id='button-1042-btnIconEl']")
    private WebElement delete;

    @FindBy(xpath = "//div[@id='loadmask-1057-msgEl']")
    private WebElement loadMask;


    public void verifyGanttLogo()
    {
        driverUtilities.visibilityOfElement(ganttLogo);
        driverUtilities.verifyElementIsClickable(newTask);
    }

    public void addNewTask() {
        driverUtilities.novisibiltyOfLoadMask(loadMask);
        driverUtilities.verifyElementIsClickable(newTask);
            driverUtilities.clickButton(newTask);
        }

        public void saveChanges()
        {
            driverUtilities.novisibiltyOfLoadMask(loadMask);
            driverUtilities.clickButton(save);
        }

        public void deleteTask() throws InterruptedException {
            driverUtilities.visibilityOfElement(delete);
            driverUtilities.verifyElementIsClickable(delete);
            driverUtilities.novisibiltyOfLoadMask(loadMask);
            driverUtilities.clickButton(delete);
            driverUtilities.novisibiltyOfLoadMask(loadMask);
            driverUtilities.clickButton(save);
    }
}
