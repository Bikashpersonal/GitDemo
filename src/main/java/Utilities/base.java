package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class base {

public WebDriver driver;
public Properties prop;
	public WebDriver initializedriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\bkuilly2\\Desktop\\Protractor Framework\\ClientPortal\\src\\main\\java\\Utilities\\data.properties");
		prop.load(fis);
		String browser_name=prop.getProperty("Browser");
		
		if(browser_name.equals("IE"))
		{
			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\bkuilly2\\Desktop\\Eclipse\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			//driver.get((prop.getProperty("URL")));
		    
			
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void getscreenshotpath(String testcasename,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destination_path=System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";
		FileUtils.copyFile(source, new File(destination_path));
		
	}
}
