package neoStoxTestClasses;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neoStoxBase.Base1;
import neoStoxUtility.Utility;

public class Listener extends Base1 implements ITestListener
{
@Override
public void onTestFailure(ITestResult result)
{
	try 
	{
		Reporter.log("TC "+result.getName()+" failed",true);
		Utility.takeScreenshot(driver, result.getName());
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
		
}
	

@Override
	public void onTestSuccess(ITestResult result)
   {
		Reporter.log("TC "+result.getName()+" passed",true);
	}

}

