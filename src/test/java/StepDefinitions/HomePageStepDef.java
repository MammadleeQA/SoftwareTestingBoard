package  StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static DriverHook.DriverConfig.driver;
import static POM.ConditionOptionEnum.CLICKABLE;
import static POM.ConditionOptionEnum.VISIBLE;
import static POM.HomePagePOM.*;

public class HomePageStepDef extends BaseMethods{
    @When("Click on Shop New Yoga Button")

    public void clickOnShopNYButton(){

        getElement(CLICK_ON_SHOPNYBTN).click();
    }

    @And("Scroll Left To Right to {int} , Top To Bottom to {int}")
    public void Scrolling(int leftToRight, int topToBottom){
        scrollByWeb(leftToRight, topToBottom);
    }

    @And("Wait {int} seconds")
    public  void WaitForSeconds(int seconds){
        secondsWait(seconds);
    }

    @And("Select a product")
    public void SelectEquipment(){
        getElement(MicroSleeveTop).click();
    }

    @And("Click to Add to Card button")
    public void ClickAddToCardBTN(){
        getElement(AddToCardBTN).click();
    }

    @Then("Check the error Message")
    public void CheckTheErrMsj(){
        explicitlyWait(CheckErrMsj, VISIBLE, 3);
        Assert.assertEquals("Thi is a required field." ,general(CheckErrMsj).getText());
    }
}
