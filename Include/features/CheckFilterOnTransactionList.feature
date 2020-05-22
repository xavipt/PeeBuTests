Feature: Check filter on transaction list
  As a user  I want to the filter on wich the list will be organize  
  So that I can see the transactions grouped by that filter

  Background: 
    Given I have the browser open
    When I navigate to the home page

  Scenario: There is no Data on the transactions
    When I have no data on the transactions
    Then I see an message "There is no data to show"

  Scenario Outline: I want to apply a filter
    When I see an combo box to filter
    Then I tap the combo box
    And I choose <typeDetails> the filter
    Then I verify the result

    Examples: 
      | typeDetails    |
      | ammount        |
      | entity         |
      | type           |
      | source         |
      | classification |
      | createdAt      |
