package com.evozonintern.tests;

import com.evozonintern.steps.serenity.CreateNewAccountSteps;
import com.evozonintern.utils.BaseTest;
import com.github.javafaker.Faker;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class CreateNewAccountTest extends BaseTest {

    Faker faker = new Faker();
    
    private String firsName = faker.firstName();
    private String middleName = faker.firstName();
    private String lastName = faker.lastName();
    private String email = faker.firstName()+"@gmail.com";
    private String pass = "parola11";
    private String passConf = "parola11";

    private String emailInvalidNoName = "@gmail.com";
    private String emailInvalidNoHost = "ceva@.com";
    private String emailInvalidNoArond = "cevagmail.com";
    private String emailInvalidNoDot = "ceva@gmailcom";
    private String emailInvalidCharacter = "ceva())))@gmail.com";
    private String passTooShort = "p";
    private String passConfTooShort = "p";
    private String passConfNotMatching = "p";

    @Steps
    CreateNewAccountSteps createNewAccountSteps;

    @Test
    public void registerWithValidCredentials () {
        createNewAccountSteps.openPage();
        createNewAccountSteps.setFirsName(firsName);
        createNewAccountSteps.setMiddleName(middleName);
        createNewAccountSteps.setLastName(lastName);
        createNewAccountSteps.setEmail(email);
        createNewAccountSteps.setPass(pass);
        createNewAccountSteps.setPassConf(passConf);
        createNewAccountSteps.clickcheckBox();
        createNewAccountSteps.submitregisterButton();
        //Assert.assertTrue(accountPage.isLoggedIn(firsName));
    }

    @Test
    public void registerWithBlankCredentials () {
        createNewAccountSteps.openPage();
        createNewAccountSteps.submitregisterButton();
    }

    @Test
    public void registerWithNoFirstNameCredentials () {
        createNewAccountSteps.openPage();
        //createNewAccountSteps.setFirsName(firsName);
        createNewAccountSteps.setMiddleName(middleName);
        createNewAccountSteps.setLastName(lastName);
        createNewAccountSteps.setEmail(email);
        createNewAccountSteps.setPass(pass);
        createNewAccountSteps.setPassConf(passConf);
        createNewAccountSteps.clickcheckBox();
        createNewAccountSteps.submitregisterButton();
    }

    @Test
    public void registerWithNoMiddleNameCredentials () {
        createNewAccountSteps.openPage();
        createNewAccountSteps.setFirsName(firsName);
        //createNewAccountSteps.setMiddleName(middleName);
        createNewAccountSteps.setLastName(lastName);
        createNewAccountSteps.setEmail(email);
        createNewAccountSteps.setPass(pass);
        createNewAccountSteps.setPassConf(passConf);
        createNewAccountSteps.clickcheckBox();
        createNewAccountSteps.submitregisterButton();
    }

    @Test
    public void registerWithNoLastNameCredentials () {
        createNewAccountSteps.openPage();
        createNewAccountSteps.setFirsName(firsName);
        createNewAccountSteps.setMiddleName(middleName);
        //createNewAccountSteps.setLastName(lastName);
        createNewAccountSteps.setEmail(email);
        createNewAccountSteps.setPass(pass);
        createNewAccountSteps.setPassConf(passConf);
        createNewAccountSteps.clickcheckBox();
        createNewAccountSteps.submitregisterButton();
    }

    @Test
    public void registerWithNoEmailCredentials () {
        createNewAccountSteps.openPage();
        createNewAccountSteps.setFirsName(firsName);
        createNewAccountSteps.setMiddleName(middleName);
        createNewAccountSteps.setLastName(lastName);
        //createNewAccountSteps.setEmail(email);
        createNewAccountSteps.setPass(pass);
        createNewAccountSteps.setPassConf(passConf);
        createNewAccountSteps.clickcheckBox();
        createNewAccountSteps.submitregisterButton();
    }

    @Test
    public void registerWithNoPassCredentials () {
        createNewAccountSteps.openPage();
        createNewAccountSteps.setFirsName(firsName);
        createNewAccountSteps.setMiddleName(middleName);
        createNewAccountSteps.setLastName(lastName);
        createNewAccountSteps.setEmail(email);
        //createNewAccountSteps.setPass(pass);
        createNewAccountSteps.setPassConf(passConf);
        createNewAccountSteps.clickcheckBox();
        createNewAccountSteps.submitregisterButton();
    }

    @Test
    public void registerWithNoPassConfirmCredentials () {
        createNewAccountSteps.openPage();
        createNewAccountSteps.setFirsName(firsName);
        createNewAccountSteps.setMiddleName(middleName);
        createNewAccountSteps.setLastName(lastName);
        createNewAccountSteps.setEmail(email);
        createNewAccountSteps.setPass(pass);
        //createNewAccountSteps.setPassConf(passConf);
        createNewAccountSteps.clickcheckBox();
        createNewAccountSteps.submitregisterButton();
    }

    @Test
    public void registerWithNoCheckBoxCredentials () {
        createNewAccountSteps.openPage();
        createNewAccountSteps.setFirsName(firsName);
        createNewAccountSteps.setMiddleName(middleName);
        createNewAccountSteps.setLastName(lastName);
        createNewAccountSteps.setEmail(email);
        createNewAccountSteps.setPass(pass);
        createNewAccountSteps.setPassConf(passConf);
        //createNewAccountSteps.clickcheckBox();
        createNewAccountSteps.submitregisterButton();
    }

    @Test
    public void registerWithNoSubmitButtonClicked () {
        createNewAccountSteps.openPage();
        createNewAccountSteps.setFirsName(firsName);
        createNewAccountSteps.setMiddleName(middleName);
        createNewAccountSteps.setLastName(lastName);
        createNewAccountSteps.setEmail(email);
        createNewAccountSteps.setPass(pass);
        createNewAccountSteps.setPassConf(passConf);
        createNewAccountSteps.clickcheckBox();
        //createNewAccountSteps.submitregisterButton();
    }

    @Test
    public void registerWithInvalidEmailCredentials () {
        createNewAccountSteps.openPage();
        createNewAccountSteps.setFirsName(firsName);
        createNewAccountSteps.setMiddleName(middleName);
        createNewAccountSteps.setLastName(lastName);
        createNewAccountSteps.setEmail(emailInvalidNoName);
        createNewAccountSteps.setPass(pass);
        createNewAccountSteps.setPassConf(passConf);
        createNewAccountSteps.clickcheckBox();
        createNewAccountSteps.submitregisterButton();
        // =========================================
        this.refreshPage();
        createNewAccountSteps.openPage();
        createNewAccountSteps.setFirsName(firsName);
        createNewAccountSteps.setMiddleName(middleName);
        createNewAccountSteps.setLastName(lastName);
        createNewAccountSteps.setEmail(emailInvalidNoHost);
        createNewAccountSteps.setPass(pass);
        createNewAccountSteps.setPassConf(passConf);
        createNewAccountSteps.clickcheckBox();
        createNewAccountSteps.submitregisterButton();
        // =========================================
        this.refreshPage();
        createNewAccountSteps.openPage();
        createNewAccountSteps.setFirsName(firsName);
        createNewAccountSteps.setMiddleName(middleName);
        createNewAccountSteps.setLastName(lastName);
        createNewAccountSteps.setEmail(emailInvalidNoArond);
        createNewAccountSteps.setPass(pass);
        createNewAccountSteps.setPassConf(passConf);
        createNewAccountSteps.clickcheckBox();
        createNewAccountSteps.submitregisterButton();
        // =========================================
        this.refreshPage();
        createNewAccountSteps.openPage();
        createNewAccountSteps.setFirsName(firsName);
        createNewAccountSteps.setMiddleName(middleName);
        createNewAccountSteps.setLastName(lastName);
        createNewAccountSteps.setEmail(emailInvalidNoDot);
        createNewAccountSteps.setPass(pass);
        createNewAccountSteps.setPassConf(passConf);
        createNewAccountSteps.clickcheckBox();
        createNewAccountSteps.submitregisterButton();
        // =========================================
        this.refreshPage();
        createNewAccountSteps.openPage();
        createNewAccountSteps.setFirsName(firsName);
        createNewAccountSteps.setMiddleName(middleName);
        createNewAccountSteps.setLastName(lastName);
        createNewAccountSteps.setEmail(emailInvalidCharacter);
        createNewAccountSteps.setPass(pass);
        createNewAccountSteps.setPassConf(passConf);
        createNewAccountSteps.clickcheckBox();
        createNewAccountSteps.submitregisterButton();
        // ========================================= /

    }

    @Test
    public void registerWithTooShortPass () {
        createNewAccountSteps.openPage();
        createNewAccountSteps.setFirsName(firsName);
        createNewAccountSteps.setMiddleName(middleName);
        createNewAccountSteps.setLastName(lastName);
        createNewAccountSteps.setEmail(email);
        createNewAccountSteps.setPass(passTooShort);
        createNewAccountSteps.setPassConf(passConfTooShort);
        createNewAccountSteps.clickcheckBox();
        createNewAccountSteps.submitregisterButton();
    }

    @Test
    public void registerWithNotMathchingPassAndConfpass() {
        createNewAccountSteps.openPage();
        createNewAccountSteps.setFirsName(firsName);
        createNewAccountSteps.setMiddleName(middleName);
        createNewAccountSteps.setLastName(lastName);
        createNewAccountSteps.setEmail(email);
        createNewAccountSteps.setPass(pass);
        createNewAccountSteps.setPassConf(passConfNotMatching);
        createNewAccountSteps.clickcheckBox();
        createNewAccountSteps.submitregisterButton();
    }

}
