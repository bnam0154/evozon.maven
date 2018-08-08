package com.evozonintern.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

import static com.evozonintern.utils.Constants.*;

@DefaultUrl(BASE_URL + "customer/account/login/")
public class LoginPage extends PageObject {

    @FindBy(css = "#email")
    WebElementFacade emailField;
    @FindBy(css = "#pass")
    WebElementFacade passwordField;
    @FindBy(css = "#send2")
    WebElementFacade loginButton;

    public void setEmailField(String email) {
        typeInto(emailField,email);
    }

    public void setPasswordField(String password) {
        typeInto(passwordField,password);
    }

    public void clickLogin() {
        loginButton.click();
    }

}
