package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import static DriverHook.DriverConfig.driver;
import static POM.ConditionOptionEnum.CLICKABLE;
import static POM.ConditionOptionEnum.VISIBLE;
import static POM.SignInPOM.*;

public class SignInStepDef extends BaseMethods {

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
    public void iAmMagentoUserPage() {
        explicitlyWait(LOGGED_IN, VISIBLE, 10);
    }


}

