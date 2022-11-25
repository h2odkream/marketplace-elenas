package com.elenas.stepdefinitions;

import com.elenas.models.enums.DataUser;
import com.elenas.questions.ValidateIf;
import com.elenas.tasks.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static com.elenas.exceptions.Error.ERROR_CREATING_USER_MESSAGE;
import static com.elenas.userinterfaces.LoginPage.CALIFICATIONS_MODULE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {

    @Given("the {string} open the page {string}")
    public void theUserOpenPage(String actor, String url){
        theActorCalled(actor).attemptsTo(
                Open.url(url)
        );
    }

    @When("the {string} login with {string} and {string}")
    public void theLoginWithTheUserSDataPruebanequiGmailComAndEcheverria(String actor, String email, String password) {
        theActorCalled(actor).attemptsTo(
                Login.con(DataUser.username, DataUser.password)
        );
    }
    @Then("he should see the successful login")
    public void debeVerSuInformacion() {

        theActorInTheSpotlight().should(
                seeThat(ValidateIf.theElementIsPresent(CALIFICATIONS_MODULE))
                        .orComplainWith(Error.class, ERROR_CREATING_USER_MESSAGE)
        );
    }


}
