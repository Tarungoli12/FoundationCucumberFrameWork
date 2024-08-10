package com.automation.steps;

import com.automation.pages.UserHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserHomeStep {
    UserHomePage userHomePage = new UserHomePage();

    @Then("verify user is on userHome page")
    public void verify_user_is_on_user_home_page() {
        Assert.assertEquals("Account", userHomePage.verifyUserSuccessfullyLogIn());
    }

    @When("user click on logout button")
    public void user_click_on_logout_button() {
        userHomePage.clickOnLogoutButton();
    }

    @When("user click on TShirt item")
    public void userClickOnTShirtItem() {
        userHomePage.clickOnTShirtItem();
    }

    @Then("verify user is on TShirt items page")
    public void verifyUserIsOnTShirtItemsPage() {
        Assert.assertTrue(userHomePage.verifyTShirtItemsPageDisplayed().contains("Tshirt"));
    }

    @When("user click on first TShirt item")
    public void userClickOnFirstTShirtItem() {
        userHomePage.clickOnFirstTShirtItem();
    }

    @And("click on add to cart button")
    public void clickOnAddToCartButton() {
        userHomePage.clickOnAddToCart();
    }

    @Then("verify TShirt item is added into cart successfully")
    public void verifyTShirtItemIsAddedIntoCartSuccessfully() {
        userHomePage.verifyItemIsAddedInToCart();
    }

    @When("user click on remove item")
    public void userClickOnRemoveItem() {
        userHomePage.clickOnRemoveBtn();
    }

    @Then("verify product is removed from cart")
    public void verifyProductIsRemovedFromCart() {
        Assert.assertEquals("Your cart is empty",userHomePage.verifyItemIsRemovedFromCart());
    }
}
