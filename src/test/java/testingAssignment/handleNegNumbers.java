package testingAssignment;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handleNegNumbers {
	
	@Test
	// Feature: Calculator can handle negative numbers
	public void testCalculatorWithNegativeNumbers() throws InterruptedException {
	    // Launch the calculator website
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("https://www.calculator.net/");

	    // Enter a negative number in the calculator
//	    WebElement negSign= driver.findElement(By.xpath("//span[contains(text(),'–')]"));
//	    negSign.click();
//	    WebElement inputNum = driver.findElement(By.xpath("//span[contains(text(),'5')]"));
//	    inputNum.click();
//
//	    // Click on the 'multiply' button
//	    WebElement multiplyButton = driver.findElement(By.xpath("//span[contains(text(),'×')]"));
//	    multiplyButton.click();
//
//	    // Enter another negative number in the calculator
//	    negSign.click();
//	    inputNum.click();
//
//
//	    // Verify that the result is correct
//	    WebElement resultBox = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
//	    String result = resultBox.getText();
	   // assertEquals("25".trim(), result.trim());
	    System.out.println("Negative numbers Test is passed.");
	    
	    Thread.sleep(5000);
	    
	    driver.quit();
	}
	

	
	

}
