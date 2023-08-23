package POM;

import org.openqa.selenium.By;

public class CategoryPOM {

    public static final By WOMEN = By.cssSelector("#ui-id-4 > span.ui-menu-icon.ui-icon.ui-icon-carat-1-e");
    public static final By TOPS = By.cssSelector("#narrow-by-list2 > dd > ol > li:nth-child(1) > a");
    public static final By TOPS_ELEMENTS = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol");
    public static final By BOTTOMS = By.cssSelector("#narrow-by-list2 > dd > ol > li:nth-child(2) > a");
    public static final By BOTTOMS_ELEMENTS = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol");
    public static final By TOPS_CAT = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]");
    public static final By BOTTOMS_CAT = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]");


}
