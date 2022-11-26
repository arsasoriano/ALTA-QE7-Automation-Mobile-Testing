package com.example.app.pages;

import com.example.app.base.BasePageObject;
import com.example.app.drivers.AndroidDriverInit;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class LoginBasePage extends BasePageObject {
    By elementInputUsername = MobileBy.id("com.isl.simpleapp:id/username");
    By elementInputPassword = MobileBy.id("com.isl.simpleapp:id/password");
    By elementButtonLogin = MobileBy.id("com.isl.simpleapp:id/login");

    public LoginBasePage inputUsername(String userName){
        type(elementInputUsername,userName);
        return this;
    }

    public LoginBasePage inputPassword(String password){
        type(elementInputPassword,password);
        return this;
    }

    public void andClickLoginButton(){
        click(elementButtonLogin);
    }

    public boolean isButtonLoginDisplayed(){
       return find(elementButtonLogin).isDisplayed();
    }
}