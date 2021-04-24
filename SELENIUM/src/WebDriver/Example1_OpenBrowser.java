package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_OpenBrowser {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver_88\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://github.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.navigate().back();
	Thread.sleep(1000);
	
	driver.navigate().forward();
	Thread.sleep(1000);
	
	driver.close();
}
}
