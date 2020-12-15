package ClientPortal.ClientPortal;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.base;
import pageobjects.Manual_referral_screen;

public class Validate_manual_referral_screen extends base{
	public WebDriver driver;
@BeforeTest
	
	public void Open_browser() throws IOException
	{
		driver=initializedriver();
	    driver.get(prop.getProperty("URL"));
	}
	@Test
	public void Validate_manual_referral_screen() throws IOException
	{
		
		Manual_referral_screen mr=new Manual_referral_screen(driver);
		mr.Manual_referral().click();
		Assert.assertFalse(mr.Manual_referral_form_Level().equals("Manual Referral Form"));
		
	}
	
	@AfterTest
	public void close_browser()
	{
		driver.close();
	}

}
