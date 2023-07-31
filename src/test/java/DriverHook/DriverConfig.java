package DriverHook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.openqa.selenium.remote.Browser.*;

public class DriverConfig {
    final static Browser BROWSER = CHROME;
    public static WebDriver driver;
    public static ChromeOptions chromeOptions;
    public static EdgeOptions edgeOptions;
    public static FirefoxOptions firefoxOptions;

    //Test başlayarkən Background ilk olaraq @Before annotasiyasını tapıb çalışdrır
    @Before
    public void beforeScenario() {

        if (BROWSER.equals(CHROME)) {
            driver = new ChromeDriver(chromeOptions());
        } else if (BROWSER.equals(FIREFOX)) {
            driver = new FirefoxDriver(firefoxOptions());
        } else if (BROWSER.equals(EDGE)) {
            driver = new EdgeDriver(edgeOptions());
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + BROWSER);
        }
    }

    //Chrome, Edge və Firefox üçün driver konfiqurasiyaları
    public static ChromeOptions chromeOptions() {
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--start-fullscreen");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chrome_driver.exe");

        return chromeOptions;
    }

    public static EdgeOptions edgeOptions() {
        edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--disable-notifications");
        edgeOptions.addArguments("--start-fullscreen");
        System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/edge_driver.exe");

        return edgeOptions;
    }

    public static FirefoxOptions firefoxOptions() {
        firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--start-maximized");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, firefoxOptions);
        firefoxOptions.merge(capabilities);
        System.setProperty("webdriver.firefox.driver", "src/test/resources/drivers/firefox_driver.exe");

        return firefoxOptions;
    }

    //Test sonlanarkən @After annotasiyası çalışır
    @After
    public void afterScenario() {

        if (driver != null) {
            driver.quit();
        }
    }
}
