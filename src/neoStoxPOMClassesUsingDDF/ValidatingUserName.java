package neoStoxPOMClassesUsingDDF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidatingUserName 
{
	WebDriver driver;
	NeoStoxHomePage home;
	 NeoStoxSignInPage  signIn;
	 NeoStoxPasswordPage pwd;
	@BeforeClass
	public void launchNeoStox()
	{
     System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		
		Reporter.log("Launching launchNeostoxApp",true);
		
		home=new NeoStoxHomePage(driver);
		signIn=new NeoStoxSignInPage(driver);
		pwd=new  NeoStoxPasswordPage(driver);
	}
	@BeforeMethod
	public void loginToNeoStox() throws InterruptedException
	{
		
	}
	
  @Test
  public void validateNeoStoxUserName() throws InterruptedException
  {
	  home.clickOnSignInButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Thread.sleep(2000);
		signIn.enterMobileNumber("8329195905"); 
  }
}
