package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;

public class ListPage extends BasePageObject {
  // locator hamburgerButton xpath = //android.widget.ImageButton[@content-desc="Open navigation drawer"]
  By elementHamburgerBtn = MobileBy.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']");

  public ListPage tapElementHamburgerButton(){
    click(elementHamburgerBtn);
    return this;
  }

  // locator sideBarMenuList id = com.isl.simpleapp:id/nav_list
  By elementSideBarList = MobileBy.id("com.isl.simpleapp:id/nav_list");

  public void tapElementMenuList(){
    click(elementSideBarList);
  }

  // locator sideBarMenuCalculator id = com.isl.simpleapp:id/nav_calculator
  By elementSideBarCalculator = MobileBy.id("com.isl.simpleapp:id/nav_calculator");

  public boolean isHamburgerButtonDisplayed(){
    return find(elementHamburgerBtn).isDisplayed();
  }

  By elementList = MobileBy.id("com.isl.simpleapp:id/recycler_view");
  public void swipeIntheElementList(){
    swipeScreen(elementList);
  }

  By elementListOfText = MobileBy.id("com.isl.simpleapp:id/text_view");
  public void longPressInTheList(){
    longPress(findElements(elementListOfText).get(6));
  }

  public void multiplePressInTheList(int loop){
    for (int i = 0;i <= loop; i++){
      multiplePress(findElements(elementListOfText).get(i));
    }
  }


  public void swipeList() {
//    TouchAction action = new TouchAction(getDriver());
//    AndroidElement containerList = find(MobileBy.id("recycler_view"));
//    Point coordinate = containerList.getCenter();
//    PointOption start = PointOption.point(coordinate);
//    PointOption end = PointOption.point(coordinate.getX(), coordinate.getY() + -1000);
//    //builder
//    action
//        .press(start)
//        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//        .moveTo(end)
//        .release()
//        .perform();

    AndroidElement element = find(MobileBy.AndroidUIAutomator(
        "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"List ke-60\"))"));
  }

}
