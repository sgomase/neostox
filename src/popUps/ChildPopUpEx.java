package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUpEx {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	  driver.get("https://vctcpune.com/");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
	  
	  Set<String> allpage = driver.getWindowHandles();
	   Iterator<String> it = allpage.iterator();
	   
	  String mainpage = it.next();
	  String childpage = it.next();
	  
	  driver.switchTo().window(childpage);
	  driver.findElement(By.id("autocomplete")).sendKeys("Nagpur");
	  Thread.sleep(1000);
	  
	  driver.close();
	  
	  driver.switchTo().window(mainpage);
	  
	 String myText = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class inquiry ')]")).getText();
	  
	  System.out.println("my text is "+myText);
	}

}
