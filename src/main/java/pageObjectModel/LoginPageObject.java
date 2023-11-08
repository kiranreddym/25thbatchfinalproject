package pageObjectModel;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;
	
	
	
	private By username=By.xpath("//input[@id='username']");
	
	private By password=By.xpath("//input[@id='password']");
	
	private By Login=By.xpath("//input[@id='Login']");
	
	
	//construcor is just like method name of that methods is same as classname
	public LoginPageObject(WebDriver driver2) {
		this.driver=driver2;  //it will connect to verifylogin page driver to this page driver
	}

public WebElement enterUsername()//other than [public void] we have o write return statement
	{
		return driver.findElement(username);
	}
	
	
	public WebElement enterpassword()
	{
		return driver.findElement(password);
		
	}
	
	
	public WebElement clicklogin()
	{
		return driver.findElement(Login);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
