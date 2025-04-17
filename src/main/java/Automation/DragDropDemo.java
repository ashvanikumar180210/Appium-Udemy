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

public class DragDropDemo extends baseTest{

	@Test
	public void DragDropDemoTest() throws MalformedURLException, URISyntaxException, InterruptedException 
	
	{ 
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		
		WebElement element =driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		
		//Drag & Drop
		DragDrop(element);
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText(),"Dropped!");
			
		
	}
}
