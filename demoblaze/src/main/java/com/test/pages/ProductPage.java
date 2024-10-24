package com.test.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageObject {

    @FindBy(linkText = "Samsung galaxy s6")
    private WebElement samsungProduct;

    @FindBy(linkText = "Sony vaio i5")
    private WebElement sonyProduct;

    public void selectProduct(String product) {
        switch (product) {
            case "Samsung":
                samsungProduct.click();
                break;
            case "Sony":
                sonyProduct.click();
                break;
        }
    }
}
