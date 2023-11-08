package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingExcelsheet {

	
	@Test
public void excelHandling() throws IOException, InterruptedException	
{	
FileInputStream fs=new FileInputStream("C:\\Users\\KIRAN\\OneDrive\\Desktop\\excelselenium.xlsx");
	//here we enter excel sheet path 

	XSSFWorkbook workbook=new XSSFWorkbook(fs);
	
	XSSFSheet sheet=workbook.getSheetAt(0);//here we enter sheet no.as index value
	
		XSSFRow row=sheet.getRow(0);//entering data from row via index value
		
		XSSFCell cell1=row.getCell(0);//entering data from coloum1 via index value
		
		XSSFCell cell2=row.getCell(1);//entering data from coloum2 via index value
		
		System.out.println(sheet.getRow(0).getCell(0));
	
	System.out.println(sheet.getRow(0).getCell(1));
	
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://login.salesforce.com/?locale=in");
	
	driver.manage().window().maximize();
	
	System.out.println(driver.getCurrentUrl());
	
	Thread.sleep(1000);
	
	WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
	username.click();
	Thread.sleep(1000);
    username.sendKeys(cell1.getStringCellValue());
	
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	password.click();
	password.sendKeys(cell2.getStringCellValue());
	//Thread.sleep(1000);
	
	
	WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
	login.click();
	Thread.sleep(1000);
	
	driver.close();
	
	
	
	
	
	
	
	
		
	}
	
	
	
	
	
	
	
	
}
