Feature: Classification by category buttons
  As a user  I want to choose a transaction from the list  
  So that I can classify by category

  Background: 
    Given I have the browser open
    When I navigate to the home page

	Scenario: I don't have transactions to classify
		Then I'm redirected to the fully classified transactions list page

  Scenario Outline: I classify one transaction and then I update it to other category
    And I see <category> image button
    Then I tap the <category> button to classify
    And I verify that the transaction was classified
    And I see <category> image button
    Then I tap the <category2> button to classify
    And I verify that the transaction was classified

    Examples: 
      | category       | category2      |
      | food           | transportation |
      | health         | entertainment  |
      | education      | household      |
      | household      | food           |
      | entertainment  | health         |
      | transportation | education      |

  Scenario Outline: I see an uncategorized transaction
    And I see <category> image button
    Then I tap the <category> button to classify
    #Then I click the buttton to go to the transaction classifed
    And I verify that the transaction was classified

    #não encontro a transação na lista
    Examples: 
      | category       |
      | food           |
      | health         |
      | education      |
      | household      |
      | entertainment  |
      | transportation |
