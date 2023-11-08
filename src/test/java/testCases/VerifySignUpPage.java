package testCases;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pageObjectModel.SignUpPageObjects;
import resources.BaseClass;

public class VerifySignUpPage extends BaseClass {
	
	@Test
	public void VerifySignUp() throws IOException, InterruptedException
	{
		driverIntialize();
		
		Thread.sleep(1000);
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		Thread.sleep(1000);
		
		
		SignUpPageObjects spo=new SignUpPageObjects(driver);
		
		spo.enterFirstName().sendKeys("Vaibhav");
		//spo.enterFirstName().clear();
		Thread.sleep(1000);
		
		spo.enterLastName().sendKeys("Reddy");
		Thread.sleep(1000);
		
		spo.enterEmail().sendKeys("kirans.reddy1@gmail.com");
		Thread.sleep(1000);
		
		spo.clickJobTitle().sendKeys(Keys.ARROW_DOWN);
		spo.clickJobTitle().sendKeys(Keys.ARROW_DOWN);
		spo.clickJobTitle().sendKeys(Keys.ARROW_DOWN);
		
		spo.enterCompany().sendKeys("Infosy");
		Thread.sleep(1000);
		 
		spo.enterEmployees().sendKeys(Keys.ARROW_DOWN);
		spo.enterEmployees().sendKeys(Keys.ARROW_DOWN);
		spo.enterEmployees().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		
		spo.enterPhone().sendKeys("9118998898");
		Thread.sleep(1000);
		
		spo.enterCountry().sendKeys(Keys.ARROW_UP);
		Thread.sleep(1000);
		
		spo.clickcheckBox().click();
		Thread.sleep(1000);
		}
	}
