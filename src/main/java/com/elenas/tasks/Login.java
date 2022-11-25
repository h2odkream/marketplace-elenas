package com.elenas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.elenas.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task
{
    private final String user;
    private final String password;
    public Login(String user, String password){
        this.user =user;
        this.password =password;
    }

    public static Performable con(String user, String password){
        return instrumented(Login.class, user, password);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

       actor.attemptsTo(
               WaitUntil.the(LOGIN_OPTION_BUTTON,isClickable()),
                Click.on(LOGIN_OPTION_BUTTON),
                WaitUntil.the(CELLPHONE_LOGIN,isVisible()).forNoMoreThan(60).seconds(),
                Enter.keyValues(user).into(CELLPHONE_LOGIN),
                Enter.keyValues(password).into(PASSWORD_LOGIN),
                Click.on(LOGIN_BUTTON),
                WaitUntil.the(UNKNOWN_USER_TEXT,isVisible())
        );


    }
}
