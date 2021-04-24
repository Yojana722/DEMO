package LISTBOX;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example2_getAllOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver_88\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//a[contains(@class,'_42ft _4jy0')])[3]")).click();
	    Thread.sleep(1000);
	    
	    WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	    Thread.sleep(2000);
	    
	    Select s = new Select(month);
	    
	    List<WebElement> allOptions = s.getOptions();
	    
	    System.out.println("Size of ListBox:"+allOptions.size());
	    for(WebElement option:allOptions)
	    {
	    	System.out.println(option.getText());
	    }
	    
}
}
