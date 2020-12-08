package framework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;





public class dropdownwithoutselect {

	//http://demo.guru99.com/test/simple_context_menu.html
	
	
	WebDriver driver;

	@Before
	
	public  void setup() {
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	
	}

	@Test
	
	public void test() throws InterruptedException {
		
		WebElement right = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions x = new Actions(driver);
		
		x.contextClick(right).build().perform();
		
	   Thread.sleep(3000);
		
		List <WebElement> as= driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//li/span"));
		
		
		
		for(int i=0; i<as.size(); i++)
		{
			Thread.sleep(3000);
			System.out.println("options no " + (i+1) + " are " + as.get(i).getText());
		
			Thread.sleep(3000);
			
			if(as.get(i).getText().equals("Copy"))
			{
				as.get(i).click();
			}
		
		}
		
		}
		
		
	}
	
	

