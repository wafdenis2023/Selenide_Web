package common;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.open;

/**
 * This class handles the setup and teardown of the WebDriver for Selenide tests.
 */
public class DataManager {

    /**
     * Configures the WebDriver and Selenide settings.
     */
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.headless = true;
        // Configuration.startMaximized = true;
        Configuration.timeout = 10000;
    }

    /**
     * Opens the specified URL in the browser.
     */
    public static void openBrowser() {
        open("https://www.saucedemo.com/");
    }

    /**
     * Retrieves the current WebDriver instance.
     *
     * @return the current WebDriver instance.
     */
    public static WebDriver getDriver() {
        return WebDriverRunner.getWebDriver();
    }

    /**
     * Closes the WebDriver and cleans up resources.
     */
    public static void tearDown() {
        WebDriverRunner.closeWebDriver();
    }
}
