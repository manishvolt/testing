package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class launchbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation jars and softwares\\projects\\selenium\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://www.amazon.in/");
	
	Thread.sleep(3000);
	
	WebElement click = driver.findElement(By.id("twotabsearchtextbox"));
	
	click.sendKeys("mobile");
	
	click.click();
	
	Thread.sleep(5000);
	
	driver.quit();
	}

}
