package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;
import utils.baseTest.BaseTest;

public class RemoveProductTest extends BaseTest {


    @Test
    @Parameters({"username","password"})
    public void removeProducts(String username, String password){
        LoginPage login = loadLogin();

        ProductsPage products = login.login(username,password);
        products.addProducts();

        CartPage cart = products.openCart();
        cart.removeProducts();
        Assert.assertTrue(cart.isRemovedProductDisplayed());


    }
}
