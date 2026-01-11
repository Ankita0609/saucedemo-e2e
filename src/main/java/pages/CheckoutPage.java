package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class CheckoutPage {

    private WebDriver driver;

    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By postalCode = By.id("postal-code");
    private By continueBtn = By.id("continue");
    private By finishBtn = By.id("finish");
    private By successMsg = By.className("complete-header");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserDetails(String f, String l, String zip) {
        WaitUtils.waitForElementVisible(firstName).sendKeys(f);
        driver.findElement(lastName).sendKeys(l);
        driver.findElement(postalCode).sendKeys(zip);
        driver.findElement(continueBtn).click();
    }

    public void finishCheckout() {
        WaitUtils.waitForElementVisible(finishBtn).click();
    }

    public String getSuccessMessage() {
        return WaitUtils.waitForElementVisible(successMsg).getText();
    }
}
