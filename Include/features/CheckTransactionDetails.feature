Feature: Check transaction details 
	As a user  I want to choose a transaction from the list  
	So that I can see the details for that transaction
	
	Background:
		Given I have the browser open
		When I navigate to the home page
		
		Scenario: I check if the data presented is the data that should be presented
		Then I Check if the columns match their content
		# entidade, ammount, todas sa colunas, fazer pelo menos 1 teste,comparar com o 1º campo da pai que é sempre igual
		
		Scenario: There is a problem with the API Service
		When I have no data on the transactions
		Then I see an message "There is no data to show"
	
		Scenario Outline: I See a transaction details
		Then I see that the <typeDetails> details are shown
			
			Examples:   
				| typeDetails |
				| id |      
				| ammount |     
				| entity |     
				| type |    
				| source |      
				| createdAt |
				
				