package dyanamicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderdList {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
	       driver.get("https://www.google.co.in/");
	       
	       Thread.sleep(1000);
	       
	       driver.findElement(By.name("q")).sendKeys("honda");
	       Thread.sleep(1000);
	       
	     List<WebElement> searchResult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	     
	     System.out.println("No.of item in list are "+searchResult);
	     
	     for( WebElement s:searchResult)
	     {
	    	 System.out.println(s.getText());
	     }
	     for(WebElement result:searchResult)
	     {
	    	 String expected="honda activa";
	    	 
	    	 String actual=result.getText();
	    	 
	    	 if(expected.equals(actual))
	    	 {
	    		 System.out.println("Clicked on "+result.getText());
	    		 result.click();
	    		 break;
	    		 
	    	 }
	    	 
	    	 
	     }
	     
	     driver.findElement(By.linkText("Images")).click();

	}

}
