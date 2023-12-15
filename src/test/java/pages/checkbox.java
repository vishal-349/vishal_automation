package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver ();
		
	driver.get("http://seleniumpractise.blogspot.com/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	List <WebElement> allcheckbox = driver.findElements(By.cssSelector("table#customers td input"));

	
	
	int i =0;
	
	for (WebElement s : allcheckbox) {
		
		if (i == 3) {
		break;}
		else i++;
	
		System.out.println(i);
			
		if (!s.isSelected())
		s.click();
		
//		
//	
//		
//		
//	}
//	
//	for (int i = 0; i < allcheckbox.size(); i++) {
//		if (i == 3) break;
//		allcheckbox.get(i).click();
//	}
//	
	
//		for (int i = 0; i < 3; i++) {
//			allcheckbox.get(i).click();
//		}
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}}