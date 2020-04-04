Feature: Check transaction details 
	As a user  I want to choose a transaction from the list  
	So that I can see the details for that transaction
	
	Background:
		Given I have the browser open
		When I navigate to the home page
	
		Scenario Outline: See a transaction details
			Then I see that the <typeDetails> details are shown
			
			Examples:   
				| typeDetails |
				| id |      
				| ammount |     
				| entity |     
				| type |    
				| source |      
				| createdAt |