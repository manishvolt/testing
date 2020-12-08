package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bycssselector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Automation jars and softwares\\projects\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in");
		
		
		Thread.sleep(3000);
		
		WebElement list = driver.findElement(By.id("nav-hamburger-menu"));
		
		list.click();
		
		Thread.sleep(2000);
		
		WebElement panel = driver.findElement(By.cssSelector("input.hmenu"));
		
		panel.click();
		Thread.sleep(2000);
		
		
		
		
	}
	
}
