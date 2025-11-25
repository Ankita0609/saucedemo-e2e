package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private final WebDriver driver;
    private final By checkoutButton = By.id("checkout");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public CheckoutPage clickCheckout() {
        driver.findElement(checkoutButton).click();
        return new CheckoutPage(driver);
    }
}
