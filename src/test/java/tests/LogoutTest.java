package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import utils.baseTest.BaseTest;

public class LogoutTest extends BaseTest {

    @Test
    @Parameters({"username","password"})
    public void Logout(String username, String password){
        LoginPage login = loadLogin();

        ProductsPage products = login.login(username,password);
        products.openMenu();

        LoginPage logout = products.logout();
        Assert.assertTrue(logout.isLoginBtnVisible());

    }
}
