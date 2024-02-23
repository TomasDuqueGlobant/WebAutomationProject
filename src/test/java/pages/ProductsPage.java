package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartButtonBackpack;

    @FindBy(className="shopping_cart_link")
    private WebElement shoppingCart;
    public boolean isAddToCartButtonVisible(){
        waitElementVisibility(addToCartButtonBackpack);
        return addToCartButtonBackpack.isDisplayed();

    }
    public void addToCart(){
        addToCartButtonBackpack.click();
    }

    public CartPage openCart(){
        shoppingCart.click();
        return new CartPage(super.getDriver());
    }



}
