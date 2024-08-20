package com.tests.utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static AppiumDriver<MobileElement> driver;
    static AppiumDriverLocalService service;


    public static void runAppium(){  // für service
        service = new AppiumServiceBuilder().withIPAddress("127.0.0.1")//.usingPort(4723)
                .usingAnyFreePort().build();
        service.start();
    }

    public static void stopAppium(){
        service.stop();
    }

    public static AppiumDriver<MobileElement> getDriver(Device device,App app){
        driver= new AppiumDriver<>(service.getUrl(),setCaps(device,app));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public static AppiumDriver<MobileElement> getDriver(){
        return driver;
    }


    public static DesiredCapabilities setCaps (Device device,App app){
        DesiredCapabilities capabilities  = new DesiredCapabilities();

        // Device capabilities
        capabilities.setCapability(MobileCapabilityType.UDID,device.udid);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,device.deviceName);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, device.platform);
        capabilities.setCapability(MobileCapabilityType.VERSION,device.version);

        // application capabilities
        capabilities.setCapability("appPackage",app.appPackage); // hangi application uzerinde calismak istiyorsan onun kimligi
        capabilities.setCapability("appActivity",app.appActivity); // uygulamayi actiktan sonra hangi sayfadan baslayacagimizi görmek icin

        return capabilities;
    }












}
