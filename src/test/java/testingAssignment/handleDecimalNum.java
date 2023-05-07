package testingAssignment;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handleDecimalNum {
	
	@Test
	// Feature: Decimal number calculations
	// Scenario: Verify that calculator can handle decimal numbers correctly
	public void testDecimalNumberCalculation() {
	    // Navigate to calculator website
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("https://www.calculator.net/");

	    // Find and click on the decimal point button
	    WebElement decimalPointButton = driver.findElement(By.xpath("//span[contains(text(),'.')]"));
	    decimalPointButton.click();

	    // Find and click on the number 1 button
	    WebElement number1Button = driver.findElement(By.xpath("//span[contains(text(),'7')]"));
	    number1Button.click();

	    // Find and click on the plus button
	    WebElement plusButton = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/span[4]"));
	    plusButton.click();

	    // Find and click on the decimal point button
	    decimalPointButton.click();

	    // Find and click on the number 2 button
	    WebElement number2Button = driver.findElement(By.xpath("//span[contains(text(),'8')]"));
	    number2Button.click();

//	    // Find and click on the equal button
//	    WebElement equalButton = driver.findElement(By.id("BtnCalc"));
//	    equalButton.click();

	    // Verify that the result is 1.2
	    WebElement result = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
	    assertEquals("1.5".trim(), result.getText().trim());
	    
	    driver.quit();
	}

	

}
