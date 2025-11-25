package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.ConfigReader;

public class E2ECheckoutTest extends BaseTest {

    @Test
    public void verifyEndToEndCheckoutFlow() {

        // open URL
        driver.get(ConfigReader.get("baseUrl"));

        // pages
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = loginPage.loginAs(
                ConfigReader.get("username"),
                ConfigReader.get("password")
        );

        // product selection
        ProductPage productPage = inventoryPage.clickFirstProduct();
        productPage.addToCart();

        // cart & checkout
        CartPage cartPage = productPage.goToCart();
        CheckoutPage checkoutPage = cartPage.clickCheckout();
        checkoutPage.fillInformation("John", "Doe", "12345");
        CheckoutOverviewPage overviewPage = checkoutPage.clickContinue();

        // finish order
        CheckoutCompletePage completePage = overviewPage.clickFinish();

        // assertion - SauceDemo success message is "THANK YOU FOR YOUR ORDER"
        String success = completePage.getSuccessMessage();
        Assert.assertTrue(success != null && success.toLowerCase().contains("thank"),
                "Expected success message to contain 'thank' but was: " + success);
    }
}
