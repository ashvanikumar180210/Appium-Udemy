package iosAutomation;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class iosScrollDown extends iosbaseTest {

	@Test
	public void iosScrollDownTest() throws InterruptedException
	{
		//Xpath, classname,id, accessibility id,IOS,iosClassChain,IOSPredicateString
		
    WebElement ele = driver.findElement(AppiumBy.accessibilityId("Web View"));
		
		Map <String,Object> params = new HashMap<>();
		params.put("element",((RemoteWebElement)ele).getId());
		params.put("direction", "down");
		
		driver.executeScript("mobile: scroll", params);
		driver.findElement(AppiumBy.accessibilityId("Web View")).click();
		driver.navigate().back();
		
		driver.findElement(AppiumBy.accessibilityId("Picker View")).click();
		driver.findElement(AppiumBy.accessibilityId("Red color component value")).sendKeys("80");
		driver.findElement(AppiumBy.accessibilityId("Green color component value")).sendKeys("220");
		driver.findElement(AppiumBy.accessibilityId("Blue color component value")).sendKeys("105");
		String value = driver.findElement(AppiumBy.accessibilityId("Blue color component value")).getText();
		Assert.assertEquals(value, "105");
		
		
		
	}	
	
}
