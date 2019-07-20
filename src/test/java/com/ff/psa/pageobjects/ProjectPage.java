package com.ff.psa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class ProjectPage extends BaseClass {

    public ProjectPage () {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Projects')]")
    private WebElement projectsTab;

    @FindBy(xpath = "//input[@name='go']")
    private WebElement go;

    @FindBy(xpath ="//span[contains(text(),'Proj1')]")
    private WebElement project;

    @FindBy(xpath = "//td[@id='topButtonRow']//input[@name='gantt_pilot']")
    private WebElement gantt;

    public void clickOnProjectsTab()
    {
        driverUtilities.clickButton(projectsTab);
    }

    public void clickOnGo()
    {
        driverUtilities.clickButton(go);
    }
    public void clickOnProjects()
    {
        driverUtilities.clickButton(project);
    }

    public void ganttButtonDisplayed()
    {
        driverUtilities.visibilityOfElement(gantt);
    }

    public void ganttButtonClick()
    {
        driverUtilities.clickButton(gantt);
    }

}
