package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	
	//pom.xml we can create 10class
	//testng.xml can contain many class
	
	public static WebDriver driver; //driver declare globally
	
	
	private By FirstName=By.xpath("//input[@name='UserFirstName']");
	
	public SignUpPageObjects(WebDriver driver2) {
		
		this.driver=driver2;
	}
	
	public WebElement enterFirstName()
	{
		return driver.findElement(FirstName);
	}
	
	private By LastName=By.xpath("//input[@name='UserLastName']");
	public WebElement enterLastName()
	{
		return driver.findElement(LastName);
	}
	
	private By Email=By.xpath("//input[@name='UserEmail']");
	public WebElement enterEmail()
	{
		return driver.findElement(Email);
	}
	
	
	private By JobTitle=By.xpath("//select[@name='UserTitle']");
	public WebElement clickJobTitle()
	{
		return driver.findElement(JobTitle);
	}
	
	private By Company=By.xpath("//input[@name='CompanyName']");
	public WebElement enterCompany()
	{
		return driver.findElement(Company);
	}
	
	private By Employees=By.xpath("//select[@name='CompanyEmployees']");
	public WebElement enterEmployees()
	{
		return driver.findElement(Employees);
	}
	
	private By Phone=By.xpath("//input[@name='UserPhone']");
	public WebElement enterPhone()
	{
		return driver.findElement(Phone);
    }
	
	private By Country=By.xpath("//input[@name='CompanyName']");
	public WebElement enterCountry()
	{
		return driver.findElement(Country);
    }
	
	private By checkbox=By.xpath("(//div[@class='checkbox-ui'])[1]");
	public WebElement clickcheckBox()
	{
		return driver.findElement(checkbox);
		
	}
	

}
