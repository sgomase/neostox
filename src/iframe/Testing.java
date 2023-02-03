package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(2000);
		
		//To handle iframe we need to switch selenium focus from main page to frame by
		//driver.switchTo().frame("String Nameor id")
          driver.switchTo().frame("iframeResult");//switching focus from mainpage to iframe
          
          driver.findElement(By.xpath("//button[@type='button']")).click();
          //switch focus from iframe to main frame
          driver.switchTo().defaultContent();
          //click on change theme
          
          driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
	}

}
