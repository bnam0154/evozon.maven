package com.evozonintern.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;


import static com.evozonintern.utils.Constants.BASE_URL;

@DefaultUrl(BASE_URL + "customer/account/create/")
public class CreateNewAccountPage extends PageObject {

    @FindBy(css = "#firstname")
    WebElementFacade firstName;
    @FindBy(css = "#middlename")
    WebElementFacade middleName;
    @FindBy(css = "#lastname")
    WebElementFacade lastName;
    @FindBy(css = "#email_address")
    WebElementFacade emailField;
    @FindBy(css = "#password")
    WebElementFacade passField;
    @FindBy(css = "#confirmation")
    WebElementFacade passConField;
    @FindBy(css = ".checkbox")
    WebElementFacade chekcBox;
    @FindBy(css = ".buttons-set .button")
    WebElementFacade registerButton;
    @FindBy(css = ".page-title")
    WebElementFacade welcomeMessageParagraph;


    public void setFirstName(String name) {
        typeInto(firstName,name);
    }

    public void setLastName(String name) {
        typeInto(lastName,name);
    }

    public void setMiddleName(String name) {
        typeInto(middleName,name);
    }

    public void setPassField(String pass) {
        typeInto(passField,pass);
    }

    public void setEmailField(String email) {
        typeInto(emailField,email);
    }

    public void setPassConField(String passcon) {
        typeInto(passConField,passcon);
    }

    public void clickcheckBox() {
        chekcBox.click();
    }

    public void submitregisterButton() {
        registerButton.submit();
    }

    public boolean isLoggedIn(String message) {
        return welcomeMessageParagraph.getText().contains(message);
    }

//    public void refreshPage() {
//
//    } ???/

}
