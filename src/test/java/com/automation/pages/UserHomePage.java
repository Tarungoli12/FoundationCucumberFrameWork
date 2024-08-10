package com.automation.pages;


import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserHomePage extends BasePage{

    @FindBy(xpath = "//h1[@class='customer__title']")
    WebElement accountText;
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logoutBtn;
    @FindBy(id = "HeaderMenu-men-tshirts")
    WebElement tShirtBtn;
    @FindBy(xpath = "//a[@id='CardLink-template--16951357505780__product-grid-8581673812212']")
    WebElement firstTShirtBtn;
    @FindBy(xpath = "//button[@name='add']")
    WebElement addToCartBtn;
    @FindBy(id = "cart-icon-bubble")
    WebElement cartIconBtn;
    @FindBy(xpath = "//a[@class='cart-item__name h4 break']")
    WebElement actualText;
    @FindBy(xpath = "//a[@aria-label='Remove Worldwide Graphic Printed Black Tshirt - S']//*[name()='svg']")
    WebElement removeBtn;
    @FindBy(xpath = "//h1[@class='cart__empty-text']")
    WebElement cartEmptyText;

    public String verifyUserSuccessfullyLogIn() {
        return accountText.getText();
    }

    public void clickOnLogoutButton() {
        logoutBtn.click();
    }

    public void clickOnTShirtItem() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",tShirtBtn);
    }

    public String verifyTShirtItemsPageDisplayed() {
        return firstTShirtBtn.getText();
    }

    public void clickOnFirstTShirtItem() {
        firstTShirtBtn.click();
    }
    public void clickOnAddToCart() {
        addToCartBtn.click();
    }

    public void verifyItemIsAddedInToCart() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        cartIconBtn.click();
        String actual = actualText.getText();
        Assert.assertTrue(actual.contains("Tshirt"));
    }

    public void clickOnRemoveBtn() {
        removeBtn.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyItemIsRemovedFromCart() {
        return cartEmptyText.getText();
    }


}
