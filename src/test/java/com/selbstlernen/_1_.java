package com.selbstlernen;

import io.appium.java_client.TouchAction;

public class _1_ {
    /* bir test acinca ilk kez, capabilities ayarlarini yazmak gerekir. sonra;
       1. Assert.assertTrue(driver.isAppInstalled(".........."));    uygulama yuklendi mi diye dogrulanir
       2. uygulama basarili sekilde acildigini o sayfada herhangi bir locateden dogrulanir. sonra isDisplayed yaparak dogrulariz
     */

    //  driver.activateApp("......");  // var olan uygulamayi acmak icin
    //  Assert.assertTrue(driver.isAppInstalled(".........."));    uygulama yuklendi mi diye kontrol etmek icin

    //   capabilities.setCapability(MobileCapabilityType.VERSION,"11.0"); bunun yerine PLATFORM_VERSIYON kullanmak daha guzeldir

    //  driver.findElementByAccessibilityId("8").click();  mesela 8'e bastim locate olarak id 'sinden aliyorum kolayca
    //  driver.findElementById("....").getText(); // id'Si uzerinden

    // location alma text ile basina @ koyulur mesela xpath olarak = //*[@text='BMW']

    /*KOORDINATLAR UZERINDEN BIR YERE TIKLAMA ICIN

    TouchAction touchAction = new TouchAction<>(driver);
    touchAction.press(PointOption.point(x,y1))-- bir yere tiklama. buldugumuz x,y koordinati
                    .release() --  ekrandan parmagi cekme,kaldirma islemi                    y1>y2
                    .perform() hepsinin calismasi icin gereken komut

     Eger problem bulursa da wait koyariz
     */

    /*
    driver.isKeyboardShown();   klavye gozukuyor mu
    driver.getKeyboard().pressKey("...") ---bir yere yazi göndermek icin
    driver.findElementById("...").sendKeys("....") --- id'Si su olana yazi gondermek

     */



   /* **** bir sayfada taa asagilardaki bir seye tiklayacak olmak(el harekti ile sayfanin asagisna gitmek)
    TouchAction touchAction = new TouchAction<>(driver);
    touchAction.press(PointOption.point(x,y1))-- bir yere tiklama. x,y koordinati
                .waitAction(WaitOptions(Duration.ofMillis(500));  -- asagidan yukariya kadarki gececk bekleme suresi
                .moveTo(PointOption.point(x,y2)) -- yukarinin x,y koordinatlari  (yukariya kaldirmis olduk)
                .release() --  ekrandan parmagi cekme,kaldirma islemi                    y1>y2
                .perform() hepsinin calismasi icin gereken komut (boylece ekran yukaridan asgiya kaydi)

    **** eger tam en yukari da getirmek istersek, koordinat degelerini degistirmek lazim
    touchAction.press(PointOption.point(x,y2))-- bir yere tiklama. x,y koordinati
                .waitAction(WaitOptions(Duration.ofMillis(500));  -- gececk bekleme suresi
                .moveTo(PointOption.point(x,y1)) -- asaginin x,y koordinatlari  (yukariya kaldirmis olduk)
                .release() --  ekrandan parmagi cekme,kaldirma islemi
                .perform() hepsinin calismasi icin gereken komut (boylece ekran asagiidan yukariya kaydi)
    */




    /* Bu kisim BEFORE TEST olarak koyulursa surekli yazmaya gerek kalmaz
     DesiredCapabilities capabilities  = new DesiredCapabilities();
        service = new AppiumServiceBuilder().withIPAddress("127.0.0.1")//.usingPort(4723)
                                            .usingAnyFreePort().build();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.VERSION,"11.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2");

        capabilities.setCapability("appPackage","com.google.android.calculator"); // hangi application uzerinde calismak istiyorsan onun kimligi
        capabilities.setCapability("appActivity","com.android.calculator2.Calculator"); // uygulamayi actiktan sonra hangi sayfadan baslayacagimizi görmek icin
        driver= new AppiumDriver<>(service.getUrl(),capabilities); // Verbindung mit der Server
     */




}
