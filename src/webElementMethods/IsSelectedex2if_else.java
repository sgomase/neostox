package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedex2if_else {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
				checkbox1.click();
	
		if(checkbox1.isSelected())
		{
			System.out.println("Thank you checkbox is already selected");
			
		}
		else
		{
			System.out.println("Checking checkbox now");
			checkbox1.click();
			
			driver.findElement(By.name("checkboxOption1"));
			driver.findElement(By.partialLinkText("a page")).click();
			driver.findElement(By.className("input ui-autocomplete-input")).sendKeys("Hello");
		}
	}

}
