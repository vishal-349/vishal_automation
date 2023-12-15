package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertion_validation {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://techture.qa.cube.ms/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.cssSelector("[data-testid=\"email\"]"));
		email.sendKeys("arun.sharma@techture.global");
		
		WebElement pass = driver.findElement(By.cssSelector("[data-testid=\"password\"]"));
		pass.sendKeys("pass123");

		WebElement signinbtn = driver.findElement(By.cssSelector("[data-testid=\"signInButton\"]"));
		signinbtn.click();
		
		
		//assertion method 1
		
		assertTrue(driver.findElement(By.cssSelector("[data-testid=\"portalDashboardText\"]")).isDisplayed());
		System.out.println("pass");
		
		//assertion method 2
		
	WebElement validationtext =	driver.findElement(By.cssSelector("[data-testid=\"portalDashboardText\"]"));
		String text = validationtext.getText();
	assertEquals(text, "Portal Dashboard123" , "differen text found");
	
	//assertion method 3
	
	WebElement valid =	driver.findElement(By.cssSelector("[data-testid=\"portalDashboardText\"]"));
	assertTrue(valid.isDisplayed());
	
		
	
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
