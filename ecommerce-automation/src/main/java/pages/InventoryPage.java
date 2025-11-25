package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.TestUtil;

public class InventoryPage {

    private final WebDriver driver;
    private final By backpackLink = By.id("item_4_title_link"); // link to backpack product

    public InventoryPage(WebDriver driver) { this.driver = driver; }

    public void openBackpackPage() {
        WebElement el = driver.findElement(backpackLink);
        TestUtil.scrollIntoView(driver, el);
        el.click();
    }
}
