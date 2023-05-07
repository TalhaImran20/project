package testingAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.junit.Assert.assertTrue;

public class logIn {

	
	@Test
	public void verifyCalculatorIsDisplayed() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.calculator.net/");
	    driver.manage().window().maximize();
	    WebElement calculator = driver.findElement(By.id("sciout"));
	    assertTrue(calculator.isDisplayed());
	    System.out.println("LogIn Test Passed.");
	    Thread.sleep(2000);
	    driver.quit();
	}

	
}
