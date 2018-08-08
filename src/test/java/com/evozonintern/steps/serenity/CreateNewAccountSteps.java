package com.evozonintern.steps.serenity;

import com.evozonintern.Entitys.User;
import com.evozonintern.Factorys.UserFactory;
import com.evozonintern.pages.AccountPage;
import com.evozonintern.pages.CreateNewAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CreateNewAccountSteps extends ScenarioSteps {

    private CreateNewAccountPage createNewAccountPage;
    private AccountPage accountPage = new AccountPage();

    @Step
    public void openPage() {
        createNewAccountPage.open();
        //Assert.assertTrue("A crapat din cauza asta",conditia)
    }

    @Step
    public void setFirsName(String name) {
        createNewAccountPage.setFirstName(name);
    }

    @Step
    public void setMiddleName(String name) {
        createNewAccountPage.setMiddleName(name);
    }

    @Step
    public void setLastName(String name) {
        createNewAccountPage.setLastName(name);
    }

    @Step
    public void setEmail(String email) {
        createNewAccountPage.setEmailField(email);
    }

    @Step
    public void setPass(String pass) {
        createNewAccountPage.setPassField(pass);
    }

    @Step
    public void setPassConf(String passConf) {
        createNewAccountPage.setPassConField(passConf);
    }

    @Step
    public void clickcheckBox() {
        createNewAccountPage.clickcheckBox();
    }

    @Step
    public void submitregisterButton() {
        createNewAccountPage.submitregisterButton();
    }

    @Step //general
    public void createNewAccount() {

        User user = UserFactory.generateUser();

        createNewAccountPage.setFirstName(user.getFirstname());
        createNewAccountPage.setMiddleName(user.getMiddlename());
        createNewAccountPage.setLastName(user.getLastname());
        createNewAccountPage.setEmailField(user.getEmail());
        createNewAccountPage.setPassField(user.getPassword());
        createNewAccountPage.setPassConField(user.getPassword());
        createNewAccountPage.clickcheckBox();
        createNewAccountPage.submitregisterButton();
    }


    @Step //general
    public void createNewAccount(User user) {

        createNewAccountPage.setFirstName(user.getFirstname());
        createNewAccountPage.setMiddleName(user.getMiddlename());
        createNewAccountPage.setLastName(user.getLastname());
        createNewAccountPage.setEmailField(user.getEmail());
        createNewAccountPage.setPassField(user.getPassword());
        createNewAccountPage.setPassConField(user.getPassword());
        createNewAccountPage.clickcheckBox();
        createNewAccountPage.submitregisterButton();

    }

    @Step
    public void verifyIsCreated(User user) {
        Assert.assertTrue(accountPage.isLoggedIn(user.getFirstname()));
    }

    @Step
    public void verifyIsCreated(String name) {
        Assert.assertTrue(accountPage.isLoggedIn(name));
    }

    @Step
    public void verifyIsNotCreated(String title) {
        Assert.assertTrue(accountPage.isNotLoggedIn(title));
    }

}
