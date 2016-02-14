package testing;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import com.thoughtworks.selenium.*;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

import java.util.regex.Pattern;

public class TC_001 {
	private Selenium selenium;

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TestingWorld\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver f = new ChromeDriver();
		selenium = new WebDriverBackedSelenium(f, "http://www.thetestingworld.com/");
		
	}

	@Test
	public void testUntitled() throws Exception {
		selenium.open("/");
		selenium.click("link=Home");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Step By Step");
		selenium.waitForPageToLoad("30000");
	}

	@Test
	public void testUntitled1() throws Exception {
		selenium.open("/");
		selenium.click("link=Home");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Step By Step");
		selenium.waitForPageToLoad("30000");
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
