package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysStudy {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.id("email")).sendKeys("124563");
	
	Thread.sleep(1000);
	driver.findElement(By.id("email")).clear();
	Thread.sleep(1000);
	
	driver.findElement(By.id("email")).sendKeys("000000");
	Thread.sleep(1000);
	   WebElement UN = driver.findElement(By.id("email"));
	
	UN.sendKeys("12345");
	Thread.sleep(1000);
	UN.clear();
	Thread.sleep(1000);
	UN.sendKeys("00000");
	Thread.sleep(1000);
	
	System.out.println(driver.findElement(By.xpath("//button[@type='submit']")).getText());
	
	String text = driver.findElement(By.xpath("//button[@type='submit']")).getText();
	
	System.out.println("Text is "+text);
	
	
	
	

	}

}
