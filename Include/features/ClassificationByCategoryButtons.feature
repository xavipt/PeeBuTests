Feature: Classification by category buttons
	As a user  I want to choose a transaction from the list  
	So that I can classify by category

	Background:
		Given I have the browser open
		When I navigate to the home page

		Scenario Outline: I see an uncategorized transaction
			And I see <category> image button
			Then I tap the <category> button to classify
			
	    Examples:   
				| category |
				| food |      
				| health |     
				| education |     
				| household |    
				| entertainment |      
				| transportation |