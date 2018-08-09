package com.evozonintern.pages;

import com.evozonintern.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {

    public void navigateToSearch () {
        getDriver().findElement(By.cssSelector(" #search")).click();
    }

}
