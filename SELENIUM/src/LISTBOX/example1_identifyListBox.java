package LISTBOX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1_identifyListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver_88\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//a[contains(@class,'_42ft _4jy0')])[3]")).click();
	    Thread.sleep(1000);
	    
	    WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
	    Thread.sleep(2000);
	    
	    Select s = new Select(month);
	    
	    s.selectByIndex(5);
	    Thread.sleep(500);
	    
	    s.selectByVisibleText("Sep");
	    Thread.sleep(500);
	    
	    s.selectByValue("5");
	    Thread.sleep(500);
	    
	    driver.close();
	    
	    
	
	
	
	
	
	}
}
