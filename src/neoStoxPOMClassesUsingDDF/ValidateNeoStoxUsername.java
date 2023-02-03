package neoStoxPOMClassesUsingDDF;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateNeoStoxUsername 
{
	WebDriver driver;
	NeoStoxHomePage home;
	NeoStoxSignInPage signIn;
	NeoStoxPasswordPage pwd;
	NeoStoxDashBoardPage dash;
	 File myFile;
	 Sheet mySheet;
	 
	@BeforeClass
	public void launchNeoStoxAPP() throws EncryptedDocumentException, IOException
	{
     System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		
		Reporter.log("Launching launchNeostoxApp",true);
		
	 home = new NeoStoxHomePage(driver);
	 signIn=new NeoStoxSignInPage(driver);
	 pwd=new NeoStoxPasswordPage(driver);
	 dash=new NeoStoxDashBoardPage(driver);
	 
	myFile= new File("C:\\selenium\\20_aug_eve.xlsx");
	  mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
		
	}
	
	@BeforeMethod
	public void loginTONeoStox() throws InterruptedException
	{
		home.clickOnSignInButton();
		Reporter.log("Clicking on sign in Button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		signIn.enterMobileNumber(mySheet.getRow(0).getCell(0).getStringCellValue());
		
		Reporter.log("Entering mobile number",true);
		signIn.ClickOnSignInButton();
		Reporter.log("Clicking on sign in Button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Thread.sleep(4000);
		pwd.enterPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("Entering password",true);
		Thread.sleep(1000);
		pwd.clickOnSubmitButton();
		Reporter.log("Clicking on submit Button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		dash.handlePopUp();
		Reporter.log("Handlling popUp",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
  @Test
  public void validateUserName()
  {
	  String expectedUserName = mySheet.getRow(0).getCell(2).getStringCellValue();
	  
	  String actualUserName=dash.getActualUserName();
	  
	  Reporter.log("Validating UserName",true);
	  Assert.assertEquals(actualUserName,expectedUserName,"actual and expected UserName are not matching TC is failed");
  }
  
  @AfterMethod
  public void logOutFromNeoStox() throws InterruptedException
  {
	Thread.sleep(000);
	dash.logOutFromNeoStox();
	Reporter.log("Logging out from neoStox",true);
	Thread.sleep(1000);
	  
  }
  
 @AfterClass
  public void closeBrowser()
  {
	  driver.close();
	  Reporter.log("Clossing browser",true);
  }
}
