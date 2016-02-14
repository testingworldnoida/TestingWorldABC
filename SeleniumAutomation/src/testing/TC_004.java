package testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_004 {

	ChromeDriver driver;
	@BeforeMethod
	public void bmet()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TestingWorld\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@AfterMethod
	public void amet()
	{
		
		driver.quit();
	}
	
	@Test
	public void tcase4()
	{
		
		driver.findElementById("email").sendKeys("hello");
		driver.findElementById("pass").sendKeys("hello123");
		driver.findElementById("u_0_l").click();
		
	}
	
	
}
