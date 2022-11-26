package com.example.app.base;

import com.example.app.drivers.AndroidDriverInit;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import java.time.Duration;
import java.util.List;

public class BasePageObject {

  TouchAction touchAction;
  public AndroidDriver<AndroidElement> getDriver(){
    return AndroidDriverInit.driver;
  }

  public AndroidElement find(By by){return getDriver().findElement(by);}

  public List<AndroidElement> findElements(By locatorName){return getDriver().findElements(locatorName);}

  public void type(By by, String text){
    AndroidElement element = find(by);
    element.clear();
    element.sendKeys(text);
  }

  public void click(By by){
    find(by).click();
  }

  public String getText(By by){
    return find(by).getText();
  }

  public boolean isDisplayed(By by){
    return find(by).isDisplayed();
  }

  public TouchAction getTouchAction(){
    touchAction = new TouchAction(getDriver());
    return touchAction;
  }

  public void swipeScreen(By elementToSwipe){
    Point coordinate = find(elementToSwipe).getCenter();
    getTouchAction().press(PointOption.point(coordinate)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                    .moveTo(PointOption.point(coordinate.getX(),coordinate.getY() +-500))
                    .release().perform();
  }

  public void longPress(By elementToLongPress){
    getTouchAction().longPress(PointOption.point(find(elementToLongPress).getCenter()))
            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(7)))
            .release().perform();
  }

  public void longPress(AndroidElement elementToLongPress){
    getTouchAction().longPress(PointOption.point(elementToLongPress.getCenter()))
            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(7)))
            .release().perform();
  }

  public void multiplePress(AndroidElement elementToPress){
    getTouchAction().press(PointOption.point(elementToPress.getCenter()))
            .release().perform();
  }

  public void stringToIntegerInput1(By by,int value1){
    value1 = Integer.parseInt(find(by).getText());
  }

  public void stringToInTegerInput2(By by,int value2){
    value2 = Integer.parseInt(find(by).getText());
  }
}