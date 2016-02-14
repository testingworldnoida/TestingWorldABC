package testing;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import com.thoughtworks.selenium.*;
import java.util.regex.Pattern;

public class TC_002 {
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
