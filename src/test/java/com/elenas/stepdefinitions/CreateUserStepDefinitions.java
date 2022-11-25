package com.elenas.stepdefinitions;

import com.elenas.questions.ValidateIf;
import com.elenas.tasks.CreateUser;
import com.elenas.tasks.Select;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static com.elenas.exceptions.Error.ERROR_FILLING_OUT_FROM_MESSAGE;
import static com.elenas.userinterfaces.LoginPage.CONTINUE_REGISTER_BUTTON;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateUserStepDefinitions {


    @When("complete registration form")
    public void completeRegistration(DataTable dataTable) {
        List<String> dataUser = dataTable.row(0);
        theActorCalled("Karen").attemptsTo(
                Select.country(),
                CreateUser.con(dataUser)
        );
    }

    @Then("he should validate that the form can be completed")
    public void heShouldValidateThatFormCanBeComplete() {
        theActorInTheSpotlight().should(
                seeThat(ValidateIf.theElementIsPresent(CONTINUE_REGISTER_BUTTON))
                        .orComplainWith(Error.class, ERROR_FILLING_OUT_FROM_MESSAGE)
        );
    }




}
