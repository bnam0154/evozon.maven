package com.evozonintern.pages;

import com.evozonintern.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HeaderPage extends BasePage {


    public void navigateToMenu(String nameCategory, String nameSubCategory) {

        WebElement category = getDriver().findElement(By.xpath("//li[contains(@class,\"level0\")]/a[text()=\""+nameCategory+"\"]"));
        Actions hover = new Actions(getDriver());
        hover.moveToElement(category).build().perform();
        WebElement subCategory = getDriver().findElement(By.xpath("//li[contains(@class,\"level1\")]/a[text()=\""+nameSubCategory+"\"]"));
        subCategory.click();

    }


}
