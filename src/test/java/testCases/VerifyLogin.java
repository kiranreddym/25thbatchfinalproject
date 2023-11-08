package testCases;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObject;
import resources.BaseClass;

public class VerifyLogin extends BaseClass {
	
	
	@Test
	
	public void verifyLoginDemo() throws IOException, InterruptedException
	{
		driverIntialize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		Thread.sleep(2000);
		
		LoginPageObject obj=new LoginPageObject(driver);
		
		obj.enterUsername().sendKeys("vaibhavjjhhjhsha.com");
		
		Thread.sleep(2000);
		
		obj.enterpassword().sendKeys("vaibhu123");
		
		Thread.sleep(2000);
		
		obj.clicklogin().click();
		
		
		/*driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vaibhavsjsjsjs");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("vaiiiiii");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='Login']")).click();*/
				
	}
}
