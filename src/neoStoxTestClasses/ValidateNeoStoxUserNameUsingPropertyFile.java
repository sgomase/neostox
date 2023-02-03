package neoStoxTestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import neoStoxBase.Base1;
import neoStoxPOMClass.NeoStoxDashBoardPage;
import neoStoxPOMClass.NeoStoxHomePage;
import neoStoxPOMClass.NeoStoxPasswordPage;
import neoStoxPOMClass.NeoStoxSignInPage;
import neoStoxUtility.Utility;
@Listeners(neoStoxTestClasses.Listener.class)
public class  ValidateNeoStoxUserNameUsingPropertyFile extends Base1

{
	NeoStoxHomePage home;
	NeoStoxSignInPage signIn;
	NeoStoxPasswordPage pass;
	NeoStoxDashBoardPage dash;
	String s="TCID-7847";
	
	@BeforeClass
	public void launchNeoStoxBrowser() throws IOException
	{
		launchBrowser();
		home=new NeoStoxHomePage(driver);
		signIn=new NeoStoxSignInPage(driver);
		pass=new NeoStoxPasswordPage(driver);
		dash=new NeoStoxDashBoardPage(driver);
	}
	@BeforeMethod
	public void loginToNeoStox() throws EncryptedDocumentException, InterruptedException, IOException
	{
		home.clickOnSignInButton();
		Utility.implicitWait(1000, driver);
		
		//signIn.enterMobileNumber(Utility.readDataFromExcel(0, 0));
		signIn.enterMobileNumber(Utility.readDataFromPropertyFile("mob"));
		Thread.sleep(1000);
		signIn.ClickOnSignInButton();
		
		Utility.implicitWait(1000, driver);
		//pass.enterPassword(Utility.readDataFromExcel(0, 1));
		pass.enterPassword(Utility.readDataFromPropertyFile("password"));
		pass.clickOnSubmitButton();
		
		Utility.implicitWait(5000, driver);
		dash.handlePopUp(driver);
	}
  @Test
  public void validateUserName() throws EncryptedDocumentException, IOException
  {
	 // Assert.fail();
	//Assert.assertEquals(dash.getActualUserName(),Utility.readDataFromExcel(0, 2),"Actual and expected user name are not matching TC is failed" );
	Assert.assertEquals(dash.getActualUserName(),Utility.readDataFromPropertyFile("UserName"),"Actual and expected user name are not matching TC is failed");
	//Utility.takeScreenshot(driver, s);
	Utility.takeScreenshot(driver,Utility.readDataFromPropertyFile("TCID1"));
  }
  
  @Test
  public void validateACBalance() throws IOException
  {
	  Assert.assertNotNull(dash.getBalance(), "AC balance is null TC is failed");
	  Utility.takeScreenshot(driver,Utility.readDataFromPropertyFile("TCID2") );
  }
  
  @AfterMethod
  public void logOutFromNeoStox() throws InterruptedException
  {
	  dash.logOutFromNeoStox();
  }
  
  @AfterClass
  public void closeNeoStoxApp() throws InterruptedException
  {
	  driver.close();
	  Reporter.log("Closing application",true);
	  Thread.sleep(1000);
  }
}
