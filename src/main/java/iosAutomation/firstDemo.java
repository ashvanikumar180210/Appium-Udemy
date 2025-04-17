package iosAutomation;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class firstDemo extends iosbaseTest{
	
	@Test
	public void firstDemoTest() throws InterruptedException
	{
		//Handling allow button when opening the Melp app
		try {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    if (wait.until(ExpectedConditions.alertIsPresent()) != null) {
		        driver.switchTo().alert().accept();
		        System.out.println("Alertaccepted.");
		    }
		} catch (Exception e) {
		    System.out.println("Noalert.");
		}
		// ExplicititlyWaiting for element visibility of SIGN UP
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeStaticText[@name='SIGN UP']")));
		Thread.sleep(10);
		//click signup button
	    driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='SIGN UP']")).click(); 
        //type of account 
	    driver.findElement(AppiumBy.accessibilityId("Individual")).click();
	    //click proceed button
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == 'PROCEED'`]")).click();
        //enter Full Name text field
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == 'Enter Full Name'`]")).sendKeys("ashwani Kumar");
        //enter Email Address text field
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == 'Enter Email Address'`]")).sendKeys("ashvanikumar0566@gmail.com");
        //enter Email Address field
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSecureTextField[`value == 'Create Password'`]")).sendKeys("16aaSS**");
        Thread.sleep(10);
      //Since nothing is opening so trying to longpress the Create_Account button
        WebElement ele = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == 'CREATE ACCOUNT'`]"));
    
    	Map <String,Object> params = new HashMap<>();
    	params.put("element",((RemoteWebElement)ele).getId());
    	params.put("duration", 10);
    	driver.executeScript("mobile:touchAndHold", params);
    	//Clicking on CREATE ACCOUNT button
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == 'CREATE ACCOUNT'`]")).click();
   
        Thread.sleep(10);
        tearsdown();
		
	}

}
