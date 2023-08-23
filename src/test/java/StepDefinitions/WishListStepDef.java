package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import static POM.ConditionOptionEnum.VISIBLE;
import static POM.WishListPOM.*;

public class WishListStepDef extends BaseMethods{

    @And("Adding items to wish list and seeing if the list is filled")
    public void WishListCheckUp() {
        scrollByWeb(0,1800);
        secondsWait(5);
        getElement(ITEM0).click();
        getElement(ITEM1).click();
        explicitlyWait(LOGO, VISIBLE, 10);
        getElement(LOGO).click();
        secondsWait(5);
        scrollByWeb(0,1800);
        getElement(ITEM2).click();
        getElement(ITEM3).click();
        explicitlyWait(LOGO, VISIBLE, 10);
        getElement(LOGO).click();
        getElement(DROPDOWN).click();
        secondsWait(5);
        getElement(WISHLIST).click();
        secondsWait(2);
        getElement(LOGO).click();
    }

    @Given("My wishlist is visible")
    public void WishListHasContent() {
        explicitlyWait(WISHLIST_SHOWS_UP, VISIBLE, 10);
    }
}
