package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.*;


public class NavigateToEenadu {


    @Given("I enter valid url for Eenadu paper")
    public void i_enter_valid_url_for_Eenadu_paper()
    {
        System.out.println("This is done in Hooks ");
    }

    @When("I click enter")
    public void i_click_enter()
    {
        System.out.println("This is also done in Hooks");
    }

    @Then("Eenadu paper homepage must be displayed")
    public void eenadu_paper_homepage_must_be_displayed()
    {
        List<WebElement> lis = hooks.driver.findElements(By.xpath("//div[@class='menu']/ul/li"));
for(WebElement ele :lis) {
    System.out.println(ele.getText());
    System.out.println(lis.size());
}
//        String ele = hooks.driver.getTitle();
//        System.out.println(ele);
//        assertEquals("EENADU Online Edition - Telugu news paper", ele);


    }
}
