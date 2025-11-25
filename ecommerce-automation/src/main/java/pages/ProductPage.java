package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.TestUtil;

public class ProductPage {

    private final WebDriver driver;
    private final By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
    private final By cartIcon = By.className("shopping_cart_link");

    public ProductPage(WebDriver driver) { this.driver = driver; }

    public void clickAddToCart() {
        WebElement add = driver.findElement(addToCartBtn);
        TestUtil.scrollIntoView(driver, add);
        add.click();
    }

    public void openCart() {
        WebElement cart = driver.findElement(cartIcon);
        TestUtil.scrollIntoView(driver, cart);
        cart.click();
    }
}
