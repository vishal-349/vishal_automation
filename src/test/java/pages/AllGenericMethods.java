package pages;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllGenericMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebElement country = driver.findElement(By.cssSelector(""));
		WebElement state = driver.findElement(By.cssSelector(""));
		WebElement dropdown = driver.findElement(By.cssSelector(""));
		

		AllGenericMethods tt = new AllGenericMethods();
		tt.selectDropdownVisibleText(country, "india");
		tt.selectDropdownVisibleText(dropdown, "uk");
		tt.mouseHover(state);
		tt.mouseHover(state);
		tt.bootStrapDropdown(null, null);
		tt.clickjavaScriptexecuter(dropdown);

	}

	

	public void selectDropdownVisibleText(WebElement ELE, String value) {

		Select s = new Select(ELE);
		s.selectByVisibleText(value);

	}

	public void mouseHover(WebElement ele) {
		WebDriver driver = new ChromeDriver();

		Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();

	}
public void explicitWait(WebElement ele) {
	
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(ele) );
	
}

public void waittillelementclickable(WebElement ele) {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	
	
}


public void bootStrapDropdown(List<WebElement>dropdownlist , String values ) {
	
	for (WebElement t : dropdownlist) {
		String text = t.getText();
		if (text.equals(values)) {
		t.click();
		break;
		}
	}
	
}

public void selectDropdownIndex(WebElement ele , int number) {
	Select s = new Select (ele);
	s.selectByIndex(number);
	
}
	
public void switchframe(int number) {
	
	WebDriver driver = new ChromeDriver();
	driver.switchTo().frame(number);
	
}	

public void selectAlertPopup() {
	WebDriver driver = new ChromeDriver();
	Alert a = driver.switchTo().alert();
	a.accept();
		
}


public void switchWindow (String title) {
	WebDriver driver = new ChromeDriver();
	Set<String> allwindows=driver.getWindowHandles();
	for (String w:allwindows) {
		driver.switchTo().window(w);
		if (driver.getTitle().contains(title)) 
			
			break;
	}
		
	
	
}

public void clickjavaScriptexecuter (WebElement ele) {
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("argument[0].click(); " , ele);
	
}


}
