package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_type_dropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement prod_drop = driver.findElement(By.cssSelector("select#first"));
		
		
		Select s = new Select(prod_drop);
		s.selectByVisibleText("Iphone");
		
		WebElement seconddropdown = driver.findElement(By.cssSelector("select#animals"));
		
		
		Select ss = new Select (seconddropdown);
	ss.selectByVisibleText("Big Baby Cat");
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
