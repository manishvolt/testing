package framework;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class alert {

	WebDriver driver;
	@Before
	
	
	public  void setup() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
	}

	
	@Test
	
	public void test() {
		
	/*	WebElement alertbutton = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		
		alertbutton.click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();*/
		
		// this command is to cancel the alert -> alert.dismiss();
		
		
		WebElement alertbutton2 = driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]"));
				
				alertbutton2.click();
	

				WebElement alertbutton3 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
				
				alertbutton3.click();
				
				Alert a = driver.switchTo().alert();
				
				a.sendKeys("hi manish");
				
				a.accept();
				
				WebElement verify = driver.findElement(By.xpath("//p[contains(text(),'Hello hi manish How are you today')]"));
				
				Assert.assertEquals(true, verify.getText().contains("hi manish"));
				
	}
	
	
}
