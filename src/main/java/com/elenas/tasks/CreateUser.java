package com.elenas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static com.elenas.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreateUser implements Task
{
    private List<String> dataUser;
    public CreateUser(List<String> dataUser){
        this.dataUser =dataUser;
    }

    public static Performable con(List<String> dataUser){
        return instrumented(CreateUser.class, dataUser);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        int i =0;
        Select.country();
        actor.attemptsTo(
                WaitUntil.the(CREATE_ACCOUNT_OPTION_BUTTON,isClickable()),
                Click.on(CREATE_ACCOUNT_OPTION_BUTTON),
                WaitUntil.the(NAME,isClickable()),
                Click.on(NAME),
                Enter.keyValues(dataUser.get(i++)).into(NAME),
                Enter.keyValues(dataUser.get(i++)).into(LAST_NAME),
                Click.on(EMAIL),
                Enter.keyValues(dataUser.get(i++)).into(EMAIL),
                Click.on(CELLPHONE),
                Enter.keyValues(dataUser.get(i++)).into(CELLPHONE),
                Click.on(CHECK_BOX_TERMS_AND_CONDITIONS),
                Click.on(CODE_REFERENCIAL),
                WaitUntil.the(CONTINUE_REGISTER_BUTTON,isVisible())
        );


    }
}
