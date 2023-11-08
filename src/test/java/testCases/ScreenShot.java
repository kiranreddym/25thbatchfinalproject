package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {
	
	@Test
	
	public void capturingScreenShot() throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.15.0");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		TakesScreenshot srcShot=(TakesScreenshot)driver;
		
		File src=srcShot.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\KIRAN\\OneDrive\\Desktop\\sreeenshot\\sc.png");
		
		FileUtils.copyFile(src, dest);
		
		System.out.println("done...screenshot");
		
		driver.close();
		
		
		
		
		
	}
	
	
	
	
	

}
