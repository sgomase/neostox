package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EG1 {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
	        Thread.sleep(1000);
	        
	        List<WebElement> table = driver.findElements(By.xpath("//table[@id='product']//tr"));
	        
	        //how many rows there are in table
	        
	        System.out.println("Number of rows are "+table.size());
	        
	        for(WebElement t:table)
	        {
	        	System.out.println(t.getText());
	        }
	        //how many column/header are there
	        
	        List<WebElement> header = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
	        
	      System.out.println("Number of header are "+header.size());
	      
	      Iterator<WebElement> it = header.iterator();
	      while(it.hasNext())
	      {
	    	  System.out.println(it.next().getText());
	      }
	        
	        

	}

}
