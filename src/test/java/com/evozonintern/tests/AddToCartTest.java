package com.evozonintern.tests;

import com.evozonintern.pages.ProductsListPage;
import com.evozonintern.steps.serenity.AddToCartSteps;
import com.evozonintern.utils.BaseTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class AddToCartTest extends BaseTest {

    @Steps
    AddToCartSteps addToCartSteps;

    @Test
    public void addToCartItems() throws InterruptedException {

        //am reusit un merge
        addToCartSteps.openCartPage();
        addToCartSteps.verifyCartIsEmpty();
        addToCartSteps.navigateStep("Accessories", "Jewelry");
        addToCartSteps.openProduct("Pearl Stud Earrings");
        addToCartSteps.clickAddButton();
        addToCartSteps.verifyAddToCartButton(); // < -- verify
        addToCartSteps.navigateStep("Men","Blazers");
        addToCartSteps.openProduct("Stretch Cotton Blazer");
        addToCartSteps.clickAddButton();
        //addToCartSteps.verifyAddToCartButton(); // < -- verify



    }

}
