Feature: Check transaction details when there is no data
	As a user  I want to choose a transaction from the list  
	but there is a problem with the API and the user can't see the transactions
	
	

  Scenario: There is a problem with the API Service
  	Given I have the browser open
    And The API is not operational
    When I navigate to the home page
    Then I see an message "No data available"

				