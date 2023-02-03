package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mytesting2
{
  @Test
  public void P()
  {
	  Reporter.log("TC p is running",true);
  }
  @Test
  public void Q()
  {
	  Assert.fail();
	  Reporter.log("TC Q is running",true);
  }
  @Test(dependsOnGroups = "Q")
  public void R()
  {
	  Reporter.log("TC R is running",true);
  }
}
