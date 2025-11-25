package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    private final WebDriver driver;
    private final By firstProduct = By.cssSelector(".inventory_item:first-of-type .inventory_item_name");
    private final By cartIcon = By.id("shopping_cart_container");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage clickFirstProduct() {
        driver.findElement(firstProduct).click();
        return new ProductPage(driver);
    }

    public CartPage goToCart() {
        driver.findElement(cartIcon).click();
        return new CartPage(driver);
    }
}
