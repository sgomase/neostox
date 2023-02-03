package mouseActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{
		
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
       driver.get("http://www.uitestpractice.com/Students/Actions");
       
       Thread.sleep(1000);
       
       WebElement doubleclickbutton = driver.findElement(By.name("dblClick"));
       
       Actions act=new Actions(driver);
       
       //act.moveToElement(doubleclickbutton).doubleClick().build().perform();
       
       act.doubleClick(doubleclickbutton).perform();
       Thread.sleep(3000);
       
       //Handle Alert popup
       
      Alert alt = driver.switchTo().alert();
      
      alt.accept();
       
	}

}
