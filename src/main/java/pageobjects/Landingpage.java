package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	
	public WebDriver driver;
	
	public Landingpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By claimnumber=By.xpath("//*[@id='ctl00_ContentPlaceHolder1_tbxClaimNumber']");
	
	public WebElement  claimnumber()
	{
		return driver.findElement(claimnumber);
		
	}

	
	
	
	

}
