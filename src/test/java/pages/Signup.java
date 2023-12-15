package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Signup {
	
	public static void main (String [] args ) {
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.newlook.com/uk/");
		driver.manage().window().maximize();
		
		WebElement account = driver.findElement(By.cssSelector("[data-ng-show=\"!isLoggedIn\"]"));
		account.click();
		
		WebElement create_new_account = driver.findElement(By.cssSelector("[data-ng-click=\"registerTabs = true\"]"));
		create_new_account.click();
		
		WebElement email = driver.findElement(By.cssSelector("[data-ng-model=\"register.email\"]"));
		email.sendKeys("karishma@gmail.com");
		
		WebElement password = driver.findElement(By.cssSelector("[id=\"pwd\"]"));
		password.sendKeys("mui@123");
		
		
		WebElement dropdown = driver.findElement(By.cssSelector("[data-ng-model=\"register.titleCode\"]"));
		Select s = new Select (dropdown);
		s.selectByVisibleText("Miss");
		
		
		WebElement firstname = driver.findElement(By.cssSelector("[data-ng-model=\"register.firstName\"]"));
		firstname.sendKeys("karishma");
		WebElement Lastname = driver.findElement(By.cssSelector("[data-ng-model=\"register.lastName\"]"));
		Lastname.sendKeys("joshi");
		
		WebElement checkbox = driver.findElement(By.cssSelector("[for=\"ageConfirmation\"]"));
		
	checkbox.click();
		
		
			WebElement createaccount = driver.findElement(By.cssSelector("[data-ng-click=\"onSubmit($event)\"]"));
			createaccount.click();
		
		
		
		
	}








	
	
	
	

}
