package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch url
		driver.get("https://vctcpune.com/selenium/practice.html");
		//sending keys in text field
		//we need to find the element
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hello");
		
		//clear the existing or previous text
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hii");
		
		//click(); Click method is use to click on button ,link also use to select radio buttons and checkboxes.
		
		
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	
		
		
		
		
		

	}

}
