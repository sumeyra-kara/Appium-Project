package com.tests.tag1;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class _02_SetService {

    AppiumDriver<MobileElement> driver;    // für sowohl ios als auch android
    AppiumDriverLocalService service;

    @Test
    public void test() throws MalformedURLException {

        DesiredCapabilities capabilities  = new DesiredCapabilities();
        service = new AppiumServiceBuilder().withIPAddress("127.0.0.1")//.usingPort(4723)
                                            .usingAnyFreePort().build();

        // Device capabilities
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.VERSION,"11.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2");

        // application capabilities
        capabilities.setCapability("appPackage","com.google.android.calculator"); // hangi application uzerinde calismak istiyorsan onun kimligi
        capabilities.setCapability("appActivity","com.android.calculator2.Calculator"); // uygulamayi actiktan sonra hangi sayfadan baslayacagimizi görmek icin

        driver= new AppiumDriver<>(service.getUrl(),capabilities); // Verbindung mit der Server
        // http://127.0.0.1:4723/wd/hub     service.getUrl()

        MobileElement number4 = driver.findElement(By.id("com.google.android.calculator:id/digit_4"));
        MobileElement plus = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"plus\"]"));

        MobileElement number2 = driver.findElement(MobileBy.AccessibilityId("2"));

        MobileElement equals = driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.google.android.calculator:id/eq\")"));

        number4.click();
        plus.click();
        number2.click();
        equals.click();

        MobileElement number6 = driver.findElement(By.className("android.widget.TextView"));
        System.out.println("number6.getText() = " + number6.getText());
        assertEquals("6",number6.getText());

        driver.closeApp();




    }
}
