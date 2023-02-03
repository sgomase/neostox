package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTesting {
  @Test
  public void ValidateUserID()
  {
	  Reporter.log("validateUserID is running",true);
  }
  @Test
  public void ValidateACBalance()
  {
	  Reporter.log("validateACBalance is running",true);
  }
  
  @BeforeMethod
  public void loginToNeostox()
  {
	  Reporter.log("logged in",true);
  }
}
