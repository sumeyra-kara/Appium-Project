package com.tests.tag2;

import com.tests.utilities.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.tests.utilities.Utils.getDigit;
import static com.tests.utilities.Utils.operator;

public class _3_OpenApp implements Locators {

    AppiumDriver<MobileElement> driver;

    @Before
    public void setUp() {
        driver = Utils.openApp(Device.PIXEL_2, App.CALCULATOR);
    }

    @After
    public void tearDown()  {
        driver.closeApp();
        Driver.stopAppium();
    }


    @Test
    public void test1() {
        getDigit(3).click();
        operator("plus").click();
        getDigit(2).click();
        operator("equals").click();
        String resultText = result.getText();
        assert resultText.equals("5"); // aus Java
       // Assert.assertEquals(resultText,"5");  -- aus testNg oder JUnit
    }
}
