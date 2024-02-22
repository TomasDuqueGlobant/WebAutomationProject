package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.baseTest.BaseTest;

public class PurchaseProductTest extends BaseTest {

    @Test
    @Parameters({"username","password"})
    public void login(String username, String password){
        LoginPage login = loadLogin();
        login.login(username,password);
    }
}
