package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCount {
  @Test(invocationCount=5)
  public void myTest()
  {
	 Reporter.log("MyTest is running",true); 
  }
  @BeforeMethod
  public void BeforeMethodt()
  {
	 Reporter.log("BeforeMethod is running",true); 
  }
  @AfterMethod
  public void AfterMethod()
  {
	 Reporter.log("AfterMethod is running",true); 
  }
}
