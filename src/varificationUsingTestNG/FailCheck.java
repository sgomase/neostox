package varificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailCheck {
  @Test
  public void Fail() 
  {
	  Assert.fail();
	  Reporter.log("Hi good night");
  }
}
