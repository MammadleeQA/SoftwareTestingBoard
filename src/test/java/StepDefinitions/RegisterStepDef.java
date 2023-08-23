package StepDefinitions;

import POM.RegisterPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static DriverHook.DriverConfig.driver;
import static org.junit.Assert.assertTrue;

public class RegisterStepDef extends BaseMethods {

    @Given("the user is on the registration page")
    public void navigateToRegistrationPage() {
        WebElement navButton = driver.findElement(RegisterPOM.REGISTRATION_LINK);
        navButton.click();
    }

    @When("the user enters valid registration details")
    public void enterValidRegistrationDetails() {
        WebElement firstNameInput = driver.findElement(RegisterPOM.FIRST_NAME_INPUT);
        WebElement lastNameInput = driver.findElement(RegisterPOM.LAST_NAME_INPUT);
        WebElement emailInput = driver.findElement(RegisterPOM.EMAIL_INPUT);
        WebElement passwordInput = driver.findElement(RegisterPOM.PASSWORD_INPUT);
        WebElement confirmPasswordInput = driver.findElement(RegisterPOM.CONFIRM_PASSWORD_INPUT);

        firstNameInput.sendKeys("Mari");
        lastNameInput.sendKeys("Doe");
        emailInput.sendKeys("alipashayevamari@gmail.com");
        passwordInput.sendKeys("securePassword12");
        confirmPasswordInput.sendKeys("securePassword12");
    }
    @When("the user enters registration details with mismatched passwords")
    public void enterRegistrationDetailsWithMismatchedPasswords() {
        WebElement firstNameInput = driver.findElement(RegisterPOM.FIRST_NAME_INPUT);
        WebElement lastNameInput = driver.findElement(RegisterPOM.LAST_NAME_INPUT);
        WebElement emailInput = driver.findElement(RegisterPOM.EMAIL_INPUT);
        WebElement passwordInput = driver.findElement(RegisterPOM.PASSWORD_INPUT);
        WebElement confirmPasswordInput = driver.findElement(RegisterPOM.CONFIRM_PASSWORD_INPUT);

        firstNameInput.sendKeys("Mari");
        lastNameInput.sendKeys("Doe");
        emailInput.sendKeys("alipashayevamari@gmail.com");
        passwordInput.sendKeys("securePassword12");
        confirmPasswordInput.sendKeys("securePassword12");
        passwordInput.sendKeys("Password234");
        confirmPasswordInput.sendKeys("Password456");
    }
    @When("the user enters registration details with an already registered email")
    public void enterRegistrationDetailsWithAlreadySignedMail() {
        WebElement firstNameInput = driver.findElement(RegisterPOM.FIRST_NAME_INPUT);
        WebElement lastNameInput = driver.findElement(RegisterPOM.LAST_NAME_INPUT);
        WebElement emailInput = driver.findElement(RegisterPOM.EMAIL_INPUT);
        WebElement passwordInput = driver.findElement(RegisterPOM.PASSWORD_INPUT);
        WebElement confirmPasswordInput = driver.findElement(RegisterPOM.CONFIRM_PASSWORD_INPUT);

        firstNameInput.sendKeys("Mari");
        lastNameInput.sendKeys("Doe");
        emailInput.sendKeys("alipashayevamari@gmail.com");
        passwordInput.sendKeys("securePassword12");
        confirmPasswordInput.sendKeys("securePassword12");
    }

    @When("the user submits the registration form with missing required fields")
    public void submitRegistrationFormWithMissingFields() {
        WebElement submitButton = driver.findElement(RegisterPOM.SUBMIT_BUTTON);
        submitButton.click();
    }

    @When("the user enters an invalid email format in the registration form")
    public void invalidEmailFormat(){
        WebElement firstNameInput = driver.findElement(RegisterPOM.FIRST_NAME_INPUT);
        WebElement lastNameInput = driver.findElement(RegisterPOM.LAST_NAME_INPUT);
        WebElement emailInput = driver.findElement(RegisterPOM.EMAIL_INPUT);
        WebElement passwordInput = driver.findElement(RegisterPOM.PASSWORD_INPUT);
        WebElement confirmPasswordInput = driver.findElement(RegisterPOM.CONFIRM_PASSWORD_INPUT);

        firstNameInput.sendKeys("Mari");
        lastNameInput.sendKeys("Doe");
        emailInput.sendKeys("alipashayevamari");
        passwordInput.sendKeys("securePassword12");
        confirmPasswordInput.sendKeys("securePassword12");
    }

    @And("submits the registration form")
    public void submitRegistrationForm() {
        WebElement submitButton = driver.findElement(RegisterPOM.SUBMIT_BUTTON);
        submitButton.click();
    }

    @Then("go to index page")
    public void goToIndexPage() {
        driver.get(String.valueOf(RegisterPOM.INDEX_LINK));
    }

    @Then("the user should see an error message regarding password mismatch")
    public void verifyErrorMessageForPasswordMismatch() {
        WebElement errorMessageElement = driver.findElement(RegisterPOM.PASSWORD_CONFIRMATION_ERROR);
        assertTrue(errorMessageElement.getText().contains("Please enter the same value again."));
    }

    @Then("the user should see an error message indicating the email is already registered")
    public void verifyErrorMessageForAlreadySignedMail() {
        WebElement errorMessageElement = driver.findElement(RegisterPOM.EMAIL_ALREADY_REGISTERED_ERROR);
        System.out.println(errorMessageElement.getText());
        assertTrue(errorMessageElement.getText().contains("There is already an account with this email address."));
    }

    @Then("the user should see error messages for the missing fields")
    public void missingFieldsMessage() {
        WebElement firstNameError = driver.findElement(RegisterPOM.FIRSTNAME_ERROR);
        WebElement lastNameError = driver.findElement(RegisterPOM.LASTNAME_ERROR);
        WebElement emailError = driver.findElement(RegisterPOM.EMAIL_ADDRESS_ERROR);
        WebElement passwordError = driver.findElement(RegisterPOM.PASSWORD_ERROR);
        WebElement confirmPasswordError = driver.findElement(RegisterPOM.CONFIRM_PASSWORD_ERROR);

        assertTrue(firstNameError.isDisplayed());
        assertTrue(lastNameError.isDisplayed());
        assertTrue(emailError.isDisplayed());
        assertTrue(passwordError.isDisplayed());
        assertTrue(confirmPasswordError.isDisplayed());
    }

    @Then("the user should see an error message indicating an invalid email format")
    public void invalidEmailFormatMessage() {
        WebElement errorMessageElement = driver.findElement(RegisterPOM.INVALID_EMAIL_FORMAT_ERROR);
        assertTrue(errorMessageElement.getText().contains("Please enter a valid email address (Ex: johndoe@domain.com)."));
    }
}

