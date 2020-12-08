package framework;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class dropdown {

	WebDriver driver;
@Before
	
	public void setup() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https:/www.facebook.com/");
	
	}
	


@Test

public void test() {
	
	WebElement create = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
	
	create.click();
	
	WebElement birthday= driver.findElement(By.id("day"));
	
	WebElement month= driver.findElement(By.id("month"));
	
	WebElement year=driver.findElement(By.id("year"));
	
	
	Select x = new Select(birthday);
	x.selectByVisibleText("12");
	
	Select y = new Select(month);
	y.selectByVisibleText("Mar");
	
	Select z = new Select(year);
	z.selectByVisibleText("1993");
	
	
	
}

}
