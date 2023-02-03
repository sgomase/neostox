package testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class NewNeoStoxUserIDValidation {
	
@BeforeClass
  public void launchApplication() 
  {
	  Reporter.log("Launching application",true);
  }
  @BeforeMethod
  public void loginToNeoStox() 
  {
	  Reporter.log("Login success",true);
  }
  @Test
  public void validateUserName() 
  {
	  Reporter.log("UserName validated",true);
  }

  @AfterMethod
  public void logOutFromNeoStox()
  {
	  Reporter.log("Logging out",true);
  }

  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Closed browser",true);
  }

}
