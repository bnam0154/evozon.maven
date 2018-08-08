package com.evozonintern.tests;

import com.evozonintern.steps.serenity.LoginUserSteps;
import com.evozonintern.utils.BaseTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest extends BaseTest{

    private String email = "test@yahoo.com";
    private String pass = "parola11";

    @Steps
    LoginUserSteps loginUserSteps;

    @Test
    public void loginWithValidCredentials1024768() {
        loginUserSteps.openPage();
        setResolutionToW1024H768();
        loginUserSteps.login(email,pass);
    }


    @Test
    public void loginWithValidCredentials800600() {
        loginUserSteps.openPage();
        setResolutionToW800H600();
        loginUserSteps.login(email,pass);
    }


    @Test
    public void loginWithValidCredentials20801280() {
        loginUserSteps.openPage();
        setResolutionToW2048H1280();
        loginUserSteps.login(email,pass);
    }

    @Test
    public void loginWithValidCredentials51202160() {
        loginUserSteps.openPage();
        setResolutionToW5120H2160();
        loginUserSteps.login(email,pass);
    }

}
