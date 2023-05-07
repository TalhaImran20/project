package testingAssignment;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class arithmaticOperations {
	
	@Test
	public void testBasicArithmeticOperations() {
	    // Load the calculator website
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("https://www.calculator.net/");

	    // Enter the first number
	    WebElement firstNumber = driver.findElement(By.xpath("//span[contains(text(),'5')]"));
	    firstNumber.click();

	    // Click on the addition button
	    WebElement addButton = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/span[4]"));
	    addButton.click();

	    // Enter the second number
	    WebElement secondNumber = driver.findElement(By.xpath("//span[contains(text(),'5')]"));
	    secondNumber.click();

	    // Click on the equals button
	    WebElement equalsButton = driver.findElement(By.xpath("//span[contains(text(),'=')]"));
	    equalsButton.click();

	    // Verify the result is correct
	    String result = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText().trim();
	    assertEquals("10", result);
	    System.out.println( "Arithmatic Operations working correctly, Test is passed.");

	    // Clear the calculator
	    WebElement clearButton = driver.findElement(By.xpath("//span[@id='scimrc']"));
	    clearButton.click();
	    
	    driver.quit();

	   	
	}

	

}
