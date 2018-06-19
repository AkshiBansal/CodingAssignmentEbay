package com.coding.assignment.ebay.screen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

/*
 * First screen of ebay app. 
 */

@Component
public class HomeScreenEbay extends AbstractScreen {

	@AndroidFindBy(id="com.ebay.mobile:id/search_box")
	RemoteWebElement searchBox;

	@AndroidFindBy(id="com.ebay.mobile:id/home")
	WebElement mainNavigationButton;
	
	@AndroidFindBy(id="com.ebay.mobile:id/logo")
	WebElement signIn;
	
	@Autowired
	public HomeScreenEbay(AppiumDriver driver) {
		super(driver);
	}

	public void searchText(){
		searchBox.click();
	}

	public void clickNavigationButton(){
		mainNavigationButton.click();
	}

}
