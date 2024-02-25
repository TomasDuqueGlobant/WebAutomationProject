package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
    @FindBy(xpath = "//button[@id=\"remove-sauce-labs-backpack\"]")
    private WebElement removeBackPackBtn;
    @FindBy(id = "remove-sauce-labs-bike-light")
    private WebElement removeBikeBtn;

    public CheckoutPage navigateToCheckout(){
        checkoutBtn.click();

        return new CheckoutPage(super.getDriver());
    }

    public void removeProducts(){
        removeTshirtBtn.click();
        removeBikeBtn.click();
        removeBackPackBtn.click();
    }

    public boolean isRemovedProductDisplayed() {
        boolean removeBackPackNotPresent = isElementNotPresent(removeBackPackBtn);
        boolean removeBikeBtnNotPresent = isElementNotPresent(removeBikeBtn);
        boolean removeTshirtBtnNotPresent = isElementNotPresent(removeTshirtBtn);

        return removeBackPackNotPresent && removeBikeBtnNotPresent && removeTshirtBtnNotPresent;
    }
}
