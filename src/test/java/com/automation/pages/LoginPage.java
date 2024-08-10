package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//h1[@id='login']")
    WebElement loginText;
    @FindBy(id = "CustomerEmail")
    WebElement emailField;
    @FindBy(id = "CustomerPassword")
    WebElement passwordField;
    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement signInbtn;


    public boolean verifyUserIsOnLoginPage() {
        return signInbtn.isDisplayed() && loginText.isDisplayed();
    }


    public void userEnterValidLoginCredentials(String username,String password) {
        emailField.sendKeys(ConfigReader.getConfigValue(username));
        passwordField.sendKeys(ConfigReader.getConfigValue(password));
    }

    public void userClickOnLogInButton() {
        signInbtn.click();
    }
}
