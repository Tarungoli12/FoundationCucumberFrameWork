package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//a[@class='header__icon header__icon--account link focus-inset small-hide']")
    WebElement isHomePageDisplayedBtn;
    @FindBy(xpath = "//span[text()='NEW ARRIVALS']")
    WebElement isSearchBtn;

    public void openWebsite() {
        driver.get(ConfigReader.getConfigValue("valid.url"));
    }

    public boolean verifyUserIsOnHomePage() {
        return isHomePageDisplayedBtn.isDisplayed() && isSearchBtn.isDisplayed();
    }

    public void clickOnLoginButton() {
        isHomePageDisplayedBtn.click();
    }


}
