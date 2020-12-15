package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Manual_referral_screen {
	
	public WebDriver driver;
	public Manual_referral_screen(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Manual_referral=By.xpath("//*[@id='menu3']");
	By Manual_referral_form_Level =By.xpath("//*[@style='text-align:left']/tbody/tr[1]/td/h1");
	
	public WebElement Manual_referral()
	{
		return driver.findElement(Manual_referral);
		
	}
	
	public WebElement Manual_referral_form_Level()
	{
		return driver.findElement(Manual_referral_form_Level);
		
	}
	
	

}
