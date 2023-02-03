package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledExample {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(1000);
		WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
	     Object result = getOTPButton.isEnabled();
	     
	     System.out.println("Current status is "+result);
	     getOTPButton.click();
		
	}

}
