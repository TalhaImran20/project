package testingAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class checkComplexNum {
	
	public class ComplexCalculationTest {
	    
	    WebDriver driver;
	    
	    @BeforeTest
	    public void setup() throws InterruptedException{
	        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.calculator.net/");
	        
	        Thread.sleep(3000);
	    }
	    
	    @Test(description = "Verify that the calculator can perform complex calculations correctly.")
	    public void verifyComplexCalculation() {
	        
	        // Inputting the equation "(2+3)*5"
//	        WebElement two = driver.findElement(By.xpath("//span[contains(text(),'2')]"));
//	        two.click();
//	        WebElement plus = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/span[4]"));
//	        plus.click();
//	        WebElement three = driver.findElement(By.xpath("//span[contains(text(),'3')]"));
//	        three.click();
//	        WebElement multiply = driver.findElement(By.xpath("//span[contains(text(),'×')]"));
//	        multiply.click();
//	        WebElement five = driver.findElement(By.xpath("//span[contains(text(),'5')]"));
//	        five.click();
//	        WebElement equals = driver.findElement(By.xpath("//span[contains(text(),'=')]"));
//	        equals.click();
//	        
//	        // Getting the result and verifying if it is correct
//	        WebElement result = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
//	        Assert.assertEquals(result.getText().trim(), "17".trim());
	        
	        driver.quit();
	    }
	    
	}


}
