package varificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy2 {
	SoftAssert soft=new SoftAssert();
  @Test
  public void myTest1()
  {
	  String a="abc";
	  String b="abc";
	  
	  soft.assertNull(a,"a is not null,TC failed");
	  soft.assertNotEquals(a, b,"a & b are equals,TC failed");
	  soft.assertAll();
	  
  }
  @Test
  public void myTest2()
  {
	 boolean a=true;
	 boolean b=false;
	 
	 soft.assertTrue(b,"b is false,TC failed");
	 soft.assertFalse(a,"a is true,TC failed");
	 soft.assertAll();
  }
}
