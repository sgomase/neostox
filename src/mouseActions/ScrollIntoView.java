package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
       driver.get("https://vctcpune.com/");
       
       Thread.sleep(1000);
       
       Actions act=new Actions(driver);
       
       WebElement text = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
       
       act.scrollToElement(text).perform();
       
       

	}

}
