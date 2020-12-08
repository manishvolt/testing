package framework;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {

	WebDriver driver;
	@Before
	
	
	public  void setup() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/droppable");
		
	}
	
	@Test
	
	public  void test() throws InterruptedException {
		
		WebElement box = driver.findElement(By.id("draggable"));
		
		WebElement dragbox = driver.findElement(By.id("droppable"));
		
		Thread.sleep(4000);
		
		Actions a = new Actions(driver);
		
		a.clickAndHold(box).moveToElement(dragbox).build().perform();
		
	}
	
	
}
