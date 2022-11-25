package com.elenas.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/login_unknown_user.feature",
		glue = {"com.elenas.stepdefinitions"},
		snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LoginUnknownUserRunner {

}
