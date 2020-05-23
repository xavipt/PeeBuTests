Feature: Classification by category buttons
  As a user  I want to choose a transaction from the list  
  So that I can classify by category

  Background: 
    Given I have the browser open
    When I navigate to the home page

  Scenario Outline: I classify one transaction and then I update it to other category
    And I see <category> image button
    Then I tap the <category> button to classify
    And I verify that the transaction was classified
    And I see <category2> image button
    Then I tap the <category2> button to classify
    And I verify that the transaction was classified

    Examples: 
      | category      | category2   |
      | 'hairdresser' | 'restaurant'  |
      | 'restaurant'  | 'health'      |
      | 'health'      | 'games'       |
      | 'games'       | 'education'   |
      | 'education'   | 'home'        |
      | 'home'        | 'pets'        |
      | 'pets'        | 'car'         |
      | 'car'         | 'supermarket' |
      | 'supermarket' | 'clothes'     |
      | 'clothes'     | 'others'      |
      | 'others'      | 'hairdresser' |

  Scenario Outline: I see an uncategorized transaction
    And I see <category> image button
    Then I tap the <category> button to classify
    #Then I click the buttton to go to the transaction classifed
    And I verify that the transaction was classified

    Examples: 
      | category      |
      | 'hairdresser' |
      | 'restaurant'  |
      | 'health'      |
      | 'games'       |
      | 'education'   |
      | 'home'        |
      | 'pets'        |
      | 'car'         |
      | 'supermarket' |
      | 'clothes'     |
      | 'others'      |
