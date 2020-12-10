package practice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class TestBase {
    //aa
	protected WebDriver driver;
	protected String url = "https://www.amazon.in";
	
	private String BrowserName() {
		
		String DefaultBrowser="Edge";
		String CmdInputBrowser= System.getProperty("browser");
		if(CmdInputBrowser==null) {
		return DefaultBrowser;
		}
		else {
	    return CmdInputBrowser;	
	    }
		
	}
	
	@Before
	public void setup() {
	    
		String browser=BrowserName();
		try {
		driver= WebDriverFactory.GetBrowserDriver("browser");
		}
		
		catch(Exception e) {
        e.printStackTrace();
		Assert.fail("incorrect browser sent" + browser);
		}
	
	}

	@After
    public void CleanUp() {
		
		driver.quit();
		
	}
	
	
}
