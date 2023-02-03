package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedIframe {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(1000);
		driver.switchTo().frame("frame1");
		driver.findElement(By.tagName("input")).sendKeys("Hello");
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
		Select s=new Select(animals);
		Thread.sleep(1000);
		s.selectByVisibleText("Big Baby Cat");
		Thread.sleep(1000);
         driver.switchTo().defaultContent();
         String Text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
         
         System.out.println("Text on main page is "+Text);
		
		

	}

}
