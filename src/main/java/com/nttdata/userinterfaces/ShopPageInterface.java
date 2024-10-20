package com.nttdata.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Link;
import org.openqa.selenium.By;

/**
 * En esta pagina se encuentran mapeadas  la utl y el boton que redirigen al formulario de compras.
 */
public class ShopPageInterface {
   public static final Target PATH_CART = Link.withNameOrId("shopping-cart-link");
   public static final Target BTN_CHECKOUT= Target.the("Button Checkout").located(By.id("checkout"));

}
