package com.evozonintern.tests;

import com.evozonintern.steps.serenity.CreateNewAccountSteps;
import com.evozonintern.utils.BaseTest;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.evozonintern.utils.Constants.CSV_FILE_PATH;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = CSV_FILE_PATH + "a.csv", separator = ',')
public class CreateNewAccountTestUsingDDT extends BaseTest {

    @Steps
    CreateNewAccountSteps createNewAccountSteps;
    String firstName, lastName, middleName, email, pass;


    @Test
    public void registerWithValidCredentials () {
        createNewAccountSteps.openPage();
        createNewAccountSteps.setFirsName(firstName);
        createNewAccountSteps.setMiddleName(middleName);
        createNewAccountSteps.setLastName(lastName);
        createNewAccountSteps.setEmail(email);
        createNewAccountSteps.setPass(pass);
        createNewAccountSteps.setPassConf(pass);
        createNewAccountSteps.clickcheckBox();
        createNewAccountSteps.submitregisterButton();
    }

}
