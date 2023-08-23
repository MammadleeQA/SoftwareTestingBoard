package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static DriverHook.DriverConfig.driver;
import static POM.ConditionOptionEnum.*;
import static POM.FilterPOM.*;

public class FilterStepDef extends BaseMethods {

    @Given("Go to {string} page")
    public void goToPage(String url) {

        driver.get(url);
    }

    @And("Sign in with {string} e-mail and {string} password default credentials")
    public void signInDefaultAccount(String username, String password) {
        explicitlyWait(SIGN_IN_LINK, CLICKABLE, 10);
        getElement(SIGN_IN_LINK).click();
        explicitlyWait(LOGIN_USERNAME_INPUT, VISIBLE, 10);
        getElement(LOGIN_USERNAME_INPUT).sendKeys(username);
        getElement(LOGIN_PASSWORD_INPUT).sendKeys(password);
        getElement(LOGIN_BTN).click();
    }

    @Given("I am Magento user page")
    public void amIMagento_UserPage() {
        explicitlyWait(LOGGED_IN, VISIBLE, 10);
    }

    @Given("I am Magento Bags page")
    public void amIMagento_BagsPage() {
        explicitlyWait(FIRST_ITEM_LINK, VISIBLE, 10);
    }

    @Given("Grid-mode selected")
    public void isGridDefault() {
        explicitlyWait(TOOLBAR_LAST_NUMBER, VISIBLE, 12);
        Assert.assertEquals("12", getElement(TOOLBAR_LAST_NUMBER).getText());
    }

    @Given("List-mode selected")
    public void didListSelect() {
        explicitlyWait(TOOLBAR_LAST_NUMBER, VISIBLE, 10);
        Assert.assertEquals("10", getElement(TOOLBAR_LAST_NUMBER).getText());
    }

    @Given("Click List-Switcher")
    public void clickListSwitcher() {
        explicitlyWait(LIST_SWITCHER, VISIBLE, 10);
        getElement(LIST_SWITCHER).click();
    }

    @Given("Click Grid-Switcher")
    public void clickGridSwitcher() {
        explicitlyWait(GRID_SWITCHER, VISIBLE, 10);
        getElement(GRID_SWITCHER).click();
    }

    @Given("Click sort list")
    public void clickSortList(){
        explicitlyWait(SORT_LIST, VISIBLE, 10);
        getElement(SORT_LIST).click();
    }

    @And("Click Position Sort")
    public void clickPositionSort(){
        explicitlyWait(POSITION_SORT_SWITCHER, VISIBLE, 10);
        getElement(POSITION_SORT_SWITCHER).click();
    }

    @When("Click Product Name Sort")
    public void clickProductNameSort(){
        explicitlyWait(PRODUCT_NAME_SORT_SWITCHER, VISIBLE, 10);
        getElement(PRODUCT_NAME_SORT_SWITCHER).click();
    }

    @When("Click Price Sort")
    public void clickPriceSort(){
        explicitlyWait(PRICE_SORT_SWITCHER, VISIBLE, 10);
        getElement(PRICE_SORT_SWITCHER).click();
    }

    @Given("Position Sort selected")
    public void isSortedByPosition(){
        explicitlyWait(FIRST_ITEM, VISIBLE, 10);
        Assert.assertEquals(
                getElement(LISTED_PRODUCTS_COUNT).getText(),
                getElement(FIRST_ITEM).getAttribute("data-product-id")
        );
    }

    @Then("Product Name Sort selected")
    public void isSortedByProductName(){

        explicitlyWait(PRODUCT_ITEMS, VISIBLE, 10);

        secondsWait(3);

        List <WebElement> elements = getElements(PRODUCT_ITEMS);

        List<String> productItemName_List = new ArrayList<>();

        int i = 0;
        for (WebElement element : elements){

            productItemName_List.add(i,element.getText());
            i++;
        }

        List<String> productItemName_SortedList_ABC = new ArrayList<>(productItemName_List);

        Collections.sort(productItemName_SortedList_ABC);

        Assert.assertEquals(productItemName_SortedList_ABC,productItemName_List);

    }

    @Then("Price Sort selected")
    public void isSortedByPrice(){

        explicitlyWait(PRODUCT_ITEMS_PRICES, VISIBLE, 10);

        secondsWait(2);

        List<WebElement> elements = getElements(PRODUCT_ITEMS_PRICES);
        List<Double> productItemsPrices_List = new ArrayList<>();

        int max = 0;

        if ("12".equals(getElement(TOOLBAR_LAST_NUMBER).getText())){
            max = 12;
        } else if ("10".equals(getElement(TOOLBAR_LAST_NUMBER).getText())){
            max = 10;
        }

        int i = 0;

        //System.out.println(elements.size());
        //secondsWait(3);

        for (WebElement element : elements){

            if (i==max){
                break;
            }
            productItemsPrices_List.add(i, Double.parseDouble(element.getText().substring(1)));
            i++;
        }

        //System.out.println(productItemsPrices_List.size());
        //secondsWait(3);

        List<Double> productItemPrice_SortedList = new ArrayList<>(productItemsPrices_List);

        Collections.sort(productItemPrice_SortedList);

        Assert.assertEquals(productItemPrice_SortedList,productItemsPrices_List);

    }

