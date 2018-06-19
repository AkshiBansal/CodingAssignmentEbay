package com.coding.assignment.ebay.steps;

import org.springframework.beans.factory.annotation.Autowired;

import com.coding.assignment.ebay.screen.HomeScreenEbay;
import com.coding.assignment.ebay.screen.SearchResultScreen;
import com.coding.assignment.ebay.screen.SearchScreen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/*
 * Step definitions for searching an item 
 */

public class EbaySearchItemSteps extends BaseSteps {
    private HomeScreenEbay homeScreen;
    private SearchScreen searchScreen;
    private SearchResultScreen searchResultScreen;
    private ScreenCaptureHook screenCaptureHook;

    @Autowired
    public EbaySearchItemSteps(HomeScreenEbay homeScreen, SearchScreen searchScreen, 
    		SearchResultScreen searchResultScreen, ScreenCaptureHook screenCaptureHook) {
        this.homeScreen = homeScreen;
        this.searchScreen = searchScreen;
        this.searchResultScreen= searchResultScreen;
        this.screenCaptureHook= screenCaptureHook;
    }
    
    @Given("user search for \"([^\"]*)\" on homepage")
    public void searchText(String searchText) {
    	homeScreen.searchText();
        searchScreen.searchText(searchText);
        
    }
    
    @When("^selected a random item from search result$")
    public void selectRandomItem() throws Throwable {
    	searchResultScreen.selectRandomItem();
    }
      

}
