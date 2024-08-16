package com.tests.utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Utils {

    public static AppiumDriver<MobileElement> openApp(Device device,App app){
        Driver.runAppium();
        return Driver.getDriver(device,app);
    }


    public static MobileElement getDigit(int digit){
       return Driver.getDriver().findElement(MobileBy.AccessibilityId(String.valueOf(digit)));
    }


    public static MobileElement operator(String operator){
        return Driver.getDriver().findElement(MobileBy.AccessibilityId(operator));
    }






}
