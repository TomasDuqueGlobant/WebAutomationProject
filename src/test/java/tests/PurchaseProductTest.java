package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;
import utils.baseTest.BaseTest;

public class PurchaseProductTest extends BaseTest {

    @Test
    @Parameters({ "username","password" })
    public void purchase(String username, String password){
        LoginPage login = loadLogin();

        ProductsPage product = login.login(username,password);
        product.addToCart();

        CartPage cart = product.openCart();
        cart.doCheckout();





    }



}
