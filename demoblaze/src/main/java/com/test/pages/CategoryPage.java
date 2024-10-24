package com.test.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends PageObject {

    @FindBy(linkText = "Phones")
    private WebElement phonesCategory;

    @FindBy(linkText = "Laptops")
    private WebElement laptopsCategory;

    @FindBy(linkText = "Monitors")
    private WebElement monitorsCategory;

    public void selectCategory(String category) {
        switch (category) {
            case "Phones":
                phonesCategory.click();
                break;
            case "Laptops":
                laptopsCategory.click();
                break;
            case "Monitors":
                monitorsCategory.click();
                break;
        }
    }
}
