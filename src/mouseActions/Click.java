package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
       driver.get("https://www.facebook.com");
       
       Thread.sleep(1000);
       
       WebElement signinButton = driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));
       
      // signinButton.click();
       
       //using Action
       
       //1. create object of Action class method ^& pass webDriver object as argument
       
       Actions act=new Actions(driver);
       //2. using one of the action method take required Action
       
       //act.click(signinButton).perform();
       
       act.moveToElement(signinButton).click().build().perform();
       
	}

}
