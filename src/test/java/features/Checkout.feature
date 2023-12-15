Feature: Checkout functionality

  @reg
  Scenario: Verify Checkout functionality
    When user enter username "standard_user" and password "secret_sauce"
    And user click on login button
    And user click on add to cart button
    And user click on cart button
    And user click on checkoutbutton
    And usr enter firstname "" and lastname "" and zipcode ""
    And click on continue button
    And click on finish button
    Then validate text 
