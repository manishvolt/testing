package testing;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gittest {
	WebDriver driver;

@Before
public void setup() throws InterruptedException {
	
driver = new ChromeDriver();

driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

driver.get("https://www.amazon.in");


	
}
	
@Test
public void test() throws InterruptedException {
	
	
WebElement sign = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));

WebElement x = driver.findElement(By.xpath("//span[contains(text(),'Your Account')]"));

Actions a = new Actions(driver);

a.moveToElement(sign).build().perform();



x.click();

	

}

}
