package com.coding.assignment.ebay.screen;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import io.appium.java_client.AppiumDriver;

/*
 * Screen where search results are displayed 
 */

@Component
public class SearchResultScreen extends AbstractScreen {

	public SearchResultScreen(AppiumDriver driver) {
		super(driver);
	}

	public void selectRandomItem(){
		List<WebElement> itemList = getDriver().findElements(By.id("com.ebay.mobile:id/cell_collection_item"));
		Random random = new Random();
		int optionIndex = 1 + random.nextInt(itemList.size() - 1);
		itemList.get(optionIndex).click();
	}

}
