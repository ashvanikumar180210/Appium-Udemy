package iosAutomation;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class firstDemo2 extends iosbaseTest{
	@Test
	public void firstDemo2Test() throws InterruptedException
	{
		//Handling allow button when opening the Melp app
		try {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    if (wait.until(ExpectedConditions.alertIsPresent()) != null)
		    {
		        driver.switchTo().alert().accept();
		       System.out.println("Alertaccepted.");
		    }
		} catch (Exception e) {
		    System.out.println("NoAlert.");
		}
		//initially throwing no such element exceptions So applied it here
		try {
		    WebElement el = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='SIGN IN']"));
		    el.click();
		} catch (NoSuchElementException e) {
		    System.out.println("Element not found.");
		}
		// ExplicititlyWaiting for element visibility of SIGN IN
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeStaticText[@name='SIGN IN']")));
		Thread.sleep(10);
		//clicking on it
	    driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='SIGN IN']")).click();
	    //Entering registered email id
	    driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == 'Enter your email address'`]")).sendKeys("ashvanikumar180210@gmail.com");
	   //Entering password within defined condition like lower,upper,numeric,specialcharacter
	   driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@value='Enter Password']")).sendKeys("15aaSS**");
	   String screen = driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@value='Enter Password']")).getText();
	   captureScreenshot(screen);
	   // Wait for any popup/overlay to disappear (max 10s)
       WebDriverWait popupWait = new WebDriverWait(driver, Duration.ofSeconds(10));
       popupWait.until(ExpectedConditions.invisibilityOfElementLocated(
           By.xpath("//XCUIElementTypeOther[contains(@name,'popup')]")));
	        
	   //checking the count of element present when pop up coming on enter password field
	   List<WebElement>popups=driver.findElements(By.xpath("//XCUIElementTypeSecureTextField"));
	   System.out.println(popups);
	   //tring to get the text of field sothat I can get the name of it
	   String value=driver.findElement(By.xpath("//XCUIElementTypeSecureTextField")).getText();
	   System.out.println(value);
	   //chekcking my enter password is enabled after covering it up by pop up
	   WebElement el = driver.findElement(By.xpath("//XCUIElementTypeSecureTextField"));
	   if (el.isEnabled()) {
	       el.click();
	   } else {
	       System.out.println("Element is disabled.");
	   }
	   
	   //scrolldown
	   //WebElement ele = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == 'SIGN IN'`]"));
	    // Map <String,Object> params = new HashMap<>();
		//params.put("element",((RemoteWebElement)ele).getId());
		//params.put("direction", "down");
		//driver.executeScript("mobile: scroll", params);
	    //ele.click();/*
	  // driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSecureTextField[`value == 'Enter your password'`]")).sendKeys("15aaSS**");WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	   
	   //dashboard open 
	 //Applying Fluentwait for holding element
	   FluentWait<IOSDriver> wait = new FluentWait<IOSDriver>(driver)
		        .withTimeout(Duration.ofSeconds(20))      
		        .pollingEvery(Duration.ofSeconds(2));
	   wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(AppiumBy.accessibilityId("melpApp_text"))));
       //verification of dashboard page
	   Assert.assertEquals(driver.findElement(AppiumBy.accessibilityId("melpApp_text")).getText(),"MelpApp");
       Assert.assertEquals(driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == 'RECENT'`]")).getText(),"RECENT");
        
	}
	public void captureScreenshot(String name) {
        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
        	FileUtils.copyFile(f, new File("/Users/ashwaniyadav/Documents"));
        }
        catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
    }
	
}
