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

public class SwipeDemo extends baseTest{

	@Test
	public void SwipeDemoTest() throws MalformedURLException, URISyntaxException, InterruptedException 
	
	{ 
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		
		WebElement image1=driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getDomAttribute("focusable"), "true");
		
		SwipeAction(image1,"left");
		
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getDomAttribute("focusable"), "false");
	}
}
