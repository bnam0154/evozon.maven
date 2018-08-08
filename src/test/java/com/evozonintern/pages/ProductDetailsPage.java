package com.evozonintern.pages;

import com.evozonintern.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ProductDetailsPage extends BasePage {


    public void clickAddButton() {
        WebElement buttonAdd = getDriver().findElement(By.cssSelector(".add-to-cart-buttons .button"));
        buttonAdd.submit();
    }





}
