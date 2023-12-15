package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_bootstrap_jquery {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement single = driver.findElement(By.cssSelector("[id=\"justAnotherInputBox\"]"));
		single.click();
		
		List <WebElement> singlelist = driver.findElements(By.cssSelector("[id=\"justAnotherInputBox\"]"));
		
		for (WebElement singlestore: singlelist ) {
			
			String values = singlestore.getText();
			
			if (values.equals("choice 3"))
				singlestore.click();
			
				
				
		}
		
		
		
	
		
		
		
	}
	
	
	
}
