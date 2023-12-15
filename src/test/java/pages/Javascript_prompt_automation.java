		package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_prompt_automation {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement submitbtn = driver.findElement(By.cssSelector("[name=\"submit\"]"));
		submitbtn.click();
		
		Alert prompt = driver.switchTo().alert();
		prompt.accept();
		
		Alert prompt2 = driver.switchTo().alert();
		prompt2.accept();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
