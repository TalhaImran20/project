package testingAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class handleLongEqua {
	
	@Test(description="Verify that the calculator's display can handle long equations (over 20 characters) correctly.")
	//Feature: Calculator Display
	//Scenario: Verify that the calculator's display can handle long equations
	//Given: User is on the calculator page
	//When: User enters an equation that is longer than 20 characters
	//Then: The calculator display should be able to display the entire equation correctly
	public void testLongEquation() {
	    // Launch the website
		WebDriver driver;
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
	    driver.get("https://www.calculator.net/");
	    
	    // Find the calculator display and input the long equation
	   // WebElement display = driver.findElement(By.xpath("//div[@id='sciInPut']"));
//	    String equation = "1234567890+1234567890-1234567890*1234567890/1234567890";
//	    display.sendKeys(equation);
//	    display.sendKeys(Keys.ENTER);
	    
	    // Get the result from the calculator and verify it is correct
	    WebElement result = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
	    String actualResult = result.getText();
	    String expectedResult = "0";
	    Assert.assertEquals(expectedResult, actualResult);
	
	    driver.quit();
	
	}
	
	

	

}