    @Given("Current pagination is First")
    public void isCurrentPaginationFirst(){
        explicitlyWait(PAGINATION_CURRENT_NUMBER_BUTTON, VISIBLE, 10);

        String textElement = getElement(PAGINATION_CURRENT_NUMBER_BUTTON).getText();
        String actualResult = textElement.substring(textElement.length()-1);

        Assert.assertEquals("1", actualResult);
    }

    @Then("Current pagination is Second")
    public void isCurrentPaginationSecond(){
        secondsWait(2);
        explicitlyWait(PAGINATION_CURRENT_NUMBER_BUTTON, VISIBLE, 10);

        String textElement = getElement(PAGINATION_CURRENT_NUMBER_BUTTON).getText();
        String actualResult = textElement.substring(textElement.length()-1);

        Assert.assertEquals("2", actualResult);
    }

    @Given("Click first pagination number")
    public void clickFirstPaginationNumber(){
        explicitlyWait(PAGINATION_NUMBER_BUTTON, CLICKABLE, 10);
        getElement(PAGINATION_NUMBER_BUTTON).click();
    }

    @Given("Click Previous pagination button")
    public void clickPreviousPaginationButton(){
        explicitlyWait(PAGINATION_PREVIOUS_BUTTON, CLICKABLE, 10);
        getElement(PAGINATION_PREVIOUS_BUTTON).click();
    }

    @Given("Click Next pagination button")
    public void clickNextPaginationButton(){
        explicitlyWait(PAGINATION_NEXT_BUTTON, CLICKABLE, 10);
        getElement(PAGINATION_NEXT_BUTTON).click();
    }

    @Given("Click second pagination number")
    public void clickSecondPaginationNumber(){
        explicitlyWait(PAGINATION_NUMBER_BUTTON, CLICKABLE, 10);
        getElement(PAGINATION_NUMBER_BUTTON).click();
    }

    @Given("Current Limiter Option is 12")
    public void isCurrentLimiter12(){
        explicitlyWait(PRODUCT_ITEM_COUNT_LIMITER_CURRENT, VISIBLE, 10);

        Assert.assertEquals("12",getElement(PRODUCT_ITEM_COUNT_LIMITER_CURRENT).getAttribute("value"));
    }

    @Given("Click Limiter")
    public void clickProductCountLimiter(){
        explicitlyWait(PRODUCT_ITEM_COUNT_LIMITER, CLICKABLE, 10);
        getElement(PRODUCT_ITEM_COUNT_LIMITER).click();
    }

    @And("Click Limiter Option 12")
    public void clickProductCountLimiterOption_12(){
        explicitlyWait(PRODUCT_ITEM_COUNT_LIMITER_OPTION_12, CLICKABLE, 10);
        getElement(PRODUCT_ITEM_COUNT_LIMITER_OPTION_12).click();
    }

    @When("Click Limiter Option 24")
    public void clickProductCountLimiterOption_24(){
        explicitlyWait(PRODUCT_ITEM_COUNT_LIMITER_OPTION_24, CLICKABLE, 10);
        getElement(PRODUCT_ITEM_COUNT_LIMITER_OPTION_24).click();
    }

    @When("Click Limiter Option 36")
    public void clickProductCountLimiterOption_36(){
        explicitlyWait(PRODUCT_ITEM_COUNT_LIMITER_OPTION_36, CLICKABLE, 10);
        getElement(PRODUCT_ITEM_COUNT_LIMITER_OPTION_36).click();
    }

    @Then("Current Limiter Option is 24")
    public void isCurrentLimiter24(){
        explicitlyWait(PRODUCT_ITEM_COUNT_LIMITER_CURRENT, VISIBLE, 10);

        Assert.assertEquals("24",getElement(PRODUCT_ITEM_COUNT_LIMITER_CURRENT).getAttribute("value"));
    }

    @Then("Current Limiter Option is 36")
    public void isCurrentLimiter36(){
        explicitlyWait(PRODUCT_ITEM_COUNT_LIMITER_CURRENT, VISIBLE, 10);

        Assert.assertEquals("36",getElement(PRODUCT_ITEM_COUNT_LIMITER_CURRENT).getAttribute("value"));
    }







}


