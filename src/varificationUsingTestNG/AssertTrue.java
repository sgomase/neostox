package varificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
  @Test
  public void TrueCheck()
  {
	  boolean a=true;
	  
	  Assert.assertTrue(a, "a value is false,TC is failed");
  }
}
