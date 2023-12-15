package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootsrap_type_dropdown_practise {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver ();
		
		
		driver.manage().window().maximize();
		
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	WebElement dropdown =driver.findElement(By.cssSelector("[data-toggle=\"dropdown\"]"));
	dropdown.click();
	
	List <WebElement> list = driver.findElements(By.cssSelector("[role=\"menu\"] li a"));
	
for ( WebElement store:list) {
	String values = store.getText();
	
	if (values.equals("JavaScript"));
	store.click();
	break;

	
}
		
		
	}	
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
