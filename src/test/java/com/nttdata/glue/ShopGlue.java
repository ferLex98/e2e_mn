package com.nttdata.glue;

import com.nttdata.tasks.LogInPage;
import com.nttdata.tasks.PurchasePage;
import com.nttdata.tasks.ShopProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.CastMember;

import javax.xml.catalog.Catalog;


public class ShopGlue {

    @CastMember(name= "michelle")
    Actor michelle;

    @Given("^Inicio de sesion (.*) (.*)$")
    public void login(String username,String password) {
        michelle.attemptsTo(
                LogInPage.logIn(username,password)
        );
    }

    @Given("^Selecciona dos productos del listado (.*) (.*)$")
    public void seleccionarProductos(String prod1,String prod2) {
        michelle.attemptsTo(
                ShopProductPage.addProduct(prod1),
                ShopProductPage.addProduct(prod2)
        );
    }

    @Then("Ver el carrito$")
    public void viewCart(){
        michelle.attemptsTo(
                ShopProductPage.viewCart()
        );
    }

    @And("^Llenar e formulario de compra (.*) (.*) (.*)$")
    public void purchase(String firstName,String lastName, String postCode) {
        michelle.attemptsTo(
                ShopProductPage.checkout(),
                PurchasePage.completeCheckout(firstName, lastName, postCode)
        );
    }

    @And("Completar la compra$")
    public void purchaseCompleta() {
        michelle.attemptsTo(
                PurchasePage.finishCheckout()
        );

    }





}
