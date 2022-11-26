package com.example.steps;

import com.example.app.pages.LoginBasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginBaseStepDefinitions {

    LoginBasePage loginBasePage = new LoginBasePage();

    @Given("User is on login page")
    public void userIsOnLoginPage(){
        Assert.assertTrue(loginBasePage.isButtonLoginDisplayed());
    }

    @When("User input username {string}")
    public void userInputUsername(String userName) {
        loginBasePage.inputUsername(userName);
    }

    @And("User input password {string}")
    public void userInputPassword(String password) {
        loginBasePage.inputPassword(password);
    }

    @And("User click button sign in")
    public void userClickButtonSignIn() {
        loginBasePage.andClickLoginButton();
    }

    @Then("User successfully log in")
    public void userSuccessfullyLogIn() {
    }
}
