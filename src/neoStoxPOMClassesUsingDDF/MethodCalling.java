package neoStoxPOMClassesUsingDDF;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MethodCalling {
  @Test
  public void testing() throws EncryptedDocumentException, IOException
  {
	  WebDriver driver=null;
	  System.out.println(GeneralMethod.readDataFromExcel(0,0));
	  System.out.println(GeneralMethod.readDataFromExcel(0,1));
	  
	  GeneralMethod.implicitWait(100, driver);
	  GeneralMethod.implicitWait(5000, driver);
	  
	  GeneralMethod.takeScreenshot(driver,"MyScreenshot");
	  GeneralMethod.takeScreenshot(driver,"YourScreenshot");
	  
	  GeneralMethod.scrollIntoView(driver, null);
  }
}
