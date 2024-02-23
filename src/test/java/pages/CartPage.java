package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id="checkout")
    private WebElement checkoutBtn;
    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    private WebElement removeTshirtBtn;

    public CheckoutPage navigateToCheckout(){
        checkoutBtn.click();

        return new CheckoutPage(super.getDriver());
    }

    public void removeProduct(){
        removeTshirtBtn.click();
        waitSomeSeconds(5);
    }

    public boolean isRemovedProductDisplayed(){
        return removeTshirtBtn.isDisplayed();
    }
}
