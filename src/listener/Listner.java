package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neoStoxBase.Base1;

public class Listner implements ITestListener
{
@Override
public void onTestFailure(ITestResult result)
{
  String tcName=result.getName();
  Reporter.log("TC"+tcName+" is failed,please try again",true);

	
}
@Override
	public void onTestSuccess(ITestResult result)
{
		Reporter.log("TC"+result.getName()+"is passed succesfully",true);
}
@Override
	public void onTestSkipped(ITestResult result) 
{
	Reporter.log("TC "+result.getName()+" is skipped,please have a look",true);	
}
}
