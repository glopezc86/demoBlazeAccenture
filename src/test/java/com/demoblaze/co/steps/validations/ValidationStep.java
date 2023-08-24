package com.demoblaze.co.steps.validations;

import com.demoblaze.co.pages.validations.ValidationPage;
import com.demoblaze.co.steps.signup.SignUpStep;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends SignUpStep {
    private String text_alert = super.clickAceptarAlert();

    public ValidationStep() throws InterruptedException {
    }


    @Step("validar registro satisfactorio")
    public Boolean signUpIsSuccesfull(){
        return "Sign up successful.".equals(text_alert);
    }
}
