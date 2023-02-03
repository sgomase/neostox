package varificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualStudy {
  @Test
  public void f()
  {
	  String a="abc";
	  String b="abc";
	  
	  Assert.assertEquals(a, b,"a and b are not matching TC failed");
  }
}
