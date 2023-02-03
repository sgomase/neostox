package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test(priority=-4)
  public void b() 
  {
	  Reporter.log("TC b is running",true);
  }
  @Test
  public void a() 
  {
	  Reporter.log("TC a is running",true);
  }
  @Test(priority=-2)
  public void d() 
  {
	  Reporter.log("TC d is running",true);
  }
  @Test(priority=-3)
  public void c() 
  {
	  Reporter.log("TC c is running",true);
  }
}
