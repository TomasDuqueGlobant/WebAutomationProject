package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import utils.baseTest.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    @Parameters({"username", "password"})
    public void Login(String username, String password){
        LoginPage login = loadLogin();
        ProductsPage products = loadProducts();
        login.login(username,password);
        Assert.assertTrue(products.isAddToCartButtonVisible());
    }
}
