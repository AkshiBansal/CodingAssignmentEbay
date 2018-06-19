package com.coding.assignment.ebay.screen;

import org.junit.Assert;
import org.springframework.stereotype.Component;

import io.appium.java_client.AppiumDriver;

/*
 * Sign In existing customer
 */

@Component
public class SignInScreen extends AbstractScreen {

	public SignInScreen(AppiumDriver driver) {
		super(driver);
	}

	public void signIn(){
		Assert.fail("Fail - couldn't capture screenshot to locate screen UI elements");
	}

}
