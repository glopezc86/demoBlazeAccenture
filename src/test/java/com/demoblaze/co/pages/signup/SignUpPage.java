package com.demoblaze.co.pages.signup;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends PageObject {
    @FindBy(id="sign-username")
    protected WebElementFacade txt_sign_username;

    @FindBy(id="sign-password")
    protected WebElementFacade txt_sign_password;

    @FindBy(xpath = "//button[normalize-space()='Sign up']")
    protected WebElementFacade button_SignUp;

    @FindBy(id = "signin2")
    protected WebElementFacade index_signin2;
}
