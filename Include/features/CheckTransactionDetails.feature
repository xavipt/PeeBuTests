Feature: Check transaction details 
	As a user  I want to choose a transaction from the list  
	So that I can see the details for that transaction
	
	Background: 
    Given I have the browser open
    When I navigate to the home page

  Scenario: The API Service is operational
    When I make a request to the API
    Then The status code of the response is 200

  Scenario Outline: I See a transaction details
    Then I see that the <typeDetails> details are shown

    Examples: 
      | typeDetails  |
      | 'Entidade'   |
      | 'Tipo'       |
      | 'Fonte'      |
      | 'Data'       |
      | 'Quantidade' |
      | 'Id'         |

				