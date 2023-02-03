package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingView {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/India");
		Thread.sleep(1000);
		
		//decide where to scroll and store in ref  variable
		
		WebElement ancient_india = driver.findElement(By.id("Ancient_India"));
		
		//type cast driver object intro javaSciptExecutor
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//call method executscript
		Thread.sleep(1000);
		
		js.executeScript("arguments[0].scrollIntoView(true)",ancient_india);
		
		
	}

}
