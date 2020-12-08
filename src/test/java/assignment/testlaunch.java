package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testlaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		
		//System.setProperty("webdriver.gecko.driver", "D:\\Automation jars and softwares\\projects\\selenium\\geckodriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https:www.amazon.in");
		
		
	}

}
