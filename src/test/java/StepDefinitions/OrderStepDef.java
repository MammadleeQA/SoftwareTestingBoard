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
    @When("Click women button")
    public void womenclick(){
        explicitlyWait(womenbtn, CLICKABLE,10);
        getElement(womenbtn).click();
    }

    @Then("Click men's tops button")
    public void mentopsclick(){
        explicitlyWait(tops, CLICKABLE,10);
        getElement(tops).click();
    }
    @Then("Click women's tops button")
    public void womentopsclick(){
        explicitlyWait(tops, CLICKABLE,10);
        getElement(tops).click();
    }
    @Then("Click women's jackets button")
    public void womenjacketsclick(){
        explicitlyWait(jackets, CLICKABLE,10);
        getElement(jackets).click();
    }
    @And("Click first picture")
    public void menspic(){
        explicitlyWait(firststpic, CLICKABLE,10);
        getElement(firststpic).click();
    }
    @And("Click updatefourth button")
    public void updatefour(){
        explicitlyWait(updatefourth, CLICKABLE,10);
        getElement(updatefourth).click();
    }
    @And("Click removefourth button")
    public void removefour(){
        explicitlyWait(removefourth, CLICKABLE,10);
        getElement(removefourth).click();
    }
    @And("Click update cart button")
    public void updatecart(){
        explicitlyWait(updatcart, CLICKABLE,10);
        getElement(updatcart).click();
    }
    @And("Click second picture")
    public void menspic2(){
        explicitlyWait(secondpic, CLICKABLE,10);
        getElement(secondpic).click();
    }
    @And("Click third picture")
    public void womenthird(){
        explicitlyWait(thirdpic, CLICKABLE,10);
        getElement(thirdpic).click();
    }
    @And("Click fourth picture")
    public void womenfourth(){
        explicitlyWait(fourthpic, CLICKABLE,10);
        getElement(fourthpic).click();
    }
    @And("Click to button add to cart")
    public void sizes(){
        explicitlyWait(addtocart, CLICKABLE,10);
        getElement(addtocart).click();
    }
    @And("Click to basket")
    public void basket(){
        explicitlyWait(basket, CLICKABLE,10);
        getElement(basket).click();
    }
    @And("Click to view basket")
    public void viewbasket1(){
        explicitlyWait(viewbasket, CLICKABLE,10);
        getElement(viewbasket).click();
    }
    @And("Scroll {int}")
    public void scrolling(int num){
        scrollByWeb(0,num);
    }
    @And("Select {string} size")
    public void selectsize(String size) {
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

    @And("Select {string} colour")
    public void selectcolour(String colour) {
        switch (colour) {
            case "red": {
                explicitlyWait(red, CLICKABLE, 10);
                getElement(red).click();
                break;
            }
            case "white": {
                explicitlyWait(white, CLICKABLE, 10);
                getElement(white).click();
                break;
            }
            case "blue": {
                explicitlyWait(blue, CLICKABLE, 10);
                getElement(blue).click();
                break;
            }
            case "gray": {
                explicitlyWait(gray, CLICKABLE, 10);
                getElement(gray).click();
                break;
            }
            case "black": {
                explicitlyWait(black, CLICKABLE, 10);
                getElement(black).click();
                break;
            }
            case "green": {
                explicitlyWait(green, CLICKABLE, 10);
                getElement(green).click();
                break;
            }
            case "purple": {
                explicitlyWait(purple, CLICKABLE, 10);
                getElement(purple).click();
                break;
            }
        }
    }
            @Then("Check the {string} for size should be displayed")
    public void checkTheShouldBeDisplayed(String errorMessage) {
        explicitlyWait(ErrMsj, VISIBLE,10);
        Assert.assertEquals(errorMessage,getElement(ErrMsj).getText());

    }
    @Then("Check the {string} for colour should be displayed")
    public void checkTheShouldBeDisplayed2(String errorMessage) {
        explicitlyWait(ErrMsj2, VISIBLE,10);
        Assert.assertEquals(errorMessage,getElement(ErrMsj2).getText());

    }
    @Then("Check the {string} for success should be displayed")
    public void checkTheShouldBeDisplayed3(String success) {
        explicitlyWait(succesmsj, VISIBLE,10);
        Assert.assertEquals(success,getElement(succesmsj).getText());

    }
    @Then("Check the {string} for success 2 should be displayed")
    public void checkTheShouldBeDisplayed4(String success) {
        explicitlyWait(succesmsj2, VISIBLE,10);
        Assert.assertEquals(success,getElement(succesmsj2).getText());

    }
    @And("{int} seconds wait")
    public void secondssWait(int seconds) {
        secondsWait(seconds);
    }

}
