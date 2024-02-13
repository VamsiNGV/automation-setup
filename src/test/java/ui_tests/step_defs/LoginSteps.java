package ui_tests.step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import ui_tests.pages.BasePage;

public class LoginSteps extends BasePage {
    WebDriver driver;
    @Given("I am on the login page")
    public void login(){
        getLoginPage().validateLoginPage();
    }

    @When("I enter {string} and {string}")
    public void iEnterAnd(String userName, String password) {
        getLoginPage().login(userName, password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {

    }
}
