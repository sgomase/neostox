package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {
  @Test
  public void testing() throws InterruptedException 
  {
	  Thread.sleep(100);
	  Reporter.log("TC testing is running",true);
  }
}
