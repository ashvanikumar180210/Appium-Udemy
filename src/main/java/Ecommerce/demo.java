package Ecommerce;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo extends BaseEcommerce {
	
	@Test
	
	public void check()
	{
		String name =(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title"))).getText();

		System.out.println(name);
	}
}
