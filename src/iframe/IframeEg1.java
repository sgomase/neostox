package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
       System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html#contact");
		Thread.sleep(1000);
		driver.switchTo().frame("iframe-name");
		String IframeText = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class inquiry ')]")).getText();
		System.out.println("The iframe text is "+IframeText);
		driver.switchTo().defaultContent();
		String mainpageText = driver.findElement(By.xpath("//legend[text()='iFrame Example']")).getText();
		System.out.println("The main page text is "+mainpageText);
	}

}
