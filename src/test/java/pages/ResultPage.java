package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class ResultPage extends BasePage {

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "complete-header")
    private WebElement finishTitle;

    public boolean isPurchaseDone(String title) {
        waitElementVisibility(finishTitle);
        return finishTitle.isDisplayed() && finishTitle.getText().equalsIgnoreCase(title.toLowerCase());
    }
}
