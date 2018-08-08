package com.evozonintern.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

import static com.evozonintern.utils.Constants.*;

@DefaultUrl(BASE_URL + "customer/account/")
public class AccountPage extends PageObject {

    @FindBy(css = ".skip-link.skip-account .label")
    WebElementFacade myaccount;
    @FindBy(css = ".last [title=\"Log Out\"]")
    WebElementFacade logOutButton;
    @FindBy(css = ".hello strong")
    WebElementFacade welcomeMessageParagraph;

    public void logOut() {
        myaccount.click();
        logOutButton.click();
    }

    public boolean isLoggedIn(String username) {
        return welcomeMessageParagraph.getText().contains(username);
    }

}
