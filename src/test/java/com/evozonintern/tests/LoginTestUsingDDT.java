package com.evozonintern.tests;

import com.evozonintern.steps.serenity.LoginUserSteps;
import com.evozonintern.utils.BaseTest;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.evozonintern.utils.Constants.CSV_FILE_PATH;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = CSV_FILE_PATH + "LoginTestDataFile.csv", separator = ',')
public class LoginTestUsingDDT extends BaseTest {

    @Steps
    LoginUserSteps loginUserSteps;
    String email, password;

    @Test
    public void loginTest() {

        loginUserSteps.openPage();
        loginUserSteps.login(email,password);
        loginUserSteps.validateSuccesfullLogin();

    }



}
