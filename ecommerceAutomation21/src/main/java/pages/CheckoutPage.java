package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    private final WebDriver driver;
    private final By firstName = By.id("first-name");
    private final By lastName = By.id("last-name");
    private final By postalCode = By.id("postal-code");
    private final By continueButton = By.id("continue");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public CheckoutPage fillInformation(String fName, String lName, String zip) {
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(postalCode).clear();
        driver.findElement(postalCode).sendKeys(zip);
        return this;
    }

    public CheckoutOverviewPage clickContinue() {
        driver.findElement(continueButton).click();
        return new CheckoutOverviewPage(driver);
    }
}
