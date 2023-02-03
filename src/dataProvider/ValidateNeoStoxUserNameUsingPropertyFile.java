package dataProvider;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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
	
	
	@BeforeMethod
	public void launchNeoStoxApp() throws IOException
	{
		launchBrowser();
		home=new NeoStoxHomePage(driver);
		signIn=new NeoStoxSignInPage(driver);
		pass=new NeoStoxPasswordPage(driver);
		dash=new NeoStoxDashBoardPage(driver);
	}
	
    @Test(dataProvider="loginDetailsforValidateUserName")
	
	public void validateUserName(String mobNum,String password,String userName) throws EncryptedDocumentException, InterruptedException, IOException
	{
		home.clickOnSignInButton();
		Utility.implicitWait(1000, driver);
		signIn.enterMobileNumber(mobNum);
		Thread.sleep(1000);
		signIn.ClickOnSignInButton();
		
		Utility.implicitWait(1000, driver);
	   pass.enterPassword(password);
		pass.clickOnSubmitButton();
		
		Utility.implicitWait(3000, driver);
		dash.handlePopUp(driver);
		
		Assert.assertEquals(dash.getActualUserName(),userName,"Actual & Expected user name are not matching TC is failed");
		dash.logOutFromNeoStox();
	}
	@Test(dataProvider="loginDetailsForValidateAccountBalance")
	
	public void validateACBalance(String mobNum,String password) throws InterruptedException
	{
		home.clickOnSignInButton();
		Utility.implicitWait(1000, driver);
		signIn.enterMobileNumber(mobNum);
		Thread.sleep(1000);
		signIn.ClickOnSignInButton();
		
		Utility.implicitWait(1000, driver);
	   pass.enterPassword(password);
		pass.clickOnSubmitButton();
		
		Utility.implicitWait(3000, driver);
		dash.handlePopUp(driver);
		
		Assert.assertNotNull(dash.getBalance(),"AC balance is null TC is failed ");
		dash.logOutFromNeoStox();
	}

  
  @AfterMethod
  public void logOutFromNeoStox() throws InterruptedException
  {
	 driver.close();
	 Reporter.log("Closing application",true);
	 Thread.sleep(1000);
  }
  
  @DataProvider(name="loginDetailsforValidateUserName")
  public String[][]getLoginDetails1()
  {
	  String userData[][]= {{"8329195905","7847","Hi Sarika Gomase"},{"9421357890","9839","Hi Yogendra Joshi"},{"8805568380","2303","Hi Pooja Talekar"}};
	  
	return userData;
  }
	
	@DataProvider(name="loginDetailsForValidatAccountBalance")
	public String[][]getLoginDetails2()
	{
		String userData[][]= {{"8329195905","7847"},{"9421357890","9839"},{"9421357890","9839"},{"8805568380","2303"}};
		return userData;
	}
	  
  }
  
  
  
