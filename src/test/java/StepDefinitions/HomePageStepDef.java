package  StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static DriverHook.DriverConfig.driver;
import static POM.ConditionOptionEnum.CLICKABLE;
import static POM.ConditionOptionEnum.VISIBLE;
import static POM.HomePagePOM.*;

public class HomePageStepDef extends BaseMethods{
    @And("Click on {string}")

    public void clickOnButton(String action){
        By btn = By.cssSelector(action);
        getElement(btn).click();
    }


    @And("Scroll Left To Right to {int} , Top To Bottom to {int}")
    public void Scrolling(int leftToRight, int topToBottom){
        scrollByWeb(leftToRight, topToBottom);
    }

    @And("Wait {int} seconds")
    public  void WaitForSeconds(int seconds){
        secondsWait(seconds);
    }

    @And("Click on Shop New Yoga")
    public void ClickOnShopNYBtn() {
        explicitlyWait(CLICK_ON_SHOPNY_BTN,CLICKABLE,5);
        getElement(CLICK_ON_SHOPNY_BTN).click();

    }

    @And("Click on Micro Sleeve Top")
    public void SelectEquipment(){
        explicitlyWait(MICRO_SLIVE_TOP,CLICKABLE,5);
        getElement(MICRO_SLIVE_TOP).click();}

    @And("Click Add to Card button")
    public void ClickAddToCardBTN(){
        explicitlyWait(ADD_TO_CARD_BTN,CLICKABLE,5);
        getElement(ADD_TO_CARD_BTN).click();
    }

    @And("Click on Shop Pants")
    public void ClickToOffBtn(){
        explicitlyWait(CLICK_ON_SHOP_PANTS,CLICKABLE,5);
        getElement(CLICK_ON_SHOP_PANTS).click();}

    @And("Click on Bardot Capri")
    public void ClickOnBardotCapri(){
        explicitlyWait(CLICK_ON_BARDOT_CAPRI,CLICKABLE,5);
        getElement(CLICK_ON_BARDOT_CAPRI).click();}

    @And("Click on 28 Size")
    public void ClickOnSize(){
        explicitlyWait(CLICK_ON_28_SIZE,CLICKABLE,5);
        getElement(CLICK_ON_28_SIZE).click();}

    @And("Click on red Color")
    public void ClickOnRedColor(){
        explicitlyWait(CLICK_ON_RED_COLOR,CLICKABLE,5);
        getElement(CLICK_ON_RED_COLOR).click();}

    @And("Click on Shop Tees")
    public void ClickOnShopTees(){
        explicitlyWait(CLICK_ON_SHOP_TEES,CLICKABLE,5);
        getElement(CLICK_ON_SHOP_TEES).click();}

    @And("Click on Diva Gym Tee")
    public void ClickOnDivaGymTee(){
        explicitlyWait(CLICK_ON_DIVA_GYM_TEE,CLICKABLE,5);
        getElement(CLICK_ON_DIVA_GYM_TEE).click();}

    @And("Select 'M' Size of Diva GYM tee")
    public void ClickOnDivaGYMTeeMSize(){
        explicitlyWait(SELECT_M_SIZE,CLICKABLE,5);
        getElement(SELECT_M_SIZE).click();}

    @And("Select Yellow Color")
    public void ClickOnYellowColor(){
        explicitlyWait(SELECT_YELLOW_COLOR,CLICKABLE,5);
        getElement(SELECT_YELLOW_COLOR).click();}

    @And("CLick on Add To Wishlist")
    public void ClickToWishlist(){
        explicitlyWait(CLICK_ON_ADD_TO_WISHLIST,CLICKABLE,5);
        getElement(CLICK_ON_ADD_TO_WISHLIST).click();}

    @And("Click to back button")
    public void ClickToBackBTN(){driver.navigate().back();}

    @And("Click on Radiant tee")
    public void ClickOnRadiantTee(){
        explicitlyWait(CLICK_ON_RADIANT_TEE,CLICKABLE,5);
        getElement(CLICK_ON_RADIANT_TEE).click();}

    @And("Select 'S' Size of Radiant Tee")
    public void ClickOnRadiantSSize(){
        explicitlyWait(SELECT_S_SIZE,CLICKABLE,5);
        getElement(SELECT_S_SIZE).click();}

    @And("Select Purple color")
    public void ClickOnPurpleColor(){
        explicitlyWait(SELECT_PURPLE_COLOR,CLICKABLE,5);
        getElement(SELECT_PURPLE_COLOR).click();}


    @And("Click to Add All to Cart")
    public void ClickToAddAllToCart(){
        explicitlyWait(CLICK_ON_ADD_ALL_TO_CART,CLICKABLE,5);
        getElement(CLICK_ON_ADD_ALL_TO_CART).click();}

    @And("Go to Basket")
    public void GoToBasketBTN(){
        explicitlyWait(GO_TO_BASKET,CLICKABLE,5);
        getElement(GO_TO_BASKET).click();}

    @And("Go to Checkout")
    public void GoToCheckout(){
        explicitlyWait(GO_TO_CHECKOUT,CLICKABLE,5);
        getElement(GO_TO_CHECKOUT).click();}

    @And("Click on Next button")
    public void ClickNextBTN(){
        explicitlyWait(CLICK_NEXT_BTN,CLICKABLE,10);
        getElement(CLICK_NEXT_BTN).click();
    }

    @And("Click on Place Order button")
    public void ClickOnPlaceOrderBTN(){
        explicitlyWait(PLACE_ORDER_BTN,CLICKABLE,10);
        getElement(PLACE_ORDER_BTN).click();}

