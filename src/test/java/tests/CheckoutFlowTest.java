package tests;

import core.BaseTest;
import core.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CheckoutFlowTest extends BaseTest {

    @Test
    public void userCanCompletePurchaseFlow() {

        LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
        InventoryPage inventoryPage = new InventoryPage(DriverFactory.getDriver());
        CartPage cartPage = new CartPage(DriverFactory.getDriver());
        CheckoutPage checkoutPage = new CheckoutPage(DriverFactory.getDriver());

        // Login
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");

        // Add item
        inventoryPage.addFirstItemToCart();
        Assert.assertEquals(inventoryPage.getCartCount(), 1,
                "Cart count mismatch after adding item");

        // Cart → Checkout
        inventoryPage.goToCart();
        cartPage.clickCheckout();

        // Checkout
        checkoutPage.enterUserDetails("Ankita", "Singh", "560001");
        checkoutPage.finishCheckout();

        // Assertion
        Assert.assertEquals(
                checkoutPage.getSuccessMessage(),
                "Thank you for your order!",
                "Order completion message not displayed"
        );
    }
}
