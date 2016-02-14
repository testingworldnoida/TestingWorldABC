package testing;
import com.thoughtworks.selenium.*;

import java.util.regex.Pattern;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_003 {
	private Selenium selenium;

	@BeforeMethod
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.thetestingworld.com/");
		selenium.start();
	}

	@Test
	public void testUntitled() throws Exception {
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
