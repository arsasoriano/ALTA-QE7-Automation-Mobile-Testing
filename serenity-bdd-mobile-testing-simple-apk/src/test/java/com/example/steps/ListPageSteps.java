package com.example.steps;

import com.example.app.base.BasePageObject;
import com.example.app.pages.ListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ListPageSteps extends BasePageObject {

  ListPage listPage = new ListPage();
  @Given("user already login")
  public void userAlreadyOnListMenu(){
    Assert.assertTrue(listPage.isHamburgerButtonDisplayed());
  }

  @And("user do scroll")
  public void userDoScroll() {
    listPage.swipeList();
  }

  @When("user go to list page")
  public void userGoToListPage() {
    listPage.tapElementHamburgerButton()
            .tapElementMenuList();
  }

  @And("user doing swipe on list page")
  public void userDoingSwipeOnListPage() {
    listPage.swipeIntheElementList();
    
  }

  @Then("user successfully swipe the screen")
  public void userSuccessfullySwipeTheScreen() {
  }

  @Then("user doing long press in the list")
  public void userDoingLongPressInTheList() {
    listPage.longPressInTheList();
  }

  @Then("user doing multiple press in the list {int} times")
  public void userDoingMultiplePressInTheListTimes(int loop) {
    listPage.multiplePressInTheList(5);
  }
}
