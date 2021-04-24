package WebDriver;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_getTitle {
public static void main(String[] args) throws InterruptedException {
	String exp ="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
			
	System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver_88\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	
	String title = driver.getTitle();
	System.out.println(title);
	
	if(title.equals(exp))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	
	
}
}
