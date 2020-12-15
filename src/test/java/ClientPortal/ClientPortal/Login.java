package ClientPortal.ClientPortal;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.base;
import pageobjects.Landingpage;

public class Login extends base{
	
	public WebDriver driver;
	@BeforeTest
	
	public void Open_browser() throws IOException
	{
		driver=initializedriver();
	    driver.get(prop.getProperty("URL"));
	}
	
	@Test
	public void basenavigationstep() throws IOException
	{
		
	    
	    Landingpage l=new Landingpage(driver);
	    l.claimnumber().sendKeys("123456");
	    
		
	
	}
	
	@AfterTest
	public void close_browser()
	{
		driver.close();
	}
}
