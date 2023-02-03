package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EG3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
        
        //read total row from table
        
        //outer for loop--> 2-11(tr)--->
        
        for(int i=2;i<=11;i++)
        {
        	//inner for loop--->table data(td)-->
        	
        	for(int j=1;j<=3;j++)
        	{
        		String tableData = driver.findElement(By.xpath("//tbody//tr[\"+i+\"]/td[\"+j+\"]")).getText();
        		
        		System.out.print(tableData+"");
        	}
        	System.out.println();
        }
	}

}
