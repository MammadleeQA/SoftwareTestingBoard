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
    @And("{int} seconds wait")
    public void secondssWait(int seconds) {
        secondsWait(seconds);
    }

}
