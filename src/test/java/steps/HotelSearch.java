package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.currentThread;

public class HotelSearch {

    @Given("I click on hotel tab")
    public void i_click_on_hotel_tab() throws InterruptedException {
        hooks.driver.findElement(By.xpath("//span[contains(text(),'Hotels')]")).click();
        currentThread().sleep(2000);

    }

    @Given("I enter the city name")
    public void i_enter_the_city_name_as_from_Country() throws InterruptedException{


//        String searchEnabler = "//div[@class='tab-content shad RTL_shad search-form']";
//
//        WebDriverWait wait = new WebDriverWait(hooks.driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchEnabler)));
//
//        hooks.driver.findElement(By.xpath(searchEnabler)).click();
//        System.out.println("done it");

        //  hooks.driver.findElement(By.xpath("//div[@id='select2-drop']//div[@class='select2-search']")).sendKeys(cityName);


//        try {
            WebElement search = hooks.driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-12 go-text-right go-right form-group bgwhite h60']"));
//        Actions act = new Actions(hooks.driver);
//        act.moveToElement(hooks.driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-12 go-text-right go-right form-group bgwhite h60']"))).click().build().perform();
            search.click();
            hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

           String searchForm = "#body-section > section > div.cell > div > div > div.col-md-12 > div";

           // hooks.driver.findElement(By.cssSelector(searchForm)).click();



        WebDriverWait wait = new WebDriverWait(hooks.driver, 30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(searchForm)));

        WebElement input = hooks.driver.findElement(By.xpath("//div[@class=\"select2-search\"]//input[@type=\"text\"]"));
        input.click();
            String cityName = "Hyderabad";

            input.sendKeys(cityName);


           // String js = "arguments[0].setAttribute('value','" + cityName + "')";

            //((JavascriptExecutor) hooks.driver).executeScript(js, input);

           currentThread().sleep(10000);




//        } catch (NoSuchElementException e) {
//            System.out.println(e.getMessage());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


    }
}
