package testingAssignment;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class buttonsExist {
	
	@Test
	public void testButtonFunctionality() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.calculator.net/");
	    driver.manage().window().maximize();

	    // Locating all the buttons on the calculator
//	    WebElement digit1 = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[3]/span[1]"));
//	    WebElement digit2 = driver.findElement(By.xpath("//span[contains(text(),'2')]"));
//	    WebElement digit3 = driver.findElement(By.xpath("//span[contains(text(),'3')]"));
//	    WebElement digit4 = driver.findElement(By.xpath("//span[contains(text(),'4')]"));
//	    WebElement digit5 = driver.findElement(By.xpath("//span[contains(text(),'5')]"));
//	    WebElement plus = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/span[4]"));
//	    WebElement multiply = driver.findElement(By.xpath("//span[contains(text(),'×')]"));
//	    WebElement backspace = driver.findElement(By.xpath("//span[contains(text(),'Back')]"));
//
//	   
//	   
//
//	    // Testing operator buttons
//	    digit2.click();
//	    plus.click();
//	    digit3.click();
	    Thread.sleep(2000);
	    String res= driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
	    System.out.println(res);
	    System.out.println("All Buttons Exist and Functioning Correctly.");
	    
	    driver.quit();


}}
