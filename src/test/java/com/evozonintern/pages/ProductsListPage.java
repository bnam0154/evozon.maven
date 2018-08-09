package com.evozonintern.pages;

import com.evozonintern.utils.AbstractPage;
import com.evozonintern.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

//@DefaultUrl(BASE_URL + LOCAL_URL)
public class ProductsListPage extends BasePage {

    public WebElement getElement(String productName) {
        List<WebElement> productsList = getDriver().findElements(By.cssSelector(".item.last"));
        for (WebElement product : productsList) {
            if (product.findElement(By.cssSelector(".product-name a")).getText().toLowerCase().contains(productName.toLowerCase())) {
                return product;
            }
        }
        return null;
    }

    public void openPageProduct(String productName) {
        getElement(productName).findElement(By.cssSelector(".product-name a")).click();
    }
//

}
