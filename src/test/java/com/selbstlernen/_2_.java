package com.selbstlernen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class _2_ {
    AppiumDriver<MobileElement> driver;    // für sowohl ios als auch android

    @Test
    public void test() throws MalformedURLException {

        DesiredCapabilities capabilities  = new DesiredCapabilities();

        // Device capabilities
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.VERSION,"11.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2");

        // application capabilities
        capabilities.setCapability("appPackage","com.google.android.calculator");
        capabilities.setCapability("appActivity","com.android.calculator2.Calculator");

        AppiumDriver<WebElement> driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities); // Verbindung mit der Server

        WebElement acButon = driver.findElementByAccessibilityId("clear");
        Assert.assertTrue(acButon.isDisplayed()); // ac butonu gorunuyor mu diye

        driver.findElementByAccessibilityId("8").click(); // mesela 8'e basinca
        driver.findElementById("....").getText(); // id'Si uzerinden
    }
}
