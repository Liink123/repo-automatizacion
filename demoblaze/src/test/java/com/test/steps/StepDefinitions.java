package com.test.steps;

import com.test.pages.CategoryPage;
import com.test.pages.HomePage;
import com.test.pages.ProductPage;
import io.cucumber.java.en.*;

public class StepDefinitions {

    HomePage homePage;
    CategoryPage categoryPage;
    ProductPage productPage;

    @Given("el usuario ingresa a la página")
    public void el_usuario_ingresa_a_la_pagina() {
        homePage.open();
    }

    @When("el usuario se registra")
    public void el_usuario_se_registra() {
        homePage.clickLogin();
        // Lógica de registro
    }

    @When("el usuario selecciona la categoría {string}")
    public void el_usuario_selecciona_la_categoria(String category) {
        categoryPage.selectCategory(category);
    }

    @When("el usuario selecciona el producto {string}")
    public void el_usuario_selecciona_el_producto(String product) {
        productPage.selectProduct(product);
    }

    @Then("el usuario realiza la compra exitosamente")
    public void el_usuario_realiza_la_compra_exitosamente() {
        // Lógica de compra
    }
}

