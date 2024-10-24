Feature: Comprar productos en la tienda Product Store

  Scenario: Registro y compra de producto
    Given el usuario ingresa a la página
    When el usuario se registra
    And el usuario selecciona la categoría "Phones"
    And el usuario selecciona el producto "Samsung"
    Then el usuario realiza la compra exitosamente
