package neoStoxPOMClassesUsingDDF;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeoStoxTestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
       System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		
		//read data from exel
		
		File myfile=new File("C:\\selenium\\20_aug_eve.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet5");
		
		String mobNum=mySheet.getRow(0).getCell(0).getStringCellValue();
		String pass=mySheet.getRow(0).getCell(1).getStringCellValue();
		String expUsername=mySheet.getRow(0).getCell(2).getStringCellValue();
		//create an object of Home page
		
		NeoStoxHomePage home=new NeoStoxHomePage(driver);
		home.clickOnSignInButton();
		
		//signIn page
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		NeoStoxSignInPage signIn=new NeoStoxSignInPage(driver);
		signIn.enterMobileNumber(mobNum);
		signIn.ClickOnSignInButton();
		
		//password page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		NeoStoxPasswordPage password=new NeoStoxPasswordPage(driver);
		password.enterPassword(pass);
		password.clickOnSubmitButton();
		
		//dashboard page
		
		NeoStoxDashBoardPage dashBoard=new NeoStoxDashBoardPage(driver);
		
		dashBoard.handlePopUp();
		dashBoard.validateUserName(expUsername);
		dashBoard.logOutFromNeoStox();
		
		driver.close();

	}

}
