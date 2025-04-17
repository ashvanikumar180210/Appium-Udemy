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

public class Excercise1 extends baseTest{

	@Test
	public void Excercise1a() throws MalformedURLException, URISyntaxException, InterruptedException 
	
	{ 
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
		//Assert.assertEquals(driver.findElement(By.id("android:id/button1")).getText(),"OK");
		driver.findElement(By.id("android:id/button1")).click();
	}
	
}
