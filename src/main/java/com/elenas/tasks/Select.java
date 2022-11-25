package com.elenas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.elenas.userinterfaces.LoginPage.CONTINUE_COUNTRY_BUTTON;
import static com.elenas.userinterfaces.LoginPage.COUNTRY_COLOMBIA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Select implements Task
{

    public static Performable country(){
        return instrumented(Select.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(COUNTRY_COLOMBIA, isVisible()),
                Click.on(COUNTRY_COLOMBIA),
                Click.on(CONTINUE_COUNTRY_BUTTON));
    }
}
