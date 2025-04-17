package Ecommerce;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Automation.baseTest;
import io.appium.java_client.AppiumBy;
import java.util.concurrent.TimeUnit;

public class eCommerce_tc_1 extends BaseEcommerce

{
	@Test
public void firstPage() throws MalformedURLException, URISyntaxException, InterruptedException 
	
	{ 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.androidsample.generalstore:id/nameField")));
		//loginBtn.click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ashvani");
		//driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.androidsample.generalstore:id/nameField']")).sendKeys("Ashvani");
		Thread.sleep(2000);
		//driver.hideKeyboard();
		
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Male']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		
		//new UiScrollable(new UiSelector()).scrollIntoView(text())
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		Thread.sleep(2000);
		tearsdown();
	}
}

