package com.elenas.tasks;

import com.elenas.models.enums.DataUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.elenas.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class Login implements Task
{
    private String email;
    private String password;

    public Login(String email, String password){
        this.email =email;
        this.password =password;
    }

    public static Performable con(String email, String password){
        return instrumented(Login.class, email, password);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        email= DataUser.getUsername();
        password= DataUser.getPassword();
        actor.attemptsTo(
                Click.on(LOGIN_LINK),
                Click.on(EMAIL),
                Enter.keyValues(email).into(EMAIL),
                Click.on(PASSWORD),
                Enter.keyValues(password).into(PASSWORD),
                Click.on(LOGIN_BUTTON),
                WaitUntil.the(OK_BUTTON,isPresent()),
                Click.on(OK_BUTTON)
        );

    }
}
