package POM;

import org.openqa.selenium.By;

public class SingInPOM {
    public static final By SIGN_IN_LINK = By.cssSelector("a[href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']");
    public static final By EMAIL_INPUT = By.id("email");
    public static final By PASSWORD_INPUT = By.id("pass");
    public static final By SIGN_IN_BUTTON = By.id("send2");
    public static final By INVALID_SIGN_IN_MESSAGE = By.cssSelector("div[data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public static final By HOME_PAGE = By.cssSelector("a[href='https://magento.softwaretestingboard.com/']");
    public static final By EMAIL_ERROR = By.id("id='email-error'");
    public static final By PASSWORD_ERROR = By.cssSelector("div[for='pass']");


}
