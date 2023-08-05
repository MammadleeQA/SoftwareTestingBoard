package POM;

import org.openqa.selenium.By;

public class HomePagePOM {
    public static final By CLICK_ON_SHOPNYBTN = By.cssSelector("#maincontent > div.columns > div > div.widget.block.block-static-block > div.blocks-promo > a > span > span.action.more.button");
    public static final By MicroSleeveTop = By.cssSelector("#maincontent > div.columns > div.column.main > div.products.wrapper.grid.products-grid > ol > li:nth-child(10) > div > a > span > span > img");
    public static final By AddToCardBTN = By.cssSelector("#product-addtocart-button > span");
    public static final By CheckErrMsj = By.cssSelector("#super_attribute\\[143\\]-error");
}
