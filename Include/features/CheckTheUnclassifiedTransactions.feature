Feature: Check for unclassified transactions
  As a user I want to navigate to the PeeBuTests HomePage
  So that I can see all the unclassified transactions

  Background: 
    Given I have the browser open
    When I navigate to the home page

  Scenario: All transactions are classified
    Then I'm redirected to the fully classified transactions list page

  Scenario: Check for unclassified transactions
    And I see a button that shows and aggregate all unclassified transactions
    Then I tap the show unclassified transactions button
    And I see that a list of unclassified transactions
    
    Scenario: Check for unclassified transactions when I have none
    And I see a button that shows and aggregate all unclassified transactions
    Then I tap the show unclassified transactions button
    And I'm redirected to the fully classified transactions list page

  Scenario: There is no Data on the transactions
    When I have no data on the transactions
    Then I see an message "There is no data to show"
