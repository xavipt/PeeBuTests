Feature: Check All Transactions
  As a user I want to navigate to the PeeBuTests HomePage
  So that I can see all the Money Transactions

	Background:
		Given I have the browser open
		When I navigate to the home page

  Scenario Outline: I check if the data presented is the data that should be presented
    Then I Check if the <column> match their <content> of the list

    Examples: 
      | column     | content                         |
      | 'Entidade' | 'Gislason - Rau' |
      | 'Tipo'     | 'debit'                         |
      | 'Fonte'    | 'cash'                    |
      | Data       | '2019-09-16T131955227Z'         |
      | Quantidade | '433,10'                        |
      | 'Id'       |                               2 |
    
    Scenario: Check if all the (5) transactions are presented on the list
		Then I verify that there are 5 transactions on the page
		
		Scenario: Check the balance
		Then I verify that there are 100 of transactions in total
		