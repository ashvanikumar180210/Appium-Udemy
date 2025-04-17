package Ecommerce;
import java.io.File;
import java.net.MalformedURLException;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseEcommerce {
	
	public AndroidDriver driver;
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

			
			UiAutomator2Options option=new UiAutomator2Options();
			option.setDeviceName("Pixel_3a");
			option.setUdid("emulator-5554");

			option.setApp("/Users/ashwaniyadav/eclipse-workspace/BankofAmerica/src/main/java/Resources/General-Store.apk");
			
		     driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), option);
			
	}
	
	public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("mobile:longClickGesture",ImmutableMap.of(
				"elementId",((RemoteWebElement)ele).getId(),
				"duration",2000));
	}
	
	public void scrollToEndAction() {
	boolean canScrollMore;
    do {
    
     canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                     "left", 100, "top", 100, "width", 200, "height", 200,
                     "direction", "down",
                     "percent", 1.0
                 ));
    }while(canScrollMore);
	}
    
	//swipping
	public void SwipeAction(WebElement ele,String value ) {
	
			((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				    "elementId",((RemoteWebElement)ele).getId(),
				    "direction", "value",
				    "percent", 0.75
				));
	}
	
	public void DragDrop(WebElement element)
	{
		
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "endX", 646,
			    "endY", 575
			));
	}
	
	@AfterClass
	public void tearsdown()
	{
		driver.quit();
		service.stop();
		//stop server
		
	}

}
