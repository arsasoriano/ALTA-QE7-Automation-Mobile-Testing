package com.example.app.drivers;

import com.example.app.properties.PropertiesData;
import com.example.app.properties.PropertiesReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidDriverInit {

  public static AndroidDriver<AndroidElement> driver;

  public static void initialize() {
    DesiredCapabilities caps = new DesiredCapabilities();
    PropertiesReader reader = new PropertiesReader();
    HashMap<String,String> data = reader.readProperties().getAppiumProperties();

    data.forEach((key,value) -> caps.setCapability(key,value));

    caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
    caps.setCapability(MobileCapabilityType.DEVICE_NAME, "device");
    caps.setCapability(MobileCapabilityType.UDID, "bfa9354f");
    caps.setCapability(MobileCapabilityType.APP, "E:/sampleapk/sample-apk.apk");
    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
    caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
    caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);

    String url = "http://localhost:4723/wd/hub";
    try {
      driver = new AndroidDriver<>(new URL(url), caps);

      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }

  public static void quit() {
    driver.quit();
  }

}
