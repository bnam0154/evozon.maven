package com.evozonintern.utils;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest extends AbstractPage {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Before
    public void before() {
        driver.manage().window().maximize();
    }

    @After
    public void after() {

    }



}
//