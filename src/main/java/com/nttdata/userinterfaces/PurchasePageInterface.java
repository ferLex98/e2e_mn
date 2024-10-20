package com.nttdata.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.ui.PageElement;

/**
 * En esta clase se encuentran mapeados los componentes del formulario de compras
 * separados de acuerdo al tipo.
 */
public class PurchasePageInterface {
    public static final Target INPUT_FIRSTNAME = Target.the("Input First Name").located(By.id("first-name"));
    public static final Target INPUT_LASTNAME = Target.the("Input Last Name").located(By.id("last-name"));
    public static final Target INPUT_POSTCODE = Target.the("Input Postal Code").located(By.id("postal-code"));

    public static final Target LBL_SUM_TOTAL = PageElement.withNameOrId("total-label");
    public static final Target LBL_SUBMIT_ORDER = PageElement.withNameOrId("complete-header");

    public static final Target BTN_CONTINUE = Target.the("Button Continue").located(By.id("continue"));
    public static final Target BTN_FINISH = Target.the("Button Finish").located(By.id("finish"));
}
