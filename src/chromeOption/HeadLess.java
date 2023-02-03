package chromeOption;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HeadLess {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");

    ChromeOptions opt=new ChromeOptions();
   //opt.addArguments("--headless");
   // opt.addArguments("--start-maximized");
	//opt.addArguments("--incognito");	
		WebDriver driver=new ChromeDriver(opt);
		//driver.manage().window().maximize();
       driver.get("https://demoqa.com/select-menu");
       
       Thread.sleep(1000);
       
      WebElement cars = driver.findElement(By.id("cars"));
      Select s=new Select(cars); 
      
      //comment
     System.out.println("MultiSelection Status is "+s.isMultiple());
     
     s.selectByVisibleText("Saab");
     
    Thread.sleep(1000);
     s.selectByValue("opel");
     Thread.sleep(1000);
     s.selectByIndex(1);
     
     //how to deselect -->only applicable for multiselectable dropdown
     
     Thread.sleep(1000);
    // s.deselectAll();
    
     List<WebElement> alloptions = s.getAllSelectedOptions();
     
     Iterator<WebElement> it=alloptions.iterator();
     
     while(it.hasNext())
     {
    	 System.out.println(it.next().getText());
    	
     }
     System.out.println("===============for each===========");
     
    for(WebElement a:alloptions)
    {
    	System.out.println(a.getText());
    }
    
    System.out.println("===============for loop===========");
    
    for(int i=0;i<=alloptions.size()-1;i++)
    {
    	System.out.println(alloptions.get(i).getText());
    }
    
       
       
	}

	


	}


