package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import static POM.ComparePOM.*;
import static POM.ConditionOptionEnum.VISIBLE;

public class CompareSepDef extends BaseMethods {

    @And("Adding items to compare list and seeing if the list is filled")
    public void CompareProductCheckUp() {
        scrollByWeb(0,1800);
        secondsWait(5);
        getElement(ITEM10).click();
        getElement(ITEM11).click();
        explicitlyWait(LOGO2, VISIBLE, 10);
        getElement(LOGO2).click();
        secondsWait(5);
        scrollByWeb(0,1800);
        getElement(ITEM12).click();
        getElement(ITEM13).click();
        explicitlyWait(LOGO2, VISIBLE, 10);
        getElement(LOGO2).click();
        secondsWait(3);
        getElement(COMPARE_LIST).click();
        secondsWait(5);

    }

    @Given("My compare product items are visible")
    public void CompareProductContent() {
        explicitlyWait(PRESENT_1, VISIBLE, 5);
        explicitlyWait(PRESENT_2, VISIBLE, 5);
    }
}
