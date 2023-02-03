package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
       driver.get("https://demoqa.com/buttons");
       
       Thread.sleep(1000);
       
      WebElement rightclickbutton = driver.findElement(By.id("rightClickBtn"));
      
      Actions act=new Actions(driver);
      
      //act.moveToElement(rightclickbutton).contextClick().build().perform();
      
      act.contextClick(rightclickbutton).perform();
      
      
	}

}
