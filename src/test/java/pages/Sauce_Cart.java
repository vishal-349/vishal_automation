package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class Sauce_Cart extends Base {

	public void user_click_on_add_to_cart_button() {
		 WebElement AddProduct = driver.findElement(By.cssSelector("[data-test=\"add-to-cart-sauce-labs-bike-light\"]"));
	       clickOnElement(AddProduct);
	    }
	
public void user_click_on_cart_button () {
	WebElement cartbtn = driver.findElement(By.cssSelector("[class=\"shopping_cart_link\"]"));
    clickOnElement(cartbtn);
	}

	    
	    public void validateProductAddedSuccessfully() {
	    	WebElement validatecheckout = driver.findElement(By.cssSelector("[data-test=\"checkout\"]"));
	    	validatetext(validatecheckout, "Checkout");
	    }
		
		
	
	
}
