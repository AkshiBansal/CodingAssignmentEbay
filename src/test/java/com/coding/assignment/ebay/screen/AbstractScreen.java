package com.coding.assignment.ebay.screen;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

@Component
public abstract class AbstractScreen {

        protected AppiumDriver appiumDriver;

        @Autowired
        public AbstractScreen (AppiumDriver appiumDriver) {
            this.appiumDriver = appiumDriver;
            PageFactory.initElements(new AppiumFieldDecorator(appiumDriver,60, TimeUnit.SECONDS),this);
        }
        
        public AppiumDriver getDriver(){
        	return appiumDriver;
        }
        
        public void scrollDown() {
            final int screenHeight = appiumDriver.manage().window().getSize().getHeight();
            appiumDriver.swipe(0,screenHeight*4/5, 0, screenHeight*6/10, 200);
        }
        public void scrollUp() {
            final int screenHeight = appiumDriver.manage().window().getSize().getHeight();
            appiumDriver.swipe(0,screenHeight*4/5, 0, screenHeight*6/10, 200);
        }
    }