package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class OverviewPage extends BasePage {

    public OverviewPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "finish")
    private WebElement finishBtn;

    public ResultPage finishOrder(){
        finishBtn.click();
        return new ResultPage(super.getDriver());
    }
}
