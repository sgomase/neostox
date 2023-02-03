package dyanamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartReview {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(1000);
	  
	  //handle hidden div popup-->
	  //clicking close button of hidden div popup
	  
	  driver.findElement(By.xpath("(//button[@class='_2KpZ6l _2doB4z'])")).click();
	  Thread.sleep(1000);
	  //sending data in search bar
	  driver.findElement(By.name("q")).sendKeys("i phone 14");
	  
	  //clicking on search  button
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(2000);
	  
	  String reveiws = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]")).getText();
			  
			  System.out.println("Reviews are "+reveiws);
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
	}

}
