package assignment;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class testcase2 extends testbase {

	
	
	@Test
	
	public void search(){
		
		
		                  
		
	                      
		driver.get(url);
		
		String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		String actual = driver.getTitle();
		
		Assert.assertEquals("test case failed",expected, actual);
		
		
		//explicit wait given below for the element search box
		WebDriverWait ab = new WebDriverWait(driver,20);

		WebElement searchbox = ab.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
		
	
		searchbox.sendKeys("laptop");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
		
		WebDriverWait qw = new WebDriverWait(driver,20);
		qw.until(ExpectedConditions.titleContains("Amazon.in : laptop"));
		
		Assert.assertEquals("Page Title validation","Amazon.in : laptop", driver.getTitle());
	
	}

}
