package helper;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Base {
	public static Properties prop;
	public static WebDriver driver;
	static {

		try {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/java/resources/env.properties");
			 prop = new Properties();
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
@Before
	public void setup() {
		String browserName = prop.getProperty("browser"); // chrome//

// WE HAVE TWO METHODS FOR INOVOKING BROWSER 1ST IS SWITCH METHOD & 2ND IS IF/ELSEIF METHOD.

//SWITCH METHOD.

		switch (browserName) {

		case "chrome":
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			
			driver = new ChromeDriver(options);
			break;
		case "firefox":
			FirefoxOptions options1 = new FirefoxOptions();
			options1.addArguments("--incognito");
			driver = new FirefoxDriver(options1);
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		}

//if & else if method.

		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();

		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

	}

	public void selectdropdown(WebElement ele, String value, String type) {

		Select s = new Select(ele);
		switch (type) {

		case "visibleText":
			s.selectByVisibleText(value);
			break;
		case "index":
			s.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			s.selectByValue(value);
			break;

		}

	}

	public void test() {

		WebElement ele = null;
		selectdropdown(ele, "0", "aa");

	}

	public void actionmethods(WebElement ele, String method) {
		Actions a = new Actions(driver);
		switch (method) {
		case "mousehover":
			a.moveToElement(ele).build().perform();
			break;
		case "click":
			a.click(ele).build().perform();
			break;

		}

	}

	public void bootstrap(List<WebElement> list, String value) {
		for (WebElement ele : list) {
			String text = ele.getText();
			if (text.equals(value))
				ele.click();
			break;
		}
	}

	public void explicitwait(WebElement ele, String condition, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		switch (condition) {
		case "clickable":
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			break;
		case "visible":
			wait.until(ExpectedConditions.visibilityOf(ele));
			break;
		case "alert":
			wait.until(ExpectedConditions.alertIsPresent());
			break;

		}

	}
	
	public void switchframe(String name , String type) {
		switch(type) {
		case "name":
			driver.switchTo().frame(name);
			break;
		case "index":
			driver.switchTo().frame(Integer.parseInt(name));
			break;
		}
		
		
		
		
	}
	public void windowswitch (String title) {
		Set<String>allwindows = driver.getWindowHandles();
		for (String s:allwindows) { 
			driver.switchTo().window(s);
			String currenttitle = driver.getTitle();
			if (currenttitle.equals(title))
			break;
		}
		
		
	}

	public void handlealert(String type) {
		explicitwait(null, "alert", 10);
		Alert a = driver.switchTo().alert();

		switch (type) {
		case "select":
			a.accept();
			break;
		case "cancel":
			a.dismiss();
			break;
		}

	}

	public void clickOnElement(WebElement ele) {
		explicitwait(ele, "clickable", 10);
		try {
			ele.click();
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", ele);
		}
	}

	public void validatetext(WebElement ele, String expected) {
		String actualvalue = ele.getText();
		assertEquals(actualvalue, expected);

	}
	@After
	public void teardown (Scenario s) throws IOException {
		if (s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File ("screenshot/"+s.getName()+".png"));
			
			
			
		}
			
		
		driver.quit();
	}

	
}

