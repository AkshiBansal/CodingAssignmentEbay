package com.coding.assignment.ebay.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;

/*
 * For capturing screenshots if a scenario fails
 */

public class ScreenCaptureHook extends BaseSteps {

    private final AppiumDriver appiumDriver;

    @Autowired
    public ScreenCaptureHook(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    @Before
    public void beforeScenario() {
    }

    @After
    public void afterScenario(Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) appiumDriver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }

        appiumDriver.closeApp();
    }
}
