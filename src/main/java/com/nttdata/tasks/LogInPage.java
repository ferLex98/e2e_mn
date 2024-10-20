package com.nttdata.tasks;

import com.nttdata.userinterfaces.LogInPageInterface;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class LogInPage {
    public static Task logIn(String username, String password) {
        return Task.where(
                Open.url("https://www.saucedemo.com/"),
                Enter.theValue(username).into(LogInPageInterface.INPUT_USERNAME),
                Enter.theValue(password).into(LogInPageInterface.INPUT_PASSWORD),
                Click.on(LogInPageInterface.BTN_LOGIN)
        );
    }
}
