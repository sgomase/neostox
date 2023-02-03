package setSizeAndSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeStudy {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		//how to set size?
		
		System.out.println(driver.manage().window().getSize());
		Dimension defaultsize = driver.manage().window().getSize();
		System.out.println("Default size is "+defaultsize);
		
		//how to set size
		
		//create object dimention class and pass value of width and height
		
		Dimension d=new Dimension(555,400);
		Thread.sleep(1000);
		//Use  setSizeMethod and pass Dimension class's object as a parameter
		
		driver.manage().window().setSize(d);
	       Dimension newSize = driver.manage().window().getSize();
	       System.out.println("newSize size is "+newSize);
		
	}

}
