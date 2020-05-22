Feature: Check transaction details 
	As a user  I want to choose a transaction from the list  
	So that I can see the details for that transaction
	
 Background: 
    Given I have the browser open
    When I navigate to the home page
    And The API is operational

  Scenario Outline: I check if the data presented is the data that should be presented
    Then I Check if the <column> match their <content>

    Examples: 
      | column     | content                         |
      | 'Entidade' | 'Wintheiser, Kuhn and Turcotte' |
      | 'Tipo'     | 'debit'                         |
      | 'Fonte'    | 'bank account'                    |
      | Data       | '2019-06-16T210914933Z'         |
      | Quantidade | '269,10'                        |
      | 'Id'       |                               1 |


  Scenario Outline: I See a transaction details
    Then I see that the <typeDetails> details are shown

    Examples: 
      | typeDetails  |
      | 'Entidade'   |
      | 'Tipo'       |
      | 'Fonte'      |
      | 'Data'       |
      | 'Quantidade' |

				