package com.demoblaze.co.steps.signup;

import com.demoblaze.co.pages.signup.SignUpPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.time.temporal.ChronoUnit.SECONDS;

public class SignUpStep extends SignUpPage {


    @Step("Ingresar nuevo usuario")
    public void typeUsername (String username){
        txt_sign_username.sendKeys(username);
    }

    @Step("Ingresar nuevo password")
    public void typePassword (String password){
        txt_sign_password.sendKeys(password);
    }

    @Step("Click en el boton de SignUp")
    public void clickSingUp (){
        button_SignUp.click();
    }

    @Step("Click en el boton SignUp Index")
    public void clickSignUpIndex(){
        index_signin2.click();
    }

    @Step("Click en el boton Aceptar del Alert")
    public String clickAceptarAlert() throws InterruptedException {

        String expectedText = "Sign up successful.";

        Alert alert = getDriver().switchTo().alert();
        Thread.sleep(2000);
        if (expectedText.equals(alert.getText())){
            System.out.println("Entra a Alert y toma el texto" + alert.getText());
        }
        else {
            System.out.println("NO ENCUENTRA ALGO");
        }
        alert.accept();
        return alert.getText();


       /* WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       // wait.until(ExpectedConditions.alertIsPresent());
        getDriver().switchTo().alert();
        String text_Alert = getDriver().switchTo().alert().getText();
        getDriver().switchTo().alert().accept();*/


    }
}
