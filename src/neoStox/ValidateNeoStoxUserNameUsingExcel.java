package neoStox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateNeoStoxUserNameUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			//reading data from exel sheet
			File myFile=new File("C:\\selenium\\20_aug_eve.xlsx");
			Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
			String userID = mySheet.getRow(0).getCell(0).getStringCellValue();
		    String password = mySheet.getRow(0).getCell(1).getStringCellValue();
		    String expUN = mySheet.getRow(0).getCell(2).getStringCellValue();
			driver.get("https://neostox.com/");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).click();
	        Thread.sleep(1000);
	        //working on sign in page
	        //1.sending Mobile no.
	        driver.findElement(By.className("form-control")).sendKeys(userID);
	        Thread.sleep(1000);
	        //2. clicking sign In Buttun
	        driver.findElement(By.id("lnk_signup1")).click();
	        Thread.sleep(1000);
	        //entering password
	        driver.findElement(By.className("form-control")).sendKeys(password);
	        Thread.sleep(1000);
	        //Clicking on submitt button
	        driver.findElement(By.xpath("//a[@id='lnk_submitaccesspin']")).click();
	        Thread.sleep(3000);
	        //working on home page
	       // driver.findElement(By.xpath("(//a[text()='OK'])[2]")).click();
	        //Thread.sleep(1000);
	        //driver.findElement(By.xpath("(//a[text()='Close'])[5]")).click();
	        driver.findElement(By.xpath("(//span[text()='×'])[19]")).click();
	        Thread.sleep(1000);
	        String actualusername = driver.findElement(By.xpath("//span[@id='lbl_username']")).getText();
	        
	        String expectedusername="Hi Sarika Gomase";
	        
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




