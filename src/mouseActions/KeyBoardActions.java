package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException
	{
     System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
       driver.get("https://www.facebook.com/");
       
       Thread.sleep(1000);
       
       WebElement signInButton = driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]"));
       
       //using action class
       
       Actions act=new Actions(driver);
       
       act.click(signInButton).perform();
       Thread.sleep(1000);
       
       WebElement day = driver.findElement(By.id("day"));
       
       act.click(day).perform();
       
       //act.sendKeys(day, Keys.ENTER).perform();
       
       Thread.sleep(500);
//     act.sendKeys(Keys.ARROW_DOWN).perform();
//     Thread.sleep(500);
//     act.sendKeys(Keys.ARROW_DOWN).perform();
//     Thread.sleep(500);
//     act.sendKeys(Keys.ENTER).perform();
//     
     for(int i=1;i<=8;i++)
     {
    	 act.sendKeys(Keys.ARROW_DOWN).perform();
    	 Thread.sleep(1000);
     }
     
     act.sendKeys(Keys.ENTER).perform();
     

	}

}
