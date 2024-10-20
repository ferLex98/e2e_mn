package com.nttdata.tasks;

import com.nttdata.userinterfaces.ShopPageInterface;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ShopProductPage {
    public static Task addProduct(String selectorProduct) {
        return Task.where(
                Click.on(selectorProduct)
        );

    }

    public static Task viewCart(){
        return Task.where(
                Click.on(ShopPageInterface.PATH_CART)
        );
    }

    public static Task checkout(){
        return Task.where(
                Click.on(ShopPageInterface.BTN_CHECKOUT)
        );
    }
}
