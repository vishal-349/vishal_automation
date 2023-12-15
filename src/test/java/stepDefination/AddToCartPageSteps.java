package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Sauce_Cart;

public class AddToCartPageSteps {

	Sauce_Cart cart = new Sauce_Cart ();
	
	
	@When("user click on add to cart button")
	public void user_click_on_add_to_cart_button() {
	    cart.user_click_on_add_to_cart_button();
	}
	
	@And ("user click on cart button")
	public void user_click_on_cart_button () {
		cart.user_click_on_cart_button();
	}

    @Then("validate product added successfully")
    public void validateProductAddedSuccessfully() {
       cart.validateProductAddedSuccessfully();
    }
	
	
	
	
	
	
	
	
	
	
	
}
