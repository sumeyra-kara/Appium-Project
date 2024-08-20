package com.tests.tag2;

import com.tests.utilities.App;
import com.tests.utilities.Device;
import com.tests.utilities.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals;

public class _2_DriverClass {
    AppiumDriver<MobileElement> driver;
    Device device = Device.PIXEL_2;
    App app = App.CALCULATOR;

    @Before
    public void setUp() {
        Driver.runAppium();
        driver = Driver.getDriver(device, app); // Driver.getDriver(Device.PIXEL_2,App.CALCULATOR);
    }

    @After
    public void tearDown(){
        driver.closeApp();
        Driver.stopAppium();
    }

    @Test
    public void test() {
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
    }
}
