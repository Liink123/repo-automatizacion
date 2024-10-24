package com.test.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    @FindBy(id = "login2")
    private WebElement loginButton;

    public void clickLogin() {
        loginButton.click();
    }
}
