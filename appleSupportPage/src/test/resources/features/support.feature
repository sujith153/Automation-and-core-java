@regression
Feature: Testing web elemnets in Apple web page

  Background: 
    Given Launch the browser and open the apple support appilication
	
  Scenario: 
    Then verify all menu headers
      | Store  |
      | Mac    |
      | iPad   |
      | iPhone |
      | Vision |
      | Watch  |
      
	@smoke1 
  Scenario: 
    Then verify apple support headers
      | iPad             |
      | Mac              |
      | Apple Vision Pro |
      | iPhone           |
      | Apple Watch      |
    Then verify apple support tabs
      | Forgot Apple ID password  |
      | Apple Repair              |
      | Billing and subscriptions |
      
	@smoke1 @sanity
  Scenario: 
    When user enters search criteria as "Screen broken" and select appropriate option
    Then verify the header is displayed based on the option selected
    Then get the estimation by selecting product as "iPhone 11" and model as "iPhone 11"
    Then fetch the estimation cost for both