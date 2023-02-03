package text_engin;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class NeoStoxSample2 {
  @Test
  public void NeoStoxLaunch() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		Thread.sleep(1000);
		
		System.out.println("Hi this is printing ststement");
		
		Reporter.log("Hi this is reporter");
		
		Reporter.log("Hi this is reporter--->console", true);
 

}
  @Test
  public void upstoxLaunch() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://login.upstox.com/");
			Thread.sleep(1000);
			
			System.out.println("Hi this is printing ststement");
			
			Reporter.log("Hi this is reporter");
			
			Reporter.log("Hi this is reporter--->console", true);
	 
  }
  
  
}
