package com.tests.tag3;

import com.tests.pages.BasePage;
import com.tests.utilities.App;
import com.tests.utilities.Device;
import com.tests.utilities.Driver;
import com.tests.utilities.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.tests.utilities.Utils.openApp;

public class _1_FloTest {

    AppiumDriver<MobileElement> driver;
    Device device = Device.PIXEL_2;
    App app = App.FLO;
    BasePage basePage;

    @Before
    public void setUp() {
        driver = openApp(device, app);
        basePage = new BasePage(driver);
    }

    @After
    public void tearDown()  {
        driver.closeApp();
        Driver.stopAppium();
    }


    @Test
    public void test() throws InterruptedException {
        Thread.sleep(3000);
        basePage.searchButton.click();
        basePage.searchInput.sendKeys("nike");
        basePage.showAllButton.click();
        basePage.shoe.click();
        Assert.assertTrue(basePage.shoe.isDisplayed());
    }
}
