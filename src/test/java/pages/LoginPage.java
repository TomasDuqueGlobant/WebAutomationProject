package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);

    }

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    public void login(String username,String password ){
        this.username.click();
        this.username.sendKeys(username);
        this.password.click();
        this.password.sendKeys(password);
    }

}
