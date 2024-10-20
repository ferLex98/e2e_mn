Feature: Compra de productos

  @happyTest
  Scenario Outline: Realizar la compra de dos productos, con login
    Given Inicio de sesion <username> <password>
    Given Selecciona dos productos del listado <prod1> <prod2>
    Then  Ver el carrito
    And   Llenar e formulario de compra <firstName> <lastName> <postcode>
    And   Completar la compra


    Examples:
      | username      | password     | prod1                            | prod2                              | firstName | lastName | postcode |
      | standard_user | secret_sauce | #add-to-cart-sauce-labs-backpack | #add-to-cart-sauce-labs-bike-light | Michelle  | Nunez    | 170905   |