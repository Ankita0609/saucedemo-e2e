package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    private final WebDriver driver;
    private final By addToCartButton = By.cssSelector("button.btn_inventory");
    private final By backToProducts = By.id("back-to-products");
    private final By cartIcon = By.id("shopping_cart_container");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }

    public InventoryPage backToProducts() {
        driver.findElement(backToProducts).click();
        return new InventoryPage(driver);
    }

    public CartPage goToCart() {
        driver.findElement(cartIcon).click();
        return new CartPage(driver);
    }
}
