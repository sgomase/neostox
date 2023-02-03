package varificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEqual {
  @Test
  public void notEqual() 
  {
	  String a="abc";
	  String b="abcd";
	  
	  Assert.assertNotEquals(a,b, "a and b are equals,TC is Failed");
  }
}
