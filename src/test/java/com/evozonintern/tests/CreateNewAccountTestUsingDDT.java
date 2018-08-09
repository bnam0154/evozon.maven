package com.evozonintern.tests;

import com.evozonintern.pages.AdminDeleteAllUsers;
import com.evozonintern.steps.serenity.CreateNewAccountSteps;
import com.evozonintern.steps.serenity.DeleteusersSteps;
import com.evozonintern.utils.BaseTest;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.evozonintern.utils.Constants.CSV_FILE_PATH;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = CSV_FILE_PATH + "CreateNewAccountTestDataFile.csv", separator = ',')
public class CreateNewAccountTestUsingDDT extends BaseTest {

    @Steps
    CreateNewAccountSteps createNewAccountSteps;
    String firstName, lastName, middleName, email, pass;

    @Steps
    DeleteusersSteps deleteusersSteps;

    @Test
    public void registerWithValidCredentials () {

        //deleteusersSteps.openPage();
        //todo norbert: implement clean up after creating accounts with csv users

        createNewAccountSteps.openPage();
        createNewAccountSteps.setFirsName(firstName);
        createNewAccountSteps.setMiddleName(middleName);
        createNewAccountSteps.setLastName(lastName);
        createNewAccountSteps.setEmail(email);
        createNewAccountSteps.setPass(pass);
        createNewAccountSteps.setPassConf(pass);
        createNewAccountSteps.clickcheckBox();
        createNewAccountSteps.submitregisterButton();

        //createNewAccountSteps.verifyIsCreated(firstName); todo norbert: verify uder reconstruction :)
    }

}
