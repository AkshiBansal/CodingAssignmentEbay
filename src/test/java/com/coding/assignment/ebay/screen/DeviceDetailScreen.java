package com.coding.assignment.ebay.screen;

import org.openqa.selenium.remote.RemoteWebElement;
import org.springframework.stereotype.Component;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

/*
 * Selenium code for device detail screen
 */

@Component
public class DeviceDetailScreen extends AbstractScreen {

	public DeviceDetailScreen(AppiumDriver driver) {
		super(driver);
	}

	@AndroidFindBy(id="com.ebay.mobile:id/button_bin")
	RemoteWebElement buyNowButton;

	public void clickBuyNow(){
		buyNowButton.click();
	}

}
