package Automation;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class scrollDemo extends baseTest{

	@Test
	public void ScrollDemoTest() throws MalformedURLException, URISyntaxException, InterruptedException 
	
	{ 
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
	   //driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\")));"));
		//where to scroll is known prior
		
		/*driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().text(\"WebView\"))")).click();
                */
		//No prior idea
		scrollToEndAction();
	}
}
