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

public class eCommerce_tc_2 extends BaseEcommerce

{
	@Test
public void firstPage() throws MalformedURLException, URISyntaxException, InterruptedException 
	
	{ 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.androidsample.generalstore:id/nameField")));
		//loginBtn.click();
		
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		String toastmessage=driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getDomAttribute("name");
		
		Assert.assertEquals(toastmessage, "Please enter your name");
		Thread.sleep(2000);
		tearsdown();
	}
}

