package com.ff.psa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectPage {
    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public ProjectPage (WebDriver driver)
    {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Projects')]")
    WebElement projectsTab;

    @FindBy(xpath = "//input[@name='go']")
    WebElement go;

    @FindBy(xpath ="//span[contains(text(),'Proj1')]")
    WebElement project;

    @FindBy(xpath = "//td[@id='topButtonRow']//input[@name='gantt_pilot']")
    WebElement gantt;

    public void clickOnProjectsTab()
    {
        this.projectsTab.click();
    }

    public void clickOnGo()
    {
        this.go.click();
    }
    public void clickOnProjects()
    {
        this.project.click();
    }

    public void ganttButtonDisplayed()
    {
        this.gantt.isDisplayed();
    }

    public void ganttButtonClick()
    {
        this.gantt.click();
    }
}
