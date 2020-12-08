package testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {

	WebDriver driver;

	
@Before

public void setup()
{
	
	System.setProperty("webdriver.chrome.driver","D:\\Automation jars and softwares\\projects\\selenium\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	driver.get("https://www.amazon.in");
	}



@Test

public void search() throws InterruptedException
{

	WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	
	Thread.sleep(3000);
	
	search.sendKeys("mobile phones");
	
	Thread.sleep(3000);
	
	WebElement go = driver.findElement(By.xpath("//input[@type='submit']"));
	
	go.click();
	
	Thread.sleep(3000);
	
List<WebElement> links = driver.findElements(By.tagName("a"));
	
/*	
	System.out.println("links are- " + links.size());
	
	for(int i=0; i<links.size(); i++)
	{
		System.out.println((i+1) +" " + links.get(i).getText());		
	}
	*/

	Thread.sleep(3000);
	
	for(int j=0; j<links.size(); j++)
	{
		if(links.get(j).getText().isEmpty())
			
		{
			
		}
		
		else
		{
			System.out.println(((j+1) + ", " + links.get(j).getText()));
		}
	}
	
}







@After

public void laststep()
{
	

	
	if(driver.getPageSource().contains("Top deals on mobiles"))
	{
		
		System.out.println("Test case passed");
	}
	
	else
	{
		System.out.print("test case failed");
	}
	
}
	
}
	
	
	
	


