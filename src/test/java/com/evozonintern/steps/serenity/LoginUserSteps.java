package com.evozonintern.steps.serenity;

import com.evozonintern.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class LoginUserSteps extends ScenarioSteps {



    private LoginPage loginPage;

    @Step
    public void openPage() {
        loginPage.open();
    }

    @Step //metoda generala
    public void login() {
        loginPage.setEmailField("test@yahoo.com");
        loginPage.setPasswordField("parola11");
        loginPage.clickLogin();
        
    }

    @Step //metoda granulata
    public void login(String email,String pass) {
        loginPage.setEmailField(email);
        loginPage.setPasswordField(pass);
        loginPage.clickLogin();
    }

    @Step
    public void validateSuccesfullLogin() {
        try {
            Assert.assertTrue(" !!! Failed to login !!! ", getDriver().findElement(By.cssSelector(".hello")).isDisplayed());
        } catch (NoSuchElementException e) {
            validateUnSuccesfullLogin();
        }
    }


    @Step
    public void validateUnSuccesfullLogin() {


        try {
            Assert.assertTrue("!!! FAIL: no email error messag !!!",getDriver().findElement(By.cssSelector("#advice-required-entry-email")).isDisplayed());
        } catch (NoSuchElementException em) {
           try {
               Assert.assertTrue("!!! FAIL: no password error messag !!!", getDriver().findElement(By.cssSelector("#advice-required-entry-pass")).isDisplayed());
           } catch (NoSuchElementException ep) {
               System.out.println("!!! FAIL ");
           }

        }

        try {
            Assert.assertTrue("!!! FAIL: no password error messag !!!", getDriver().findElement(By.cssSelector("#advice-required-entry-pass")).isDisplayed());
        } catch (NoSuchElementException em) {
            try {
                Assert.assertTrue("!!! FAIL: no email error messag !!!",getDriver().findElement(By.cssSelector("#advice-required-entry-email")).isDisplayed());
            } catch (NoSuchElementException ep) {
                System.out.println("!!! FAIL ");
            }

        }



    }

}
