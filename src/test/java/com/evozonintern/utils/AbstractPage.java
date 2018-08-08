package com.evozonintern.utils;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPage extends PageObject {




    public void setResolutionToW5120H2160() {
        getDriver().manage().window().setSize(new Dimension(5120, 2160));
    }

    public void setResolutionToW2048H1280() {
        getDriver().manage().window().setSize(new Dimension(2048, 1280));
    }

    public void setResolutionToW1024H768() {
        getDriver().manage().window().setSize(new Dimension(1024, 768));
    }

    public void setResolutionToW800H600() {
        getDriver().manage().window().setSize(new Dimension(800, 600));
    }

    public void refreshPage() {
        getDriver().navigate().refresh();
    }

    public void navigateBack() {
        getDriver().navigate().back();
    }

    public void navigateForward() {
        getDriver().navigate().forward();
    }





}
