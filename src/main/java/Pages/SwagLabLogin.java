package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLogin {


    //declaration

    @FindBy(xpath = "//input[@id=\"user-name\"]") private WebElement userName;
    @FindBy(xpath = "//input[@id=\"password\"]") private WebElement password;
    @FindBy(xpath = "//input[@id=\"login-button\"]") private WebElement loginButton;
     @FindBy(xpath = "//div[@class=\"error-message-container error\"]") private
     WebElement errorMessage;


    //initilization
    public SwagLabLogin(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    //declaration
    public void InSwaglabUsernameEnter(String UNSwagLab)
    {
        userName.sendKeys(UNSwagLab);
    }
    public void InSwagLabPasswordEnter(String PassSwagLab)
    {
         password.sendKeys(PassSwagLab);
    }

    public void clickonLoginButtonSwagLab()
    {
        loginButton.click();
    }

    public boolean geterrormsgSwaglab()
    {

        boolean result = false;

        try {
            result = errorMessage.isDisplayed();


        }

        catch (Exception e)
        {
            System.out.println("element not found");
        }
         return result;

    }

}
