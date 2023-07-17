Feature: The User should be ables to Use the LOG IN Link to Register or Log in


  Scenario: As a User i want to sign up to be a member of to be a member so as to be able to book my flight quickly
    Given A user is on the British Airways home page
    And I clicked on the LOG IN button 
   #Create example table for emails and password
    And I am directed to the Your Account or Sign Up page
    And I Clicked on the Sign up link
    When  I insert all the requuired details
   And I tick the agree to Terms and Condition button 
    Then I should be registred 

