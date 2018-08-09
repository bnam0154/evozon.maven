package com.evozonintern.tests;

import com.evozonintern.steps.serenity.LoginUserSteps;
import com.evozonintern.steps.serenity.SearchSteps;
import com.evozonintern.utils.BaseTest;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.evozonintern.utils.Constants.CSV_FILE_PATH;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = CSV_FILE_PATH + "SearchTestDataFile.csv", separator = ',')
public class SearchTestUsingDDT extends BaseTest {

    String item;

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