package com.tests.utilities;

import java.security.PublicKey;

public enum Device {
    PIXEL_2(
            "emulator-5554",
            "Pixel_2",
            "11.0",
            "Android"
    );

    public String udid;
    public String deviceName;
    public String version;
    public String platform;

    Device(String udid, String deviceName, String version, String platform) {
        this.udid=udid;
        this.deviceName=deviceName;
        this.version=version;
        this.platform=platform;
    }






}
