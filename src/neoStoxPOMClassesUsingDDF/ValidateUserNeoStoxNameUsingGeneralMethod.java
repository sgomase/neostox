package neoStoxPOMClassesUsingDDF;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ValidateUserNeoStoxNameUsingGeneralMethod 
{
	WebDriver driver;
	NeoStoxHomePage home;
	NeoStoxSignInPage signIn;
	NeoStoxPasswordPage pass;
	NeoStoxDashBoardPage dash;
	 String s="TCID-1234";
 @BeforeClass
 public void launchBrowser() 
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		
		Reporter.log("Launching launchNeostoxApp",true);
		
		home=new NeoStoxHomePage(driver);
		signIn=new NeoStoxSignInPage(driver);
		pass=new  NeoStoxPasswordPage(driver);
		 dash=new NeoStoxDashBoardPage(driver);
		
 }

 @BeforeMethod
 public void loginNeoStoxApp() throws EncryptedDocumentException, InterruptedException, IOException 
 {
	home.clickOnSignInButton();
	GeneralMethod.implicitWait(1000, driver);
	
	signIn.enterMobileNumber(GeneralMethod.readDataFromExcel(0, 0));
	signIn.ClickOnSignInButton();
	
	GeneralMethod.implicitWait(1000, driver);
	
	pass.enterPassword(GeneralMethod.readDataFromExcel(0, 1));
	Thread.sleep(1000);
	pass.clickOnSubmitButton();
	
	GeneralMethod.implicitWait(5000, driver);
	dash.handlePopUp();
	GeneralMethod.implicitWait(1000, driver);
 }
  @Test
  public void validateUserName() throws EncryptedDocumentException, IOException 
  {
	  Assert.assertEquals(dash.getActualUserName(),GeneralMethod.readDataFromExcel(0, 2),"Actual and Expected UserName are not matching TC is failed");
	  
	  
	GeneralMethod.takeScreenshot(driver, s);
  }


  @AfterMethod
  public void logOutFromNeoStox() throws InterruptedException 
  {
	  GeneralMethod.implicitWait(1000, driver);
	  dash.logOutFromNeoStox();
  }

  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }

}
