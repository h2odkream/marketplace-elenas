package com.elenas.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

	public static final Target LOGIN_LINK = Target.the("Login link").locatedBy("//a[contains(text(),\"Iniciar sesion\")]");
	public static final Target SIGNUP_LINK = Target.the("Signup link").locatedBy("//a[contains(text(),\"Crea tu cuenta\")]");
	public static final Target EMAIL = Target.the("Correo").located(By.id("email"));
	public static final Target PASSWORD = Target.the("Enter you parssword").located(By.id("password"));
	public static final Target CONFIRM_PASSWORD = Target.the("Confirm your password").located(By.id("matchPassword"));
	public static final Target CELLPHONE = Target.the("Cellphone").located(By.id("cellphone"));
	public static final Target TERMS_ADN_CONDITIONS = Target.the("Check box of terms and conditions").located(By.id("terms"));
	public static final Target REGISTER_BUTTON = Target.the("Register button").locatedBy("//button[@class=\"ant-btn ant-btn-primary ant-btn-block\"]");
	public static final Target LOGIN_BUTTON = Target.the("Login button").locatedBy("//button[@class=\"ant-btn ant-btn-primary ant-btn-block\"]");
	public static final Target OK_BUTTON = Target.the("Ok button").locatedBy("(//button[@class=\"ant-btn ant-btn-primary\"])[2]");
	public static final Target COMPLETE_PROFILE = Target.the("Complete your profile").locatedBy("//div[contains(text(),\"¡Completa tu perfil y destaca tu marca!\")]");
	public static final Target CALIFICATIONS_MODULE = Target.the("Complete your profile").locatedBy("//h2[contains(text(),\"Calificaciones\")]");

}