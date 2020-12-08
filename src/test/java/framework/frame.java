package framework;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class frame {

	
	WebDriver driver;
@Before
public  void setup() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
	}


@Test

public void test() {
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='singleframe']")));
	
	WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
	
	text.sendKeys("manish");
	
	driver.switchTo().defaultContent();
	
	
	WebElement pagetext = driver.findElement(By.xpath("//h1[contains(text(),'Automation Demo Site')]"));
	
	Assert.assertEquals("Automation Demo Site", pagetext.getText());
	
	
	
}

////div[@id='Multiple']//iframe

}
