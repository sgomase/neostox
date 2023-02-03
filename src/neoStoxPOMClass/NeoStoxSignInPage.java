package neoStoxPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxSignInPage 
{
  @FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement mobileNumFeild;
  
  @FindBy(id="lnk_signup1")private WebElement signInButton;
  
  public NeoStoxSignInPage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  
  public void enterMobileNumber(String mobNum) throws InterruptedException
  {
	 
	  mobileNumFeild.sendKeys(mobNum);
	  
	  
  }
  
  public void ClickOnSignInButton() throws InterruptedException
  {
	
	  signInButton.click();
	  
	  Reporter.log("Clicking on signIn button",true);
	  
	  
	  
  }
  }

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  
  

