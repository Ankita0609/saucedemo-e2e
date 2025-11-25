package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {

    private final WebDriver driver;
    private final By finishButton = By.id("finish");

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public CheckoutCompletePage clickFinish() {
        driver.findElement(finishButton).click();
        return new CheckoutCompletePage(driver);
    }
}
