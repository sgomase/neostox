package neoStoxBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class Base1
{
	protected static WebDriver driver;
	public void launchBrowser() throws IOException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	 driver=new ChromeDriver();
	
	driver.get("https://neostox.com/");
	
	driver.manage().window().maximize(); 
	driver.get(Utility.readDataFromPropertyFile("url"));
	Utility.implicitWait(1000, driver);
   Reporter.log("launching Browser",true);
   

}
}


