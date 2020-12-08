package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver", "D:\\Automation jars and softwares\\projects\\selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://www.amazon.in");
	
	
	Thread.sleep(3000);
	
	
	WebElement panel = driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
	panel.click();
	Thread.sleep(2000);
	
	
	WebElement ss = driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.dsk-hmenu-reorganization.hmenu-visible > li:nth-child(15) > a > div"));
	
	ss.click();
	
	
	
	WebElement sa = driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.dsk-hmenu-reorganization.hmenu-visible.hmenu-translateX > li:nth-child(17) > a"));
	
	sa.click();
	
	
	System.out.println("hello");
	
/*	if(driver.getPageSource().contains("Shop By Department"))
	{
		
		System.out.println("name validated");
		
	}
	
	else{
	
	
	System.out.println("name not found");
	}
	*/
	
	
	
	
	
	
	}

}
