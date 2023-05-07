package testingAssignment;

import java.util.concurrent.TimeUnit;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class handleLargerNum {
	
	@Test(description="Verify calculator can handle large numbers correctly")
	public void testLargeNumbers() {
	    // Input two large numbers
	    String firstNumber = "1234567890";
	    String secondNumber = "9876543210";

	    WebDriver driver;
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.calculator.net/");
	    // Click on the first number button
	    WebElement firstNumBtn = driver.findElement(By.xpath("//span[contains(text(),'3')]"));
	    firstNumBtn.click();

	    // Click on the rest of the digits for the first number
	    for (int i = 1; i < firstNumber.length(); i++) {
	    	firstNumBtn.click();
	    }

	    // Click on the addition operator
	    WebElement addOpBtn = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/span[4]"));
	    addOpBtn.click();

	    // Click on the first number button for the second number
	    WebElement secondFirstNumBtn = driver.findElement(By.xpath("//span[contains(text(),'2')]"));
	    secondFirstNumBtn.click();

	    // Click on the rest of the digits for the second number
	    for (int i = 1; i < secondNumber.length(); i++) {
//	        WebElement numBtn = driver.findElement(By.id("Btn" + secondNumber.charAt(i)));
//	        numBtn.click();
	    	secondFirstNumBtn.click();
	    }

	  

	    // Verify that the result is correct
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    String result = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
	    Assert.assertEquals("5555555555".trim(), result.trim());
	    
	    
	    driver.quit();
	}
	
	

}
