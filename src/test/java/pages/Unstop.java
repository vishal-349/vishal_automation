package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unstop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://unstop.com/auth/signup?returnUrl=%2F");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement firstname = driver.findElement(By.cssSelector("[id=\"first_name\"]"));
		firstname.sendKeys("john");
		
		WebElement lastname = driver.findElement(By.cssSelector("[id=\"last_name\"]"));
		lastname.sendKeys("doe");
		
		WebElement username = driver.findElement(By.cssSelector("[id=\"username\"]"));
		username.sendKeys("mayankyadav_1");
		
		WebElement email = driver.findElement(By.cssSelector("[id=\"email_address\"]"));
		email.sendKeys("1234@gmail.com");
		
		WebElement mobile = driver.findElement(By.cssSelector("[id=\"mat-input-0\"]"));
		mobile.sendKeys("9897000000");
		
		WebElement password = driver.findElement(By.cssSelector("[id=\"choose_password\"]"));
		password.sendKeys("Email@123");
		
		WebElement confirmpassword = driver.findElement(By.cssSelector("[id=\"confirm_password\"]"));
		confirmpassword.sendKeys("Email@123");
		
		WebElement checkbox = driver.findElement(By.cssSelector("[for=\"agreed\"]"));
		checkbox.click();
	
		
		WebElement nextbutton = driver.findElement(By.cssSelector("[class=\"gtm_step1 waves-effect\"]"));
		nextbutton.click();
		
		
		driver.quit();
		
		
		
		
	}
}
