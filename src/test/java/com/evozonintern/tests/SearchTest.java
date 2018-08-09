package com.evozonintern.tests;

import com.evozonintern.steps.serenity.LoginUserSteps;
import com.evozonintern.steps.serenity.SearchSteps;
import com.evozonintern.utils.BaseTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class SearchTest extends BaseTest {

    String item = "SUEDE LOAFER, NAVY";

    @Steps
    LoginUserSteps loginUserSteps;

    @Steps
    SearchSteps searchSteps;

    @Test
    public void searchTest() {

        loginUserSteps.openPage();
        loginUserSteps.login("test@yahoo.com","parola11");
        loginUserSteps.validateSuccesfullLogin();
        searchSteps.searchForItem(item);
        searchSteps.veryfySearch(item);
    }

}
