package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHome {



    @FindBy(xpath = "//div[@class=\"app_logo\"]") private WebElement swaglabLogotext;

    public SwagLabHome(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getSwaglabLogotext() {
        String acttxt = swaglabLogotext.getText();
        return acttxt;
    }
}
