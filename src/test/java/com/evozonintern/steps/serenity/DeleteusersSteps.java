package com.evozonintern.steps.serenity;

import com.evozonintern.pages.AdminDeleteAllUsers;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DeleteusersSteps extends ScenarioSteps {

    private AdminDeleteAllUsers adminDeleteAllUsers;

    @Step
    public void openPage() {
        adminDeleteAllUsers.open();
    }



}
