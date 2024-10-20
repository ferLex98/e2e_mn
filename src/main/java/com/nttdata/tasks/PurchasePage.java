package com.nttdata.tasks;
import com.nttdata.userinterfaces.PurchasePageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
public class PurchasePage {
    public static Task completeCheckout(String firstName, String lastName, String postalCode) {
        return Task.where(
                Enter.theValue(firstName).into(PurchasePageInterface.INPUT_FIRSTNAME),
                Enter.theValue(lastName).into(PurchasePageInterface.INPUT_LASTNAME),
                Enter.theValue(postalCode).into(PurchasePageInterface.INPUT_POSTCODE),
                Click.on(PurchasePageInterface.BTN_CONTINUE)
        );
    }

    public static Task finishCheckout() {
        String msjCompleteOrder = "Thank you for your order!";
        return Task.where(
                Ensure.that(PurchasePageInterface.LBL_SUM_TOTAL).text().isEqualTo("Total: $43.18"),
                Click.on(PurchasePageInterface.BTN_FINISH),
                Ensure.that(PurchasePageInterface.LBL_SUBMIT_ORDER).text().isEqualTo(msjCompleteOrder)
        );
    }


}
