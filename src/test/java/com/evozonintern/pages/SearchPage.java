package com.evozonintern.pages;

import com.evozonintern.utils.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    @FindBy(css = "#search")
    WebElementFacade element;

    public void navigateToSearch () {
        getDriver().findElement(By.cssSelector("#search")).click();
    }

    public void typeIntoSearchBar(String item) {
        typeInto(element,item);
        element.submit();
    }

}
