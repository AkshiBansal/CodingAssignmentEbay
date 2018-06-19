package com.coding.assignment.ebay.appium;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
 * Reading property from application.properties
 */

@Component
@ConfigurationProperties(prefix = "app")
public class AppiumProperties {
    private String path;
    private String deviceName;
    private String packageName;
    private String activityName;
    private String platform;
    private String url;
    private String UDID;
    private String XCUITestName;
    private String bundleId;
    
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUDID() {
		return UDID;
	}
	public void setUDID(String uDID) {
		UDID = uDID;
	}
	public String getXCUITestName() {
		return XCUITestName;
	}
	public void setXCUITestName(String xCUITestName) {
		XCUITestName = xCUITestName;
	}
	public String getBundleId() {
		return bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

    
}
