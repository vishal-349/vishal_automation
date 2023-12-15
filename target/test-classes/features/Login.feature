
Feature: Login functionality of swag lab
 

  @reg
  Scenario: valide login functionality
  
  When user enter username "standard_user" and password "secret_sauce"
  And user click on login button
  Then validate successfull login