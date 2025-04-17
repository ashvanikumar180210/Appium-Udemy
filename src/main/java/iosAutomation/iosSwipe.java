package iosAutomation;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class iosSwipe extends iosbaseTest {

	@Test
	public void iosSwipeTest() throws InterruptedException
	{
		//Xpath, classname,id, accessibility id,IOS,iosClassChain,IOSPredicateString
		
		
		Map<String,String> params = new HashMap<>();
		params.put("bundleId","com.apple.mobileslideshow");
		
		driver.executeScript("mobile:launchApp", params);
		
		driver.findElement(AppiumBy.iOSNsPredicateString("label == 'All Photos'")).click();
    
		
		
		
	}	
	
}
