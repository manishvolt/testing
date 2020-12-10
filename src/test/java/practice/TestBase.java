package practice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class TestBase {
    
	protected WebDriver driver;
	protected static String url = "https://www.amazon.in";
	
	@Before
	public void setup() {
	   
		try {
		driver= WebDriverFactory.GetBrowserDriver("firefox");
		}
		
		catch(Exception e) {
        e.printStackTrace();
		Assert.fail("incorrect browser sent");
		}
	
	}

	@After
    public void CleanUp() {
		
		driver.quit();
		
	}
	
	
}
