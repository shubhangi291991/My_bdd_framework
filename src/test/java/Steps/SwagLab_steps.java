package Steps;

import LibraryFile.DriverFactory;
import LibraryFile.UtilityClass;
import Pages.SwagLabHome;
import Pages.SwagLabLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;

public class SwagLab_steps {


    SwagLabLogin Login=new SwagLabLogin(DriverFactory.driver);
     SwagLabHome home=new SwagLabHome(DriverFactory.driver);

    @Given("user is on swagLablogin page")
    public void user_is_on_swag_lablogin_page() throws IOException {
           String Urlvalue= UtilityClass.GetPFData("URL");
       DriverFactory.driver.get(Urlvalue);
    }
    @When("User Enter valid Swaglab Username as {string}")
    public void user_enter_valid_swaglab_username_as(String UNkey) throws IOException {
        String UNValue=UtilityClass.GetPFData(UNkey);

        Login.InSwaglabUsernameEnter(UNValue);
    }
    @When("user enter valid swaglab password  as {string}")
    public void user_enter_valid_swaglab_password_as(String passkey) throws IOException {
        String Passvalue=UtilityClass.GetPFData(passkey);
        Login.InSwagLabPasswordEnter(Passvalue);
    }
    @When("user click on swaglab login button")
    public void user_click_on_swaglab_login_button() {
        Login.clickonLoginButtonSwagLab();
    }
    @Then("swaglab page should be visible with test {string}")
    public void swaglab_page_should_be_visible_with_test(String explogotext) {

        String acttxt=home.getSwaglabLogotext();
        Assert.assertEquals(explogotext,acttxt,"SwagLab Logo text is incorrect");
    }

    @When("wait for {int} second")
    public void wait_for_second(Integer timewait) throws InterruptedException {

        Thread.sleep(timewait*1000);
    }

    @When("user enter invalid swaglab password  as {string}")
    public void user_enter_invalid_swaglab_password_as(String invalidpasskey) throws IOException {
         String passinvalidvalue=UtilityClass.GetPFData(invalidpasskey);
         Login.InSwagLabPasswordEnter(passinvalidvalue);
    }
    @Then("login failed error message")
    public void login_failed_error_message() {
         boolean acterrormessage=Login.geterrormsgSwaglab();
         Assert.assertTrue(acterrormessage,"Failed error message is incorrect");
    }
}