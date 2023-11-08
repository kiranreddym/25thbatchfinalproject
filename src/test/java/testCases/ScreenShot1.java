package testCases;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot1 {
	
	@Test

	public void capturingscreenshot() throws IOException, InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		/*
		//take full screenshot
		TakesScreenshot srcShot=(TakesScreenshot)driver;
		File src=srcShot.getScreenshotAs(OutputType.FILE);
		Thread.sleep(1000);
		File dest=new File("C:\\Users\\KIRAN\\OneDrive\\Desktop\\src shot2\\sf.png");
		FileUtils.copyFile(src, dest);
		
        System.out.println("done...screenshot");
		driver.close();
		*/
		
		
		//take only salesforce logo screenshot
		TakesScreenshot srcShot=(TakesScreenshot)driver;
		File src=driver.findElement(By.xpath("//img[@id='logo']")).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\KIRAN\\OneDrive\\Desktop\\src shot2\\sf.png");
		FileUtils.copyFile(src, dest);
		
        System.out.println("done...screenshot");
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
