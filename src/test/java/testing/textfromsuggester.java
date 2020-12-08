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

public class textfromsuggester {


       String taketext = "mobile watch";
		
       
       
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
		
		public void search() throws InterruptedException
		{
			WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			
			search.sendKeys("mobile");
			
			
			Thread.sleep(3000);
			
			
			List <WebElement> textlist = driver.findElements(By.xpath("//div[@id='suggestions-template']//div[@id='suggestions']//div[@class='s-suggestion']"));
			
			////div[@id='suggestions-template'and text()-'mens watch'] - directly find the xpath of particular suggestion
			
			System.out.println("count is " + textlist.size());
			
			for(int i=0; i<textlist.size(); i++)
			{
				
				Thread.sleep(3000);
				
				if(textlist.get(i).getText().equals(taketext))
				
				{
					textlist.get(i).click();
					
					
					
					
					List <WebElement> allprice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
					System.out.println("all prices are---> ");
					
					
					int x = 0;
					for(int j=0; j<allprice.size(); j++)
				{
						System.out.println((j+1)+ ". " + allprice.get(j).getText());
					
					x = x + Integer.valueOf(allprice.get(j).getText().substring(3));
					
					}
					
					System.out.println("total is " + x);
				}
				
			}
					
		}			//Thread.sleep(5000);
			
		
		
		
		

		
		@After
		
		public void end()
		{
			System.out.println("bye");
		}
		
	}


