package assigment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX1 {

	public static void main(String[] args) throws InterruptedException
	{

            System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.get("https://neostox.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("form-control")).sendKeys("8329195905");
        Thread.sleep(1000);
        driver.findElement(By.id("lnk_signup1")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("form-control")).sendKeys("7847");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='lnk_submitaccesspin']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[text()='OK'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[text()='Close'])[5]")).click();
        Thread.sleep(1000);
        String actualusername = driver.findElement(By.xpath("//span[@id='lbl_username']")).getText();
        
        String expectedusername="Sarika Gomase";
        
        if(actualusername.equals(expectedusername))
        {
        	System.out.println("actual and expected user names are matching,TC is passed");
        	
        }
        else
        {
        	System.out.println("actual and expected user names are not matching,TC is Failed");
        }
        Thread.sleep(1000);
        driver.findElement(By.id("lbl_username")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Logout']")).click();
        Thread.sleep(1000);
        driver.close();
       
        
        
	}
}
