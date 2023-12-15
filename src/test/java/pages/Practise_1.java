package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_1 {
	
	
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver ();
	driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebElement firstname = driver.findElement(By.cssSelector("[name=\"firstname\"]"));
		firstname.sendKeys("vishal");
		WebElement lastname = driver.findElement(By.cssSelector("[name=\"lastname\"]"));
		lastname.sendKeys("tyagi");
		
		WebElement radiobtn1 = driver.findElement(By.cssSelector("[value=\"Male\"]"));
	radiobtn1.click();
	WebElement radiobtn2 = driver.findElement(By.cssSelector("[value=\"4\"]"));
	radiobtn2.click();
	
	List <WebElement> chekboxes = driver.findElements(By.cssSelector("[name=\"profession\"]"));
	for (WebElement e:chekboxes) {
		if(!e.isSelected())
		e.click();
	}
	WebElement choosefile = driver.findElement(By.cssSelector("[type=\"file\"]"));
	choosefile.sendKeys("C:\\Users\\ppmte\\Pictures\\Screenshots\\ss.png");
	try {
		Thread.sleep(3000);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
		
	List <WebElement> checkboxes2 = driver.findElements(By.cssSelector("[name=\"tool\"]"));
	
	int count = checkboxes2.size();
	
	for(int i=0; i<count ; i++) {
		
	WebElement values= checkboxes2.get(i);
	if ((i==0 || i==2) && !values.isSelected()){
	values.click();	
	}
	}
	
	
	
}	
	
	
	
	
	
}
