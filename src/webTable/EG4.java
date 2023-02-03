package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EG4 {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
        
        //outer for loop-->row==>tr
        
        for(int i=1;i<=11;i++)
        {
        	//inner for loop-->column-->th/td
        	
        	for(int j=1;j<=3;j++)
        	{
        		if(i==1)
        		{
        		String headertext = driver.findElement(By.xpath("//tbody//tr["+i+"]/th["+j+"]")).getText();
        		
        		System.out.print(headertext+"");
        	}
        
        	else
        	{
        		String datatext = driver.findElement(By.xpath("//tbody//tr["+i+"]/td["+j+"]")).getText();
        		
        		System.out.print(datatext+"");
        	}
        	
        }
        	System.out.println();
        
	}
	}
}


