package webElementMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedTest {

	public static void main(String[] args) throws InterruptedException {
		
      System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		 WebElement textBox = driver.findElement(By.name("show-hide"));
		 textBox.sendKeys("good morning");
		 
		 WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		 
		 hideButton.click();
		
		 if(textBox.isDisplayed())
		 {
			textBox.sendKeys("Hello"); 
		 }
		 else
		 {
			 driver.findElement(By.id("show-textbox")).click();
			 textBox.sendKeys("Bye");
		 }
		 
		
		
	}

}
