Feature: Check All Transactions
  As a user I want to navigate to the PeeBuTests HomePage
  So that I can see all the Money Transactions

	Background:
		Given I have the browser open
		When I navigate to the home page

  Scenario Outline: I check if the data presented is the data that should be presented
    Then I Check if the <column> match their <content>

    Examples: 
      | column     | content                         |
      | 'Entidade' | 'Wintheiser, Kuhn and Turcotte' |
      | 'Tipo'     | 'debit'                         |
      | 'Fonte'    | 'debit card'                    |
      | Data       | '2019-06-16T210914933Z'         |
      | Quantidade | '269,10'                        |
      | 'Id'       |                               1 |
    
    Scenario: Check if all the (10) transactions are presented on the list
		Then I verify that there are 10 transactions on the page
		
		Scenario: Check the balance
		Then I verify that there are 10 pages of transactions
		
		Scenario: APi Service is down and the page gives feedback	 
		When API Web Service is not available
		Then I see an message "There is no data to show"