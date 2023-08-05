package StepDefinitions;

import POM.ConditionOptionEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static DriverHook.DriverConfig.driver;

public abstract class BaseMethods {

    //Driver daxil edilmiş saniyə qədər gözləyir
    public static void secondsWait(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    //Bir elementi locator ilə çağır
    public WebElement getElement(By locator) {

        return driver.findElement(locator);
    }

    //Elementlər listini locator ilə çağır
    public List<WebElement> getElements(By locator) {

        return driver.findElements(locator);
    }

    //Səhifədə scroll ilə gəziş
    public void scrollByWeb(int leftToRight, int topToBottom) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(" + leftToRight + "," + topToBottom + ")");
    }

    //Şərt ödənənə qədər verilmiş müddətdə elementi gözlə
    public void explicitlyWait(By locator, ConditionOptionEnum conditionOption, int duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        switch (conditionOption) {
            case VISIBLE -> wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            case INVISIBLE -> wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
            case CLICKABLE -> wait.until(ExpectedConditions.elementToBeClickable(locator));
        }
    }

    public WebElement general(By locator){

        return driver.findElement(locator);
    }
}
