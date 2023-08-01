package POM;

import org.openqa.selenium.By;

public class FilterPOM {
    public static final By SIGN_IN_LINK = By.xpath("(//a[contains(text(),'Sign In')])[1]");
    public static final By LOGIN_USERNAME_INPUT = By.cssSelector("input[name='login[username]']");
    public static final By LOGIN_PASSWORD_INPUT = By.cssSelector("input[name='login[password]']");
    public static final By LOGIN_BTN = By.cssSelector("button[class='action login primary']");
    public static final By LOGGED_IN = By.xpath("(//span[@class='logged-in'])[1]");

}
