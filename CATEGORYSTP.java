package StepDefinitions;

import POM.ConditionOptionEnum;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import static POM.CATEGORYPOM.*;
import static POM.ConditionOptionEnum.CLICKABLE;
import static POM.ConditionOptionEnum.VISIBLE;

public class CATEGORYSTP extends BaseMethods{

    @Given("Scrolling through the tops categories")
    public void ScrollThruTops(){
        explicitlyWait(WOMEN, CLICKABLE,5);
        getElement(WOMEN).click();
        secondsWait(3);
        getElement(TOPS).click();
        secondsWait(3);
        getElement(TOPS_CAT).click();
        secondsWait(3);

    };

    @And("Assuring the presence of all 4 categories")
    public void AssurePresence_of_4(){
        explicitlyWait(TOPS_ELEMENTS,VISIBLE, 3);

    }

    @Given("Scrolling through the bottoms categories")
    public void ScrollThruBottoms(){
        explicitlyWait(WOMEN, CLICKABLE,5);
        getElement(WOMEN).click();
        secondsWait(3);
        getElement(BOTTOMS).click();
        secondsWait(3);
        getElement(BOTTOMS_CAT).click();
        secondsWait(3);
    };

    @And("Assuring the presence of all 2 categories")
    public void AssurePresence_of_2(){
        explicitlyWait(BOTTOMS_ELEMENTS,VISIBLE, 3);
    }
}
