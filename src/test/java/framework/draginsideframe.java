package framework;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draginsideframe {

	WebDriver driver;
	@Before
	
	
	public  void setup() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/droppable/");
		
	}

	@Test
	
	public void test() throws InterruptedException {
		
		
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));	
	
	
	WebElement dragbox = driver.findElement(By.id("draggable"));
	
	WebElement dragto = driver.findElement(By.id("droppable"));
	
	Actions a = new Actions(driver);
	
	Thread.sleep(4000);
	
	a.clickAndHold(dragbox).moveToElement(dragto).build().perform();
	//a.dragAndDrop(dragbox, dragto).perform();	
	
	}
	
}
