package iosAutomation;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class iosbaseTest {
	
	public IOSDriver driver;
	public  AppiumDriverLocalService service;
	
	@BeforeClass
	public void configureAppium() throws MalformedURLException, URISyntaxException {
	
	
		     //Android Driver , IOS Driver
			//Appium client -->Appium Server --> Mobile
			//programmatically running server
			
			 service = new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
					 .withIPAddress("127.0.0.1")
					 .usingPort(4723).build();
			 service.start();

			XCUITestOptions options = new XCUITestOptions();
			options.setDeviceName("iPhone 16");
			options.setApp("/Users/ashwaniyadav/eclipse-workspace/BankofAmerica/src/main/java/Resources/Melp 2.app");
			options.setPlatformVersion("18.4");
			options.setUdid("013F2DF7-A868-4918-9662-D14EF8AE2DE9"); //iPhone 16
			//options.setUdid("58C8AF35-E103-4828-990A-54594BF51AC2"); //iPhone16 Pro
			//Appium -Webdriver Agent - IOS apps
			options.setWdaLaunchTimeout(Duration.ofSeconds(20));
			

			//DesiredCapabilities caps = new DesiredCapabilities();
			//caps.setCapability("platformName", "iOS");
			//caps.setCapability("platformVersion", "18.4"); 
			//caps.setCapability("deviceName", "iPhone 16"); 
			//caps.setCapability("automationName", "XCUITest");
			//caps.setCapability("xcodeSigningId", "iPhone Developer");
			//caps.setCapability("newCommandTimeout", 300);
			//caps.setCapability("app", "/Users/ashwaniyadav/eclipse-workspace/BankofAmerica/src/main/java/Resources/Melp 2.app\");"
			//WebDriver driver = new IOSDriver(new URI("http://127.0.0.1:4723").toURL(), caps);
			
			driver = new IOSDriver(new URI("http://127.0.0.1:4723").toURL(), options);
			
		   	    
	}
	@AfterClass
	public void tearsdown()
	{
		driver.quit();
		service.stop();
		//stop server
		
	}
}
