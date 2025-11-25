package base;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.PopupHandler;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverManager.initializeDriver();
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    // Wrapper method to dismiss Google password popup
    protected void dismissGoogleSmartLockPopup() {
        PopupHandler.clickGoogleSmartLockOK();
    }
}
