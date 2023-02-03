package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp
{
	public static void main(String[] args) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
        Thread.sleep(1000);
        
        driver.findElement(By.name("submit")).click();
        //handle alert popup--->
        Alert alt = driver.switchTo().alert();
       // alt.accept();//clicking on ok buttun
       System.out.println( alt.getText());//getting Alert popup text
       alt.dismiss();//clicking on cancle buttun
       Thread.sleep(1000);
       String text = driver.findElement(By.xpath("//h2[text()='Guru99 Bank']")).getText();
       
       System.out.println("text is "+text);
       
	}

}

