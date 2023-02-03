package practisExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMytrip {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.makemytrip.com/");
         driver.manage().window().maximize();
         Thread.sleep(1000);
         
          driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOu")).click();
	}

}
