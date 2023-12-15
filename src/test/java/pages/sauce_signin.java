package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class sauce_signin extends Base {

	
	public void user_enter_username_and_password(String u, String p) {
		WebElement username = driver.findElement(By.cssSelector("[data-test=\"username\"]"));
		username.sendKeys(u);
		WebElement password = driver.findElement(By.cssSelector("[data-test=\"password\"]"));
		password.sendKeys(p);
	}

	
	public void user_click_on_login_button() {
		WebElement loginbtn = driver.findElement(By.cssSelector("[data-test=\"login-button\"]"));
		clickOnElement(loginbtn);
		
	}
	
	public void validate_successfull_login() {
		WebElement check = driver.findElement(By.cssSelector("[class=\"title\"]"));
	   validatetext(check, "Products");
	}

	
	
}
