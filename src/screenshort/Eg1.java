package screenshort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Eg1 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
      System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
        Thread.sleep(1000);
        
        String random = RandomString.make(4);
        
         File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         
         System.out.println("Current location is "+source);
         
         File destinstion=new File("D:\\New folder\\Screenshotmethod"+random+".jpg");
         
         Thread.sleep(1000);
         FileHandler.copy(source, destinstion);
        
	}

}
