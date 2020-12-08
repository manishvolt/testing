package assignment;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class testclass {

	String pagetitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	                  
	
	          
	
	WebDriver driver;
	
	@Before
	
	public void invoke()
	{
		//"webdriver.chrome.driver", "D:\\Automation jars and softwares\\projects\\selenium\\chromedriver.exe"
	System.setProperty("webdriver.chrome.driver", "D:\\Automation jars and softwares\\projects\\selenium\\chromedriver.exe");	
	driver= new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}
	
	@Test
	public void website() throws InterruptedException {
		
		driver.get("https://www.amazon.in");
		
		Thread.sleep(4000);
		String title = driver.getTitle();
		Assert.assertEquals("test failed",pagetitle, title);
		
		
		System.out.println(title);
	}
	
	
	

	@After
	
	public void end()
	{
		
		driver.quit();
	}
}
