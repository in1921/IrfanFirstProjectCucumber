package hyperlinks;



import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCounts {
	//this is my link count class
	WebDriver driver;
	
	@Before 
	
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver","/Users/irfankhan/Desktop/chromedriver");

		driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	}
	
@Test
public void totalLinks() {
    //WebElement links = driver.findElement(By.tagName("a"));
   List< WebElement> allLinks = driver.findElements(By.tagName("a"));
   
   for(int i=0;i<allLinks.size();i++) {
	   
	   if (allLinks.get(i).getText().equals("forgot account")) {
		   System.out.println("Test passed!");
	   }
	   System.out.println(allLinks.get(i).getText());
   }
   
	   
   }


@After
public void closeBrowsers() {
}
}