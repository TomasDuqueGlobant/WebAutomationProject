package utils.baseTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pages.LoginPage;
import pages.ProductsPage;
import utils.MyDriver;

public class BaseTest {

    MyDriver driver;


    @BeforeMethod(alwaysRun = true)
    @Parameters({"url"})
    public void beforeMethod(String url){
        driver = new MyDriver();
        driver.getDriver().manage().window().maximize();
        navigateTo(url);
    }

    public void navigateTo(String url){
        driver.getDriver().get(url);
    }

    public LoginPage loadLogin(){
        return new LoginPage(driver.getDriver());
    }
    public ProductsPage loadProducts(){
        return new ProductsPage(driver.getDriver());
    }


//   @AfterMethod()
//   public void afterMethod(){
//       driver.getDriver().close();
//   }
}
