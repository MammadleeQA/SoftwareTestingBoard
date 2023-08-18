package POM;

import org.openqa.selenium.By;

public class OrderPOM {
    public static final By menbtn = By.xpath("(//span[text()='Men'])");
    public static final By addtocart = By.xpath("(//span[text()='Add to Cart'])");
    public static final By tops = By.xpath("(//a[text()='Tops'])");
    public static final By firststpic =By.cssSelector("img[src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/m/t/mt03-red_main_1.jpg']");
    public static final By sizes = By.xpath("(//div[text()='S'])");
    public static final By sizexs = By.xpath("(//div[text()='XS'])");
    public static final By sizem = By.xpath("(//div[text()='M'])");
    public static final By sizel = By.xpath("(//div[text()='L'])");
    public static final By sizexl = By.xpath("(//div[text()='XL'])");
    public static final By ErrMsj = By.xpath("//div[@class='mage-error' and @id='super_attribute[93]-error']");

}
