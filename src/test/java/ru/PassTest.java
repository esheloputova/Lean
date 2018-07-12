package ru;

import configuration.ConfigProperties;
import io.qameta.allure.Step;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.All10;
import pages.Page;

public class PassTest {

    @BeforeMethod
    public void setUp() {
//        Page.getDriver();
        Page.getDriver().get(ConfigProperties.getTestProperty("urlall10"));

    }

    @Step("Pass test")
    @Test
    public void pastTest() {
        new All10().goTologin();

        new All10().goSertifications();


    }
}