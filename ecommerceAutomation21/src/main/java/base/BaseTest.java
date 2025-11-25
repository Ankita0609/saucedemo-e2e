package base;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.ConfigReader;
import utils.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

    protected WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        // ensure config is loaded (ConfigReader has static initializer)
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        String browser = ConfigReader.get("browser");
        boolean headless = Boolean.parseBoolean(ConfigReader.get("headless"));
        DriverManager.initDriver(browser, headless);
        driver = DriverManager.getDriver();

        // timeouts
        int implicit = Integer.parseInt(ConfigReader.get("implicitWait"));
        int pageLoad = Integer.parseInt(ConfigReader.get("pageLoadTimeout"));
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(implicit));
        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(pageLoad));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
