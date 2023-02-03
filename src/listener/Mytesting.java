package listener;

import org.testng.Assert;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testNGKeyWords.DependsOnMethods;

public class Mytesting 
{
  @Test
  public void A()
  {
	  Reporter.log("TC A is running",true);
  }
  @Test
  public void B()
  {
	  Assert.fail();
	  Reporter.log("TC B is running",true);
  }
  @Test(dependsOnMethods="B")
  public void C()
  {
	  Reporter.log("TC C is running",true);
  }
}
