package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.*;
import utils.baseTest.BaseTest;

public class PurchaseProductTest extends BaseTest {

    @Test
    @Parameters({ "username","password","firstname","lastname","zipcode", "title" })
    public void purchase(String username, String password, String firstname, String lastname,String zipCode, String title){
        LoginPage login = loadLogin();

        ProductsPage product = login.login(username,password);
        product.addBackpackToCart();

        CartPage cart = product.openCart();

        CheckoutPage checkout = cart.navigateToCheckout();

        OverviewPage overview = checkout.fillCheckout(firstname,lastname,zipCode);

       ResultPage result = overview.finishOrder();

       Assert.assertTrue(result.isPurchaseDone(title));

    }



}
