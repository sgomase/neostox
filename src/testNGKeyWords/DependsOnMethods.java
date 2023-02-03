package testNGKeyWords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
  @Test(enabled=false)
  public void b() 
  {
	 // Assert.fail();
	  Reporter.log("TC b is running ",true);
  }
  @Test(dependsOnMethods= {"b"})
  public void a() 
  {
	 
	  Reporter.log("TC a is running ",true);
  }
  @Test
  public void c() 
  {
	 
	  Reporter.log("TC c is running ",true);
  }
}
