#Author: Andres Felipe Villalba Zapata
  Feature: As a plazavea customer i need to add a product to the shopping cart

    @AddToCart
    Scenario: Add product to shopping cart
      Given That the client is located on the Plazavea website
      When Add a product to the shopping cart
      Then Verify that the product was added