package practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestRun extends TestBase {

	
	@Test
	public void SearchProduct() throws InterruptedException {
	driver.get(url);
	String title="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	String ActualTitle= driver.getTitle();
	Assert.assertEquals("page title validation",title, ActualTitle);
	
	WebDriverWait webDriverwait = new WebDriverWait(driver, 20);
	WebElement searchBox= webDriverwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='twotabsearchtextbox']")));
	
	searchBox.sendKeys("furniture");
	driver.findElement(By.xpath("//input[@value='Go']")).click();
	
	WebDriverWait webDriverwait1 = new WebDriverWait(driver, 20); 
	webDriverwait1.until(ExpectedConditions.titleIs("Amazon.in : furniture"));
	
	Assert.assertEquals("page title validation","Amazon.in : furniture", driver.getTitle());
	
	Thread.sleep(5000);
	
	}
	
	
}
