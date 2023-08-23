package POM;

import org.openqa.selenium.By;

public class RegisterPOM {
    public static final By REGISTRATION_LINK = By.cssSelector("a[href='https://magento.softwaretestingboard.com/customer/account/create/']");
    public static final By FIRST_NAME_INPUT = By.cssSelector("input[name='firstname']");
    public static final By LAST_NAME_INPUT = By.cssSelector("input[name='lastname']");
    public static final By EMAIL_INPUT = By.cssSelector("input[name='email']");
    public static final By PASSWORD_INPUT = By.cssSelector("input[name='password']");
    public static final By CONFIRM_PASSWORD_INPUT = By.cssSelector("input[name='password_confirmation']");
    public static final By SUBMIT_BUTTON = By.cssSelector("button[type='submit'][class='action submit primary']");
    public static final By INDEX_LINK = By.cssSelector("a[href='https://magento.softwaretestingboard.com/customer/account/']");
    public static final By PASSWORD_CONFIRMATION_ERROR = By.cssSelector("div[for='password-confirmation']");
    public static final By EMAIL_ALREADY_REGISTERED_ERROR = By.cssSelector("div[data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public static final By FIRSTNAME_ERROR = By.id("firstname-error");
    public static final By LASTNAME_ERROR = By.id("lastname-error");
    public static final By EMAIL_ADDRESS_ERROR = By.id("email_address-error");
    public static final By PASSWORD_ERROR = By.id("password-error");
    public static final By CONFIRM_PASSWORD_ERROR = By.id("password-confirmation-error");
    public static final By INVALID_EMAIL_FORMAT_ERROR = By.xpath("//div[@for='email_address']");






}

