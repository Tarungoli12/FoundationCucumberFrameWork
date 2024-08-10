package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeStep {

    HomePage homePage = new HomePage();

    @Given("user open the website")
    public void user_open_the_website() {
        homePage.openWebsite();
    }

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        Assert.assertTrue(homePage.verifyUserIsOnHomePage());
    }


    @When("user click on login button")
    public void userClickOnLoginButton() {
        homePage.clickOnLoginButton();
    }
}
