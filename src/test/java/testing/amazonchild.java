package testing;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonchild {

	String pagetitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

	WebDriver driver;
	
@Before	
public void setup()
{
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation jars and softwares\\projects\\selenium\\chromedriver.exe");	
 driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://www.amazon.in");
	
}
	
@Test
public void validatetitle()
{
	
	Assert.assertEquals("page title is not matching", pagetitle, driver.getTitle());
    
	System.out.println("test case is passed");
	
	
}

@Test

public void enterkeyword() throws InterruptedException

{
	WebElement as = driver.findElement(By.xpath("//input[@type='text' and @id='twotabsearchtextbox']"));
	
	as.sendKeys("mobile");
	
	
	
	WebElement click = driver.findElement(By.xpath("//input[@type='submit' and @value='Go']"));
	
	click.click();
	
	Thread.sleep(10000);
	
	WebElement searchresultstext = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
	
	Assert.assertEquals("\"mobile\"", searchresultstext.getText());
	System.out.println("test case passed");
	
	Thread.sleep(3000);
	
	as.clear();
}
	

@After

public void teardown()

{
	driver.quit();
	
}


}
