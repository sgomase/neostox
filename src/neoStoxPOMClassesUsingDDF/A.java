package neoStoxPOMClassesUsingDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://neostox.com/");
			
			
			NeoStoxHomePage home=new NeoStoxHomePage(driver);
			home.clickOnSignInButton();
			 Thread.sleep(2000);
           NeoStoxSignInPage signIn=new NeoStoxSignInPage(driver);
           signIn.enterMobileNumber("8329195905");
           signIn.ClickOnSignInButton();
           Thread.sleep(2000);
	}

}
