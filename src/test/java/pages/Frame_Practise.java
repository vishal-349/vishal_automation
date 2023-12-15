package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame_Practise {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		
		
		
		driver.switchTo().frame("frm1");
		
		WebElement firstdropdown = driver.findElement(By.cssSelector("[id='course']"));
		
		
		Select s = new Select (firstdropdown);
		
	s.selectByVisibleText("Java");
	
	
	
	
	
	
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
