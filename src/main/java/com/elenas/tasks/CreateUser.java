package com.elenas.tasks;

import com.elenas.models.enums.DataUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static com.elenas.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreateUser implements Task
{
    private List<String> datos;
    static String user;
    static String password;
    public CreateUser(List<String> datos){
        this.datos=datos;
    }

    public static Performable con(List<String> datos){
        return instrumented(CreateUser.class, datos);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        int i =0;

        actor.attemptsTo(
                Click.on(SIGNUP_LINK),
                Click.on(EMAIL),
                Enter.keyValues(datos.get(i)).into(EMAIL));
        user=datos.get(i);
        actor.attemptsTo(
                Click.on(CELLPHONE),
                Enter.keyValues(datos.get(++i)).into(CELLPHONE),
                Enter.keyValues(datos.get(++i)).into(PASSWORD),
                Click.on(PASSWORD));
        password=datos.get(i);
        actor.attemptsTo(
                Enter.keyValues(datos.get(i)).into(CONFIRM_PASSWORD),
                Click.on(TERMS_ADN_CONDITIONS),
                Click.on(REGISTER_BUTTON),
                WaitUntil.the(PERFIL,isVisible())
        );

        DataUser.username=user;
        DataUser.password=password;

    }
}
