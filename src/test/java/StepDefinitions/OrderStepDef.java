package StepDefinitions;

import io.cucumber.java.en.*;

import static DriverHook.DriverConfig.driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import static POM.ConditionOptionEnum.*;
import static POM.OrderPOM.*;

public class OrderStepDef extends BaseMethods {
    @Given("Goo to {string} page")
    public void goToPage(String url) {
        driver.get(url);
    }
    @Given("I am in maestro page")
    public void maestropage() {
        Assert.assertEquals("https://magento.softwaretestingboard.com/", driver.getCurrentUrl());
    }
    @When("Click men button")
    public void menclick(){
        explicitlyWait(menbtn, CLICKABLE,10);
        getElement(menbtn).click();
    }
    @Then("Click men's tops button")
    public void mentopsclick(){
        explicitlyWait(tops, CLICKABLE,10);
        getElement(tops).click();
    }
    @And("Click first picture")
    public void menspic(){
        explicitlyWait(firststpic, CLICKABLE,10);
        getElement(firststpic).click();
    }
    @And("Select size S")
    public void sizes(){
        explicitlyWait(sizeS, CLICKABLE,10);
        getElement(sizeS).click();
    }
    @And("Scroll")
    public void scrolling(){
        scrollByWeb(0,250);
    }
    @And("Scroll 1250")
    public void scrollingmore(){
        scrollByWeb(0,1250);
    }


    @And("{int} seconds wait")
    public void secondssWait(int seconds) {
        secondsWait(seconds);
    }

}
