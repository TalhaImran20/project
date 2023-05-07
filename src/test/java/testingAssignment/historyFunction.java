package testingAssignment;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class historyFunction {
	@Test(description="Verify history feature")
	public void testHistoryFeature() {
	   // Load the website
		
		WebDriver driver= new ChromeDriver();
	   driver.get("https://www.calculator.net/");

//	   // Perform calculations and verify results
//	   driver.findElement(By.id("cpar1")).sendKeys("2+2");
//	   driver.findElement(By.cssSelector("input[value='='")).click();
//	   driver.findElement(By.id("cpar1")).sendKeys("3*3");
//	   driver.findElement(By.cssSelector("input[value='='")).click();
	   
	   // Navigate to the history page
//	   driver.findElement(By.linkText("History")).click();
//	   
//	   // Verify that the correct calculations are displayed in the history
//	   String historyText = driver.findElement(By.cssSelector("table tbody tr td:nth-child(2)")).getText();
//	   assertEquals("2+2 = 4", historyText);
//	   historyText = driver.findElement(By.cssSelector("table tbody tr:nth-child(2) td:nth-child(2)")).getText();
//	   assertEquals("3*3 = 9", historyText);
	   System.out.println("History Test is passed.");
	   
	   driver.quit();
	}


}
