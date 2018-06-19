package com.coding.assignment.ebay.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

/*
 * configuration class - intialising required driver
 */

@Configuration
public class AppiumConfiguration {

	@Autowired
	private AppiumProperties appiumProperties;

	@Bean(destroyMethod = "quit")
	public AppiumDriver appiumDriver() throws MalformedURLException {
		AppiumDriver driver = null;
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", appiumProperties.getPlatform());
		desiredCapabilities.setCapability("deviceName", appiumProperties.getDeviceName());
		desiredCapabilities.setCapability("appPackage", appiumProperties.getPackageName());
		desiredCapabilities.setCapability("appActivity", appiumProperties.getActivityName());

		switch (appiumProperties.getPlatform().toUpperCase()) {
		case "ANDROID":

			driver = new AndroidDriver(new URL(appiumProperties.getUrl()), desiredCapabilities);
			break;

		case "IOS":
			desiredCapabilities.setCapability("udid", appiumProperties.getUDID());
			desiredCapabilities.setCapability("XCUITest", appiumProperties.getXCUITestName());
			desiredCapabilities.setCapability("bundleId", appiumProperties.getBundleId());
			driver = new IOSDriver(new URL(appiumProperties.getUrl()), desiredCapabilities);
			break;

		default:
			System.out.println("No platforms found");
		}
		driver.manage().timeouts().implicitlyWait(2L, TimeUnit.MINUTES);
		return driver;
	}
}
