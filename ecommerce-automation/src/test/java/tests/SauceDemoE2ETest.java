package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import java.io.FileInputStream;
import java.util.Properties;

public class SauceDemoE2ETest extends BaseTest {

    @Test
    public void endToEndFlow() throws Exception {

        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/resources/config.properties"));

        // Navigate to site
        driver.get(prop.getProperty("url"));

        // Login
        LoginPage login = new LoginPage(driver);
        login.login(prop.getProperty("username"), prop.getProperty("password"));

        // --- POPUP FIX ADDED HERE ---
        Thread.sleep(1500); // allow popup to appear
        dismissGoogleSmartLockPopup();
        Thread.sleep(1000); // allow popup to close fully

        // Navigate to product
        InventoryPage inventory = new InventoryPage(driver);
        inventory.openBackpackPage();

        // Add to cart
        ProductPage product = new ProductPage(driver);
        product.clickAddToCart();
        product.openCart();

        // Cart page
        CartPage cart = new CartPage(driver);
        cart.clickCheckout();

        // Checkout info
        CheckoutInfoPage info = new CheckoutInfoPage(driver);
        info.enterInfo(
                prop.getProperty("firstname"),
                prop.getProperty("lastname"),
                prop.getProperty("zipcode")
        );

        // Overview
        CheckoutOverviewPage overview = new CheckoutOverviewPage(driver);
        overview.clickFinish();

        // Confirmation
        CheckoutCompletePage complete = new CheckoutCompletePage(driver);
        Assert.assertTrue(complete.isOrderSuccess(), "Order was NOT completed successfully!");
    }
}
