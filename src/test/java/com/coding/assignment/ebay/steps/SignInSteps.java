package com.coding.assignment.ebay.steps;

import org.springframework.beans.factory.annotation.Autowired;

import com.coding.assignment.ebay.screen.SignInScreen;

import cucumber.api.java.en.When;

/*
 * Step Definitions for signing in as existing customer
 */

public class SignInSteps extends BaseSteps {
    private SignInScreen signInScreen;

    @Autowired
    public SignInSteps(SignInScreen signInScreen) {
        this.signInScreen = signInScreen;
    }
    
    @When("^user sign in to the application$")
    public void signIn() throws Throwable {
    	signInScreen.signIn();
    }

}
