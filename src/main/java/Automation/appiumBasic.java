package Automation;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class appiumBasic extends baseTest{

	@Test
	public void wifiTest() throws MalformedURLException, URISyntaxException 
	
	{
		//configureAppium();
		//Xpath, accessibilityid, classname, androidUIAutomator
		//set wifi name
		
		//driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		
		//App_Package and App_Activity
		// Activity activity= new Activity("io.appium.android.apis","io.appium.android.apis.preference.PreferenceDependencies");
		//driver.startActivity(activity);
		
		//    adb shell dumpsys window | grep "mCurrentFocus"
		
		((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of(
			    "intent","io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies"));
		
		driver.findElement(By.id("android:id/checkbox")).click();
	
		// Landscape
		DeviceRotation Landscape = new DeviceRotation(0, 0, 90);
		driver.rotate(Landscape);

		
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String alertTitle=driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");
 
		
		// Copy to clipboard - paste it to clipboard
		driver.setClipboardText("AshvaniWifi");
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		
		
		driver.findElement(By.id("android:id/button1")).click();
		

		// Keyboard actions 
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
		tearsdown();
	
	}
}
