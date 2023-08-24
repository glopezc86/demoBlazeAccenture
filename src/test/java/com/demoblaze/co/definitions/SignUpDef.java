package com.demoblaze.co.definitions;

import com.demoblaze.co.steps.signup.SignUpStep;
import com.demoblaze.co.steps.validations.ValidationStep;
import com.demoblaze.co.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SignUpDef {
    @Steps(shared=true)
    WebSite url;

    @Steps(shared = true)
    SignUpStep signup;


    @Given("el usuario se registra en el sitio web")
    public void userIsRegistered(){
        url.navigateTo("https://demoblaze.com/index.html");
    }


    @When("ingresa username y password")
    public void typeUsernameAndPassword() throws InterruptedException {
        signup.clickSignUpIndex();
        signup.typeUsername("a1a1a1a14");
        signup.typePassword("111");
        signup.clickSingUp();
        Thread.sleep(5000);
        signup.clickAceptarAlert();
        Thread.sleep(2000);
    }


    @Then("la aplicación muestra mensaje: Sign up successful")
    public void systemShowsSuccessfullMessage() throws InterruptedException {
      //Assert.assertTrue(validate.signUpIsSuccesfull());
        Assert.assertEquals("Sign up successful.", signup.clickAceptarAlert());
    }
}
