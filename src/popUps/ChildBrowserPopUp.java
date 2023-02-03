package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		  driver.get("https://skpatro.github.io/demo/links/");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.name("NewWindow")).click();
		  
           String MainPageID = driver.getWindowHandle();//will only return id of main page
           System.out.println("Main page id "+ MainPageID );
           
           //to get multiple (all pade ids use method get WindoHandles->will return multiple String
           
           Set<String> allpageids = driver.getWindowHandles();
           
           Iterator<String> it = allpageids.iterator();
           String MainpageIDnew = it.next();//ID of Main page
           System.out.println(MainpageIDnew);
           
           String childpageID = it.next();//id of child page 
           
           //need to switch selenium focus from main page top child page
           
           driver.switchTo().window(childpageID);//focus switched to child page
           
           driver.manage().window().maximize();
           Thread.sleep(1000);
 		  
           //writting text in child TextBox
           
           driver.findElement(By.id("the7-search")).sendKeys("Velocity");
           driver.close();
           //driver.quit();
           
           //to work back to main page->we need to swich se4lenium focus from child page to main page 
           
           driver.switchTo().window(MainpageIDnew);
           Thread.sleep(1000);
           
          String myText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
          System.out.println("my text is "+myText);
           
           
           
           
           
	}

}
