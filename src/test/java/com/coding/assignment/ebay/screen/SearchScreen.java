package com.coding.assignment.ebay.screen;

import org.openqa.selenium.remote.RemoteWebElement;
import org.springframework.stereotype.Component;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

/*
 * Search for an item
 */

@Component
public class SearchScreen extends AbstractScreen {

	public SearchScreen(AppiumDriver driver) {
		super(driver);
	}

	@AndroidFindBy(id="com.ebay.mobile:id/search_src_text")
	RemoteWebElement searchBox;

	public void searchText(String textToSearch){
		searchBox.sendKeys(textToSearch + "\n");
	}

}
