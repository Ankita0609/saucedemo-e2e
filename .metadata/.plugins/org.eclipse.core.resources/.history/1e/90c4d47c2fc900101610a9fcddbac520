package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInfoPage {

    private final WebDriver driver;
    private final By firstName = By.id("first-name");
    private final By lastName = By.id("last-name");
    private final By postal = By.id("postal-code");
    private final By contBtn = By.id("continue");

    public CheckoutInfoPage(WebDriver driver) { this.driver = driver; }

    public void enterInfo(String f, String l, String zip) {
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(f);
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(l);
        driver.findElement(postal).clear();
        driver.findElement(postal).sendKeys(zip);
        driver.findElement(contBtn).click();
    }
}
