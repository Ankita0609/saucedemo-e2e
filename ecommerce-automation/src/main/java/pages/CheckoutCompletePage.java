package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage {

    private final WebDriver driver;
    private final By successHeader = By.className("complete-header");

    public CheckoutCompletePage(WebDriver driver) { this.driver = driver; }

    public boolean isOrderSuccess() {
        try {
            String txt = driver.findElement(successHeader).getText();
            return txt != null && txt.toLowerCase().contains("thank");
        } catch (Exception e) {
            return false;
        }
    }
}
