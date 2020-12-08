package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriverfactory {

	
	private static WebDriver driver=null;
	
	//this method would be called in the test base class, browser name is passed accordingly it will return the browser/object
	
	  public static WebDriver getdriver(String browser) throws Exception{    
		
		switch(browser.toLowerCase()) {
		
		case "chrome":
		
		driver = new ChromeDriver();
		
		break;
		
		case "firefox":
			
	    driver = new FirefoxDriver();
			
	    break;
		default: 
				
		throw new Exception ("browser not found " + browser);
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
				
		}
	}



