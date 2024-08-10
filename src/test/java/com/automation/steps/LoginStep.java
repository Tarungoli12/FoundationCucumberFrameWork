package com.automation.steps;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStep {

    LoginPage loginPage = new LoginPage();

    @Then("verify user is on login page")
    public void verify_user_is_on_login_page() {
        Assert.assertTrue(loginPage.verifyUserIsOnLoginPage());
    }

    @When("user enter valid email {string} and password {string}")
    public void user_enter_valid_email_and_password(String username, String password) {
        loginPage.userEnterValidLoginCredentials(username,password);
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        loginPage.userClickOnLogInButton();
    }
}
