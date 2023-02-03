package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing {
  @Test
  public void TC1()
  {
	  Reporter.log("TC1 is running",true);
  }
  
  @BeforeMethod
  public void beforemethod()
  {
	  Reporter.log("BeforeMethod is running",true);
  }
  @AfterMethod
  public void AfterMethod()
  {
	  Reporter.log("AfterMethod is running",true);
  }
  @Test
  public void TC2()
  {
	  Reporter.log("TC2 is running",true);
  }
}
