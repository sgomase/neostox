package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleKeywards {
  @Test
  public void a()
  {
	 Reporter.log("A is running ",true); 
	 
  }
  @Test(dependsOnMethods= {"c","a"})
  public void b()
  {
	 Reporter.log("B is running ",true); 
	 
  }
  @Test
  public void c()
  {
	 Reporter.log("c is running ",true); 
	 
  }
}
