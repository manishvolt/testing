package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class byxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	
	//System.setProperty("webdriver.chrome.driver", "D:\\Automation jars and softwares\\projects\\selenium\\chromedriver.exe");
	
		
		
	WebDriver driver = new ChromeDriver();
	
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://www.amazon.in");
	
	Thread.sleep(2000);
	
	WebElement sigin = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	
	sigin.sendKeys("mobile");
	
	WebElement go = driver.findElement(By.xpath("//input[@value='Go']"));
	
	go.click();
	
	WebElement hit = driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
	
    hit.click();
	
	 
	
	
	}

}
