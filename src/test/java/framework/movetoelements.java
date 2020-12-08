package framework;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movetoelements {

	WebDriver driver;
	
	
	@Before
	
	public  void setup() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
	
	}
	
	
@Test

public void test() {

WebElement hello = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));

WebElement window = driver.findElement(By.xpath("//span[contains(text(),'Your Account')]"));

Actions x = new Actions(driver);

x.moveToElement(hello).click(window).build().perform();

}
}