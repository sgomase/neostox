package varificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RadioButtonValidation {
  @Test
  public void validateRadioButtonStatus() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
     driver.get("https://vctcpune.com/selenium/practice.html");
     
     Thread.sleep(1000);
     
     WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
     
//     if(radio1.isSelected())
//     {
//    	 Reporter.log("Radio 1 is selected TC is passed ",true);
//    	
//     }
//     else
//     {
//    	 Reporter.log("Radio 1 is  not selected TC is passed ",true);
//     }
     
     JavascriptExecutor js = (JavascriptExecutor)driver;
     js.executeScript("arguments[0].scrollIntoView(true)", radio1);
     
     //radio1.click();
     Thread.sleep(1000);
     //click using js
     js.executeScript("arguments[0].click();", radio1);
     Thread.sleep(1000);
     //sending key with the js
     
     js.executeScript("arguments[0].value='Hello'", driver.findElement(By.id("autocomplete")));
     
     Assert.assertTrue(radio1.isSelected(),"Radio1 is not selected TC is Failed");
     
  }
}
