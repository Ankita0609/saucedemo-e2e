package utils;

import core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    private static final int TIMEOUT = 10;

    public static WebElement waitForElementVisible(By locator) {
        WebDriverWait wait =
                new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(TIMEOUT));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForUrlContains(String value) {
        WebDriverWait wait =
                new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.urlContains(value));
    }
}
