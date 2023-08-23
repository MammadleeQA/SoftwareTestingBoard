package POM;

import org.openqa.selenium.By;

public class FilterPOM {
    public static final By SIGN_IN_LINK = By.xpath("(//a[contains(text(),'Sign In')])[1]");
    public static final By LOGIN_USERNAME_INPUT = By.cssSelector("input[name='login[username]']");
    public static final By LOGIN_PASSWORD_INPUT = By.cssSelector("input[name='login[password]']");
    public static final By LOGIN_BTN = By.cssSelector("button[class='action login primary']");
    public static final By LOGGED_IN = By.xpath("(//span[@class='logged-in'])[1]");
    public static final By FIRST_ITEM_LINK = By.xpath("(//a[@class='product-item-link'][1])");
    public static final By GRID_SWITCHER = By.xpath("(//a[@class='modes-mode mode-grid'])[1]");
    public static final By LIST_SWITCHER = By.xpath("(//a[@class='modes-mode mode-list'])[1]");
    public static final By TOOLBAR_LAST_NUMBER = By.xpath("(//span[@class='toolbar-number'])[2]");
    public static final By LISTED_PRODUCTS_COUNT = By.xpath("//span[@class='toolbar-number'][3]");
    public static final By FIRST_ITEM = By.xpath("(//div[@class='price-box price-final_price'])[1]");
    public static final By SORT_LIST = By.xpath("(//select[@class='sorter-options'])[1]");
    public static final By POSITION_SORT_SWITCHER = By.xpath("(//option[@value='position'])[1]");
    public static final By PRODUCT_NAME_SORT_SWITCHER = By.xpath("(//option[@value='name'])[1]");
    public static final By PRICE_SORT_SWITCHER = By.xpath("(//option[@value='price'])[1]");
    public static final By PRODUCT_ITEMS = By.xpath("//a[@class='product-item-link']");
    public static final By PRODUCT_ITEMS_PRICES = By.xpath("//span[@class='price']");
    public static final By PAGINATION_NUMBER_BUTTON = By.xpath("(//li[@class='item'])[2]");
    public static final By PAGINATION_PREVIOUS_BUTTON = By.xpath("(//li[@class='item pages-item-previous'])[2]");
    public static final By PAGINATION_NEXT_BUTTON = By.xpath("(//li[@class='item pages-item-next'])[2]");
    public static final By PAGINATION_CURRENT_NUMBER_BUTTON = By.xpath("(//li[@class='item current'])[2]");
    public static final By PRODUCT_ITEM_COUNT_LIMITER = By.xpath("(//li[@class='item current'])[2]");
    public static final By PRODUCT_ITEM_COUNT_LIMITER_OPTION_12 = By.xpath("(//option[@value='12'])[2]");
    public static final By PRODUCT_ITEM_COUNT_LIMITER_OPTION_24 = By.xpath("(//option[@value='24'])[2]");
    public static final By PRODUCT_ITEM_COUNT_LIMITER_OPTION_36 = By.xpath("(//option[@value='36'])[2]");
    public static final By PRODUCT_ITEM_COUNT_LIMITER_CURRENT = By.xpath("(//option[@selected='selected'])[3]");


}
