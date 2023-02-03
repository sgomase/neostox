package neoStoxPOMClassesUsingDDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxDashBoardPage 
{
 @FindBy(xpath="(//a[text()='OK'])[2]")private WebElement popUpOkButton;
  
  //@FindBy(xpath="(//a[text()='Close'])[5]")private WebElement popUpClickButton;
	//@FindBy(xpath="(//span[text()='x'])[19]")private WebElement cross;
  
  @FindBy(id="lbl_username")private WebElement userName;
  
  @FindBy(xpath="//span[text()='Logout']")private WebElement logOutButton;
  
  public  NeoStoxDashBoardPage(WebDriver driver)
  {
	 PageFactory.initElements(driver,this);
	  
 }
  
  public void handlePopUp() throws InterruptedException
  {
	  Thread.sleep(1000);
	  popUpOkButton.click();
	 // cross.click();
	 // Thread.sleep(1000);
	  //popUpClickButton.click();
  }
  
  public void validateUserName(String expectedUserName)
  {
	 
	 
	   String actualUserName=userName.getText();
	   
	   if(expectedUserName.equals(actualUserName))
	   {
		   System.out.println("TC is passed,actual & expected user names are matching");
	   }
	   else
	   {
		   System.out.println("TC is Failed,actual & expected user names are  notmatching");
	   }
  }
  
  public void logOutFromNeoStox() throws InterruptedException
  {
	  userName.click();
	  Thread.sleep(1000);
	  logOutButton.click();
	  
	   }
  public String getActualUserName()
  {
	  String actualUserName = userName.getText();
	  return actualUserName;
  }
  
}
