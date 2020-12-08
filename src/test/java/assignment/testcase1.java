package assignment;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 extends testbase {

	
	@Before
	public void setup(){
		
	driver = new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}

	

}
