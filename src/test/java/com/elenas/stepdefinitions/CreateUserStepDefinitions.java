package com.elenas.stepdefinitions;

import com.elenas.questions.ValidateIf;
import com.elenas.tasks.CreateUser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static com.elenas.exceptions.Error.ERROR_LOGIN_MESSAGE;
import static com.elenas.userinterfaces.LoginPage.PERFIL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateUserStepDefinitions {

    @When("creating a new user")
    public void creatingANewUser(DataTable dataTable) {
        List<String> datos = dataTable.row(0);
        theActorInTheSpotlight().attemptsTo(
                CreateUser.con(datos)
        );
    }

    @Then("he should validate that it has been successfully created.")
    public void heShouldValidateThatItHasBeenSuccessfullyCreated() {
        theActorInTheSpotlight().should(
                seeThat(ValidateIf.theElementIsPresent(PERFIL))
                        .orComplainWith(Error.class, ERROR_LOGIN_MESSAGE)
        );
    }




}
