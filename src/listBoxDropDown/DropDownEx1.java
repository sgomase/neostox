package listBoxDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx1 {

	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(1000);
		//we will nevigate to sign up page
		
		//handling date
		//   1. Identify list box to be handaled and store it in referance variable
		
		WebElement day = driver.findElement(By.id("day"));
				
		Thread.sleep(1000);
		
		//creat an object of select class which will accept WebElement as argument
		
		Select s=new Select(day);
		
		Thread.sleep(1000);
		
		//3. By using one of the select class method we can select value from list box like 
		//1. select ByVisible  Text:selectByVisibleText(String argO)
		//2. selectbyIndex:selectbyIndex(int argO)
		//3. selectByValue:selectByValue(String argO)
		
		s.selectByVisibleText("12");
		
		//handling month
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByIndex(5);
		
		Thread.sleep(1000);
		
		//handling year
		WebElement year = driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByValue("2008");
		
		System.out.println("year multiselection status is"+s2.isMultiple());
		
		
	}

}
