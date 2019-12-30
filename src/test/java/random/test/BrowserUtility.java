package random.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserUtility {
	
	public static WebDriver driver;
	
	@BeforeMethod
   public  void openBrowser(){
	      System.setProperty("webdriver.chrome.driver", "/Users/fatemaislam/Downloads/chromedriver"); 
	 	   driver=new ChromeDriver();
	 	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	   driver.manage().window().fullscreen();
	 	 
	   
	   }
	@Test
	   public void testOne() {
		   driver.navigate().to("https://www.tripadvisor.com/");
		   System.out.println("TestOne title is " +driver.getTitle());
	   }
	@Test
	   public void testTwo() {
		   driver.navigate().to("https://www.tripadvisor.com/");
		   System.out.println("TestTwo title is " +driver.getTitle());
	   }
	@Test
	   public void testThree() {
		   driver.navigate().to("https://www.tripadvisor.com/");
		   System.out.println("TestThree title is " +driver.getTitle());
	   }
	@AfterMethod
	public void quit() {
		driver.quit();
	}
}