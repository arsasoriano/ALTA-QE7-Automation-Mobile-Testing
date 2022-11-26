package com.example.steps;

import com.example.app.pages.CalculatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalculateStepDefinitions {
    CalculatePage calculatePage = new CalculatePage();
    @Given("user input number1")
    public void userInputNumber1(){
        calculatePage.inputNumber1();
    }

    @And("user input number2")
    public void userInputNumber() {
        calculatePage.inputNumber2();
    }

    @When("user add number1 and number2")
    public void userAddNumberAndNumber() {
        calculatePage.tapBtnCalculate();
    }

    @Then("the result should be 3")
    public void theResultShouldBe() {
        String result = calculatePage.getResult();
        Assert.assertEquals("Hasil : 3",result);
    }

    @And("user choose minus equation")
    public void userChooseMinusEquation() {
        calculatePage.tapBtnDropDown();
        calculatePage.tapMinusEquation();
    }

    @When("user minus number1 and number2")
    public void userMinusNumberAndNumber() {
        calculatePage.tapBtnCalculate();
    }

    @Then("the result should be 1")
    public void theResultShould() {
        String result = calculatePage.getResult();
        Assert.assertEquals("Hasil : 1",result);
    }

    @And("user choose divide equation")
    public void userChooseDivideEquation() {
        calculatePage.tapBtnDropDown();
        calculatePage.tapDivideEquation();
    }

    @And("user choose multiple equation")
    public void userChooseMultipleEquation() {
        calculatePage.tapBtnDropDown();
        calculatePage.tapMultipleEquation();
    }

    @When("user divide number1 and number2")
    public void userDivideNumberAndNumber() {
        calculatePage.tapBtnCalculate();
    }

    @When("user multiple number1 and number2")
    public void userMultipleNumberAndNumber() {
        calculatePage.tapBtnCalculate();
    }

    @Then("the result should be 2")
    public void ResultShouldBe() {
        String result = calculatePage.getResult();
        Assert.assertEquals("Hasil : 2",result);
    }
}
