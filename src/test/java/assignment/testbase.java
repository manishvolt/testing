package assignment;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class testbase {


	protected WebDriver driver;
	protected final static String url = "https://www.amazon.in";
	protected final static int timeout = 20;

	
	
	
	
	private String browsername() {
		
		String defaultbrowser = "edge";   //this would be default browser
		String browsersentfromcmd = System.getProperty("browser");
		                                               //browser is variable. this will return browser sent from cmd
		  if (browsersentfromcmd==null){
	            return defaultbrowser;
	        }else{
	            return browsersentfromcmd;
	        }
	    }
	
	
	
	
	@Before
	public void setup(){
		
		/*System.setProperty("webdriver.chrome.driver", "D:\\Automation jars and softwares\\projects\\selenium\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\Automation jars and softwares\\projects\\selenium\\geckodriver.exe");
		
		driver = new ChromeDriver();*/
		
		
		
		String browser = browsername();
		try{
			
			driver=webdriverfactory.getdriver(browser);
		}
		
		catch(Exception e)
		{
			
			e.printStackTrace();
			Assert.fail("Incorrect Browser Sent. Check the Stack Trace");
		}
		
		
	}
	
	@After
    public void clean_up(){
        System.out.println("hello");
    }
	
}


