package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    private WebDriver driver;

    private By firstItemAddBtn = By.id("add-to-cart-sauce-labs-backpack");
    private By cartIcon = By.className("shopping_cart_link");
    private By cartBadge = By.className("shopping_cart_badge");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addFirstItemToCart() {
        driver.findElement(firstItemAddBtn).click();
    }

    public int getCartCount() {
        return Integer.parseInt(driver.findElement(cartBadge).getText());
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }
}
