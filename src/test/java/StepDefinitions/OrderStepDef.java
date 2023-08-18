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
    @And("Click to button add to cart")
    public void sizes(){
        explicitlyWait(addtocart, CLICKABLE,10);
        getElement(addtocart).click();
    }
    @And("Scroll")
    public void scrolling(){
        scrollByWeb(0,250);
    }
    @And("Scroll 1250")
    public void scrollingmore(){
        scrollByWeb(0,1250);
    }
    @And("Select {string} size")
    public void selectGender(String size) {
        switch (size) {
            case "XS": {
                explicitlyWait(sizexs, CLICKABLE,10);
                getElement(sizexs).click();
                break;
            }
            case "S": {
                explicitlyWait(sizes, CLICKABLE,10);
                getElement(sizes).click();
                break;
            }
            case "M": {
                explicitlyWait(sizem, CLICKABLE,10);
                getElement(sizem).click();
                break;
            }
            case "L": {
                explicitlyWait(sizel, CLICKABLE,10);
                getElement(sizel).click();
                break;
            }
            case "XL": {
                explicitlyWait(sizexl, CLICKABLE,10);
                getElement(sizexl).click();
                break;
            }
        }
    }
    @Then("Check the {string} should be displayed")
    public void checkTheShouldBeDisplayed(String errorMessage) {
        explicitlyWait(ErrMsj, VISIBLE,10);
        Assert.assertEquals(errorMessage,getElement(ErrMsj).getText());

    }
    @And("{int} seconds wait")
    public void secondssWait(int seconds) {
        secondsWait(seconds);
    }

}
