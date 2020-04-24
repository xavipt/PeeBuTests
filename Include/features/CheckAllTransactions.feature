Feature: Check All Transactions
  As a user I want to navigate to the PeeBuTests HomePage
  So that I can see all the Money Transactions

	Background:
		Given I have the browser open
		When I navigate to the home page

 	 	Scenario: I verify that the first transaction is correct
    Then I verify that the first transaction matches
    
    Scenario: Check if all the (10) transactions are presented on the list
		Then I verify that there are 10 transactions on the page
		
		Scenario: Check the balance
		Then I verify that there are 10 pages of transactions
		
		Scenario: APi Service is down and the page gives feedback	 
		When API Web Service is not available
		Then I see an message "There is no data to show"