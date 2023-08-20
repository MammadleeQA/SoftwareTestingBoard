package POM;

import org.openqa.selenium.By;

public class OrderPOM {
    public static final By menbtn = By.xpath("(//span[text()='Men'])");
    public static final By womenbtn = By.xpath("(//span[text()='Women'])");
    public static final By addtocart = By.xpath("(//span[text()='Add to Cart'])");
    public static final By tops = By.xpath("(//a[text()='Tops'])");
    public static final By jackets = By.xpath("(//a[text()='Jackets'])");
    public static final By firststpic =By.cssSelector("img[src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/m/t/mt03-red_main_1.jpg']");
    public static final By secondpic =By.cssSelector("img[src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/m/t/mt02-white_main_2.jpg']");
    public static final By thirdpic =By.cssSelector("img[src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/w/j/wj06-purple_main_1.jpg']");

    public static final By sizes = By.xpath("(//div[text()='S'])");
    public static final By sizexs = By.xpath("(//div[text()='XS'])");
    public static final By sizem = By.xpath("(//div[text()='M'])");
    public static final By sizel = By.xpath("(//div[text()='L'])");
    public static final By sizexl = By.xpath("(//div[text()='XL'])");
    public static final By ErrMsj = By.xpath("//div[@class='mage-error' and @id='super_attribute[93]-error']");
    public static final By ErrMsj2 = By.xpath("//div[@class='mage-error' and @id='super_attribute[143]-error']");
    public static final By gray = By.cssSelector("div[option-label='Gray']");
    public static final By red = By.cssSelector("div[option-label='Red']");
    public static final By white = By.cssSelector("div[option-label='White']");
    public static final By blue = By.cssSelector("div[option-label='Blue']");
    public static final By black = By.cssSelector("div[option-label='Black']");
    public static final By green = By.cssSelector("div[option-label='Green']");
    public static final By purple = By.cssSelector("div[option-label='Purple']");
    public static final By basket = By.cssSelector("a[href='https://magento.softwaretestingboard.com/checkout/cart/']");
    public static final By viewbasket = By.xpath("(//span[text()='View and Edit Cart'])");
    public static final By succesmsj = By.cssSelector("div[data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]");



}
