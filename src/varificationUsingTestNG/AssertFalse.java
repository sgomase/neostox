package varificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse {
  @Test
  public void f()
  {
	  boolean a=true;
	  
	  Assert.assertFalse(a, "a value is true,TC is failed");
  }
}
