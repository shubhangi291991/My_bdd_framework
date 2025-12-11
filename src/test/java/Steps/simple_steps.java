package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class simple_steps {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("user is on login page");
    }
    @When("User Enter valid Username")
    public void user_enter_valid_username() {
        System.out.println("User Enter valid Username");
    }
    @When("User Enter Valid Password")
    public void user_enter_valid_password() {
        System.out.println("User Enter valid Password");
    }
    @When("User click on Login Button")
    public void user_click_on_login_button() {
        System.out.println("User click on Login Button");
    }
    @Then("Home page should be visible")
    public void home_page_should_be_visible() {
        System.out.println("Home page should be visible");
    }




    //scenario 2


    @When("User Enter Invalid Username")
    public void user_enter_invalid_username() {
        System.out.println("User Enter Invalid Username");
    }
    @When("User Enter Invalid Password")
    public void user_enter_invalid_password() {
        System.out.println("User Enter Invalid Password");
    }
    @Then("Wrong page should be visible")
    public void wrong_page_should_be_visible() {
        System.out.println("Wrong page should be visible");
    }

    //scenario 3

    @When("user enter username as {string}")
    public void user_enter_username_as(String UN) {
        System.out.println("User enter username as " + UN);
    }
    @When("user enter password as {string}")
    public void user_enter_password_as(String password) {
        System.out.println("User enter password as " + password);
    }
    @When("user enter valid pin as {int}")
    public void user_enter_valid_pin_as(Integer pincode) {
        System.out.println("User enter valid pin as " + pincode);
    }
    @When("user click on Login button")
    public void user_click_on_Login_button() {
        System.out.println("User click on Login button");
    }

    @Then("user should be on home page with display {string}")
    public void user_should_be_on_home_page_with_display(String validhomedata) {
        System.out.println("User should be on home page with display " + validhomedata);
    }

//scenario4



    @When("user enter valid username as {string}")
    public void user_enter_valid_username_as(String Username) {
        System.out.println("User enter valid username as " + Username);
    }
    @When("user enter valid password as {string}")
    public void user_enter_valid_password_as(String password) {
        System.out.println("User enter valid password as " + password);
    }

    @When("user enter valid pincode as {int}")
    public void user_enter_valid_pincode_as(Integer pincode) {
        System.out.println("User enter valid pincode as " + pincode);
    }


    @Then("home page should be visible with logo test {string}")
    public void home_page_should_be_visible_with_logo_test(String logotest) {
        System.out.println("home page should be visible with logo test " + logotest);
    }
}
