package com.tests.utilities;

public enum App {

    CALCULATOR(
            "com.google.android.calculator",
            "com.android.calculator2.Calculator"
    );

    public String appPackage;
    public String appActivity;

    App(String appPackage, String appActivity) {
        this.appPackage=appPackage;
        this.appActivity=appActivity;
    }


}
