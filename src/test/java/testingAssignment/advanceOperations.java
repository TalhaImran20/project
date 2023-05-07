package testingAssignment;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class advanceOperations {
	
	
	WebDriver driver= null;
	@SuppressWarnings("null")
	@BeforeTest
	public void setUp() {
		 // Load the website
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void testSquareRoot() {
	   
		driver = new ChromeDriver();
	   
		driver.get("https://www.calculator.net/");
	    // Find and click the square root button
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement sqrtButton = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/div[4]/span[3]"));
	    sqrtButton.click();
	    
	    // Enter a number and calculate the square root
	    WebElement num = driver.findElement(By.xpath("//span[contains(text(),'9')]"));
	    num.click();
	  
	    
	    // Verify the result
	    String resultField = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText().trim();
	    assertEquals("3".trim(), resultField);
	    
	  
	    
	    System.out.println("Advance Operations are working.");
	}

	
	  @SuppressWarnings("deprecation")
	@AfterTest
      public void testPercentage() {
			    // Load the website
				
			   WebElement clr= driver.findElement(By.xpath("//span[contains(text(),'AC')]"));
			   clr.click();
			    
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    
			   
			// Find and click the percentage button
			    WebElement percentButton = driver.findElement(By.xpath("//span[contains(text(),'%')]"));
			    percentButton.click();
			    
			    // Enter a number and percentage value
			    WebElement num = driver.findElement(By.xpath("//span[contains(text(),'9')]"));
			    num.click();
			   	    
			    
			    // Verify the result
			    String resultField = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText().trim();
			    assertEquals("0", resultField);
			    
			    driver.quit();
			}
		    

}
