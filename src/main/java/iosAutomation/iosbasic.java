package iosAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class iosbasic extends iosbaseTest {

	@Test
	public void iosBasicTest() throws InterruptedException
	{
		//Xpath, classname,id, accessibility id,IOS,iosClassChain,IOSPredicateString
		driver.findElement(AppiumBy.accessibilityId("Alert Views")).click();
		//driver.findElement(AppiumBy.accessibilityId("Text Entry")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == 'Text Entry'`]")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeCell")).sendKeys("hello world");
		driver.findElement(AppiumBy.accessibilityId("OK")).click();
		
		
		driver.findElement(AppiumBy.iOSNsPredicateString("name == 'Confirm / Cancel'")).click();
		//driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value == 'Confirm/Cancel'")).click();
		//driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value BEGINSWITH[c] 'Confirm'")).click();
		
		String  value = driver.findElement(AppiumBy.iOSNsPredicateString("name BEGINSWITH[c] 'A message'")).getText();
		Assert.assertEquals(value, "A message should be a short, complete sentence.");
		driver.findElement(AppiumBy.iOSNsPredicateString("name == 'Confirm'")).click();
		
	}	
	
}
