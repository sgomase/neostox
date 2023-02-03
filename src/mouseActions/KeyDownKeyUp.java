package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownKeyUp {

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
	       WebElement firstname = driver.findElement(By.name("firstname"));
	       
	       //act.sendKeys(firstname, "Sarika").perform();
	       
	       act.keyDown(firstname, Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("arika").build().perform();
	       
	}

}
