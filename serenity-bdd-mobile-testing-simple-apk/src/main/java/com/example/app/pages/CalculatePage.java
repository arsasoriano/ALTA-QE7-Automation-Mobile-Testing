package com.example.app.pages;

import com.example.app.base.BasePageObject;
import com.example.app.drivers.AndroidDriverInit;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class CalculatePage extends BasePageObject {
    By elementNumber1 = MobileBy.id("com.isl.simpleapp:id/et_1");
    By elementNumber2 = MobileBy.id("com.isl.simpleapp:id/et_2");
    By elementButtonCalculate = MobileBy.id("com.isl.simpleapp:id/acb_calculate");
    By elementButtonDropDown = MobileBy.id("com.isl.simpleapp:id/spinner_1");
    By elementButtonEquation = MobileBy.xpath("//android.widget.TextView[@resource-id='android:id/text1'][1]");
    By elementButtonEquationMinus = MobileBy.xpath("//android.widget.TextView[@resource-id='android:id/text1'][2]");
    By elementButtonEquationDivide = MobileBy.xpath("//android.widget.TextView[@resource-id='android:id/text1'][3]");
    By elementButtonEquationMultiple = MobileBy.xpath("//android.widget.TextView[@resource-id='android:id/text1'][4]");
    By elementResult = MobileBy.id("com.isl.simpleapp:id/tv_result");

    public CalculatePage inputNumber1 (){
        type(elementNumber1,"2");
        return this;
    }

    public CalculatePage inputNumber2 (){
        type(elementNumber2,"1");
        return this;
    }

    public void tapBtnDropDown(){
        click(elementButtonDropDown);
    }

    public void tapPlusEquation(){
        click(elementButtonEquation);
    }

    public void tapMinusEquation(){
        click(elementButtonEquationMinus);
    }

    public void tapDivideEquation(){
        click(elementButtonEquationDivide);
    }

    public void tapMultipleEquation(){
        click(elementButtonEquationMultiple);
    }

    public void tapBtnCalculate (){
        click(elementButtonCalculate);
    }

    public String getResult (){
        return getText(elementResult);
    }
}
