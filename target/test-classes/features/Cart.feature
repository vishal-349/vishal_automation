
Feature: Add to cart functionality
  

  @reg
  Scenario: verify add product in cart
    When user enter username "standard_user" and password "secret_sauce"
  And user click on login button
  And user click on add to cart button
  And user click on cart button
  Then validate product added successfully
 