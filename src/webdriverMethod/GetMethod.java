package webdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//get-to enter url in browser or to open an application
		
		driver.get("https://youtube.com/");
		Thread.sleep(1000);
		//close-to close the current tab of the browser opened by selenium tool
		driver.close();
		
		//quit-to close the all the tabs present in browser opened by selenium tool
		driver.quit();
		
		//maximize browser
		
		driver.manage().window().maximize();
		
		//minimize browser
		
		driver.manage().window().minimize();
		
		
		
		
		
		
		

	}

}
