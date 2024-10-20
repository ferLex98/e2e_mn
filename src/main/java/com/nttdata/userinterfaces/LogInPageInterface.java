package com.nttdata.userinterfaces;


import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class LogInPageInterface {
    public static final Target INPUT_USERNAME = Target.the("Input Username").located(By.id("user-name"));
    public static final Target INPUT_PASSWORD = Target.the("Input Password").located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("Button Login").located(By.id("login-button"));

}
