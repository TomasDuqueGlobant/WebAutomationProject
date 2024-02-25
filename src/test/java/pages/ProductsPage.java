package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.basePage.BasePage;

import java.time.Duration;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartBtnBackpack;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement addToCartBtnTshirt;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement addToCartBtnBike;

    @FindBy(className="shopping_cart_link")
    private WebElement shoppingCart;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuBtn;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutBtn;
    public boolean isAddToCartButtonVisible(){
        waitElementVisibility(addToCartBtnBackpack);
        return addToCartBtnBackpack.isDisplayed();

    }
    public void addProducts(){
        addToCartBtnBackpack.click();
        addToCartBtnBike.click();
        addToCartBtnTshirt.click();
    }
    public void addBackpackToCart(){
        addToCartBtnBackpack.click();
    }

    public CartPage openCart(){
        shoppingCart.click();
        return new CartPage(super.getDriver());
    }

    public void openMenu(){
        menuBtn.click();
    }

    public LoginPage logout(){
        new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(logoutBtn));
        logoutBtn.click();
        return new LoginPage(super.getDriver());
    }



}
