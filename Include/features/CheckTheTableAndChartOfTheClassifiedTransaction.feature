Feature: Check transaction details 
	As a user  I want to choose a transaction from the list  
	So that I can see the details for that transaction
	
	Background:
		Given I have the browser open
		When I navigate to the home page
		And I get redirected to a different page displaying a fully classified transactions list
	
		Scenario Outline: See the aggregation of the data
			Then I see that the <type> information are shown
			
			Examples:   
				| type |
				| chart |      
				| table |     