package com.evozonintern.steps.serenity;

import com.evozonintern.pages.ProductsListPage;
import com.evozonintern.pages.SearchPage;
import com.evozonintern.tests.SearchTest;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class SearchSteps extends ScenarioSteps {

    SearchPage searchPage;
    ProductsListPage productsListPage;

    @Step
    public void searchForItem (String item) {
        searchPage.navigateToSearch();
        searchPage.typeIntoSearchBar(item);
    }

    @Step
    public void veryfySearch(String item) {
        Assert.assertTrue(productsListPage.getElement(item).getText().contains(item));
    }

}
