package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClassUse {
  @Test
  public void TC1()
  {
	 Reporter.log("TC1 is running",true); 
  }
  @BeforeMethod
  public void beforMethod ()
  {
	 Reporter.log("BeforeMethod is running",true); 
  }
  @Test
  public void Aftermethod()
  {
	 Reporter.log("AfterMethod is running",true); 
  }
  @Test
  public void TC2()
  {
	 Reporter.log("TC2 is running",true); 
 
} @BeforeClass
  public void beforClass ()
  {
	 Reporter.log("BeforeClass is running",true); 
  }
  
 
}
