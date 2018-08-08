package com.evozonintern.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

import static com.evozonintern.utils.Constants.BASE_URL;

@DefaultUrl(BASE_URL + "checkout/cart/")
public class CartPage extends PageObject {

    @FindBy(css = ".page-title")
    WebElementFacade cartIsEmptyText;

    public boolean isEmpty() {
        return cartIsEmptyText.getText().contains("CART IS EMPTY");
    }

}
