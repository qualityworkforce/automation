//package com.ff.psa.steps.php;
//
//import com.ff.psa.steps.salesforce.AddingTasksSteps.Hooks;
//import cucumber.api.java.en.Given;
//import org.openqa.selenium.*;
//import org.openqa.selenium.interactions.Actions;
//
//import static java.lang.Thread.currentThread;
//
//public class HotelSearch {
//
////    Alert newA = Hooks.driver.
//
//
//    @Given("I click on hotel tab")
//    public void i_click_on_hotel_tab() throws InterruptedException {
//        Hooks.driver.findElement(By.xpath("//span[contains(text(),'Hotels')]")).click();
//        currentThread().sleep(2000);
//
//    }
//
//    @Given("I enter the city name")
//    public void i_enter_the_city_name_as_from_Country() throws InterruptedException{
//        WebElement search = Hooks.driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-12 go-text-right go-right form-group bgwhite h60']"));
//
//
//        Actions act = new Actions(Hooks.driver);
//        System.out.println("This is done ");
//        act.moveToElement(search).click().sendKeys("Hyderabad");
//        System.out.println("This is done 1");
//
//
//
//
////        String searchEnabler = "//div[@class='tab-content shad RTL_shad search-form']";
////
////        WebDriverWait wait = new WebDriverWait(Hooks.driver, 10);
////        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchEnabler)));
////
////        Hooks.driver.findElement(By.xpath(searchEnabler)).click();
////        System.out.println("done it");
//
//        //  Hooks.driver.findElement(By.xpath("//div[@id='select2-drop']//div[@class='select2-search']")).sendKeys(cityName);
//
//
//
//
////            WebElement search = Hooks.driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-12 go-text-right go-right form-group bgwhite h60']"));
////            search.click();
////            Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////            String searchForm = "#body-section > section > div.cell > div > div > div.col-md-12 > div";
////            Hooks.driver.findElement(By.cssSelector(searchForm)).click();
//
//
//
////        WebDriverWait wait = new WebDriverWait(Hooks.driver, 30);
////        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(searchForm)));
////
////        WebElement input = Hooks.driver.findElement(By.xpath("//div[@class=\"select2-search\"]//input[@type=\"text\"]"));
////        input.click();
////            String cityName = "Hyderabad";
////
////            input.sendKeys(cityName);
////
////
////           String js = "arguments[0].setAttribute('value','" + cityName + "')";
////
////           ((JavascriptExecutor) Hooks.driver).executeScript(js, input);
////
////           currentThread().sleep(10000);
////
//
//
//
//
////        } catch (NoSuchElementException e) {
////            System.out.println(e.getMessage());
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//
//
//    }
//}
