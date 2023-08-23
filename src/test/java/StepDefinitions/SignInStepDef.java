package StepDefinitions;

import POM.SingInPOM;
import StepDefinitions.BaseMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import POM.SingInPOM;
import POM.RegisterPOM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static DriverHook.DriverConfig.driver;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SignInStepDef extends BaseMethods {

    @Given("the user is on the sign-in page")
    public void navigateToSignInPage() {
        WebElement signInLink = driver.findElement(SingInPOM.SIGN_IN_LINK);
        signInLink.click();
    }

    @When("the user enters valid email and password")
    public void enterValidEmailAndPassword() {
        WebElement emailInput = driver.findElement(SingInPOM.EMAIL_INPUT);
        WebElement passwordInput = driver.findElement(SingInPOM.PASSWORD_INPUT);

        emailInput.sendKeys("japeti2335@wiemei.com");
        passwordInput.sendKeys("Parol-123" );
    }

    @When("clicks the \"Sign In\" button")
    public void clickSignInButton() {
        WebElement signInButton = driver.findElement(SingInPOM.SIGN_IN_BUTTON);
        signInButton.click();
    }
    @When("the user enters invalid email and password")
    public void enterInvalidCredentials() {
        WebElement emailInput = driver.findElement(SingInPOM.EMAIL_INPUT);
        WebElement passwordInput = driver.findElement(SingInPOM.PASSWORD_INPUT);

        emailInput.sendKeys("invalid@example.com");
        passwordInput.sendKeys("invalidPassword");
    }
    @And("clicks the Sign In button")
    public void clickSignInButtonn() {
        WebElement signInButton = driver.findElement(SingInPOM.SIGN_IN_BUTTON);
        signInButton.click();
    }


    @Then("the user should be redirected to their account page")
    public void verifyRedirectToAccountPage() {
        WebElement indexLink = driver.findElement(SingInPOM.HOME_PAGE);
        assertTrue(indexLink.isDisplayed());
    }
    @Then("the user should see an error message indicating invalid credentials")
    public void verifyErrorMessageForInvalidCredentials() {
        WebElement errorMessage = driver.findElement(SingInPOM.INVALID_SIGN_IN_MESSAGE);

        assertTrue(errorMessage.getText().contains("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later."));
    }
}



