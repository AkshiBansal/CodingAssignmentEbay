package com.coding.assignment.ebay.steps;

import org.springframework.beans.factory.annotation.Autowired;

import com.coding.assignment.ebay.screen.DeviceDetailScreen;

import cucumber.api.java.en.When;

/*
 * Step definitions for screen where device details are displayed
 */

public class DeviceDetailSteps extends BaseSteps {
    private DeviceDetailScreen deviceDetailScreen;

    @Autowired
    public DeviceDetailSteps(DeviceDetailScreen deviceDetailScreen) {
        this.deviceDetailScreen = deviceDetailScreen;
    }
    
    @When("^click on Buy It Now button$")
    public void clickBuyNow() throws Throwable {
        deviceDetailScreen.clickBuyNow();
    }

}
