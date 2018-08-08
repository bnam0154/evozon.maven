package com.evozonintern.steps.serenity;

import com.evozonintern.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class AddToCartSteps extends ScenarioSteps {

    private CartPage cartPage;



    private HeaderPage headerPage;
    private ProductsListPage productsListPage;
    private ProductDetailsPage productDetailsPage;

    @Step
    public void clickAddButton() {
        productDetailsPage.clickAddButton();
    }

    @Step
    public void openProduct(String prodName) {
        productsListPage.openPageProduct(prodName);
    }

    @Step
    public void openHomePage() {
        getDriver().get("http://qa3.dev.evozon.com/");
    }

    @Step
    public void navigateStep(String category, String subCategory) {
        headerPage.navigateToMenu(category,subCategory);
    }


    @Step
    public void openCartPage() {
        cartPage.open();
    }

    @Step
    public void verifyCartIsEmpty() {
        Assert.assertTrue("The cart is not empty !!!",cartPage.isEmpty());
    }

    @Step
    public void verifyAddToCartButton() {

        List<WebElement> messagelinks = getDriver().findElements(By.cssSelector(".success-msg"));
        Assert.assertFalse("!!! Failed at add to cart button click !!!",messagelinks.isEmpty());


    }


}


