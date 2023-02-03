package neoStoxPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxHomePage
{
  //1. Data member should be decleard lobally with access level private using @findBy Annotation
	
	@FindBy(xpath="(//a[text()='Sign In'])[1]")private WebElement signInbutton;
	
	//2. Intiallize within a constuctor with access level public using pagefactary
	
	public NeoStoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilize within a method with access level public
	
	public void clickOnSignInButton()
	{
		signInbutton.click();
		Reporter.log("Clicking on signIn button",true);
	}
}