    @Then("Check the Message")
    public void CheckTheMessage(){
        explicitlyWait(CHECK_THE_MESSAGE,VISIBLE,10);
        Assert.assertEquals("Thank you for your purchase!",general(CHECK_THE_MESSAGE));
    }

    @And("Click to Account Popup")
    public void ClickToAccountPopup(){getElement(POPUP_ACCOUNT_BTN).click();}

    @And("Click to My Account")
    public void ClickToMyAccount(){getElement(CLICK_ON_MY_ACCOUNT).click();}

    @And("Click to Edit Address")
    public void ClickToEditAddress(){getElement(CLICK_ON_EDIT_ADDRESS).click();}

    @And("Add {string} firstname, {string} lastname, {string} phone number, {string} street address," +
            "{string} city, and {string} postal")
    public void FillOutAddressForm(String firstname, String lastname, String phoneNumber,
                                   String streetAddress, String city, String postal){
        getElement(FIRSTNAME).clear();
        getElement(FIRSTNAME).sendKeys(firstname);
        getElement(LASTNAME).clear();
        getElement(LASTNAME).sendKeys(lastname);
        getElement(PHONE_NUMBER).clear();
        getElement(PHONE_NUMBER).sendKeys(phoneNumber);
        getElement(STREET_ADDRESS).clear();
        getElement(STREET_ADDRESS).sendKeys(streetAddress);
        getElement(CITY).clear();
        getElement(CITY).sendKeys(city);
        getElement(POSTAL).clear();
        getElement(POSTAL).sendKeys(postal);
    }


    @And("Select Country")
    public void SelectCountry() {
        explicitlyWait(DROP_DOWN_LIST,VISIBLE,15);
    }

    @And("Click on Save Address Button")
        public void ClickOnSaveAddressBTN(){
        explicitlyWait(CLICK_TO_SAVE_ADDRESS,CLICKABLE,5);
        getElement(CLICK_TO_SAVE_ADDRESS).click();
    }

    @Then("Check the error Message")
    public void CheckTheErrMsj(){
        explicitlyWait(CHECK_ERROR_MSG, VISIBLE, 3);
        Assert.assertEquals("This is a required field." ,general(CHECK_ERROR_MSG).getText());
    }


    @And("Check {string} Error Message")
    public void CheckSaveAddressErrMsj(String errMsj){
        switch (errMsj){
            case "First Name":
                FirstNameErrMsj();
                break;

            case "Last Name":
                LastNameErrMsj();
                break;

            case "Phone Number":
                PhoneNumberErrMsj();
                break;

            case "Street":
                StreetErrMsj();
                break;

            case "City":
                CityErrMsj();
                break;

            case "Zip":
                ZipPostalErrMsj();
                break;

            default:
                break;
        }
    }

    private void FirstNameErrMsj(){
        explicitlyWait(FIRST_NAME_ERRMSJ,VISIBLE,3);
        Assert.assertEquals("This is a required field.",general(FIRST_NAME_ERRMSJ).getText());
    }

    private void LastNameErrMsj(){
        explicitlyWait(LAST_NAME_ERRMSJ,VISIBLE,3);
        Assert.assertEquals("This is a required field.",general(LAST_NAME_ERRMSJ).getText());
    }

    private void PhoneNumberErrMsj(){
        explicitlyWait(PHONE_NUMBER_ERRMSJ,VISIBLE,3);
        Assert.assertEquals("This is a required field.",general(PHONE_NUMBER_ERRMSJ).getText());
    }

    private void StreetErrMsj(){
        explicitlyWait(STREET_ERRMSJ,VISIBLE,3);
        Assert.assertEquals("This is a required field.",general(STREET_ERRMSJ).getText());
    }

    private void CityErrMsj(){
        explicitlyWait(CITY_ERRMSJ,VISIBLE,3);
        Assert.assertEquals("This is a required field.",general(CITY_ERRMSJ).getText());
    }

    private void ZipPostalErrMsj(){
        explicitlyWait(ZIP_POSTAL_ERRMSJ,VISIBLE,3);
        Assert.assertEquals("This is a required field.",general(ZIP_POSTAL_ERRMSJ).getText());
    }

    @Then("Sign out")
    public void SignOut(){
        explicitlyWait(SIGN_OUT,VISIBLE,3);
        getElement(SIGN_OUT).click();
    }

    @And("Click on What's New")
    public void WhatsNew(){
        explicitlyWait(CLICK_ON_WHATS_NEW,CLICKABLE,3);
        getElement(CLICK_ON_WHATS_NEW).click();
    }

    @And("Click on Tanks")
    public void ClickOnTanks(){
        explicitlyWait(CLICK_ON_TANKS,CLICKABLE,2);
        getElement(CLICK_ON_TANKS).click();
    }

    @And("Click on Atlas Fitness")
    public void ClickOnAtlasFitness(){
        explicitlyWait(CLICK_ON_ATLAS_FITNESS,CLICKABLE,2);
        getElement(CLICK_ON_ATLAS_FITNESS).click();
    }

    @And("Add To Compare")
    public void AddToCompare(){
        explicitlyWait(CLICK_ON_COMPARE,CLICKABLE,2);
        getElement(CLICK_ON_COMPARE).click();
    }

    @And("Click on Sparta Gym")
    public void ClickOnSpartaGym(){
        explicitlyWait(CLICK_ON_SPARTA_GYM,CLICKABLE,2);
        getElement(CLICK_ON_SPARTA_GYM).click();
    }

    @Then("Go to Compare")
    public void GoToCompare(){
        explicitlyWait(GO_TO_COMPARE,VISIBLE,5);
        getElement(GO_TO_COMPARE).click();
    }
}
