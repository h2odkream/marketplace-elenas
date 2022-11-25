package com.elenas.stepdefinitions;

import com.elenas.questions.ValidateIf;
import com.elenas.tasks.Login;
import com.elenas.tasks.Select;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.elenas.exceptions.Error.ERROR_WHILE_VALIDATING_LOGIN_MESSAGE;
import static com.elenas.userinterfaces.LoginPage.UNKNOWN_USER_TEXT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginUnknownUserStepDefinitions {

    @When("enter data {string} and {string}")
    public void enterData(String user, String password) {
        theActorCalled("Karen").attemptsTo(
                Select.country(),
                Login.con(user, password)
        );
    }

    @Then("he should validate that the user is unknown")
    public void heShouldValidateThatMessage() {
        theActorInTheSpotlight().should(
                seeThat(ValidateIf.theElementIsPresent(UNKNOWN_USER_TEXT))
                        .orComplainWith(Error.class, ERROR_WHILE_VALIDATING_LOGIN_MESSAGE)
        );
    }




}
