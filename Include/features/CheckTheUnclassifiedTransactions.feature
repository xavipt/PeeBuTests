Feature: Check for unclassified transactions
  As a user I want to navigate to the PeeBuTests HomePage
  So that I can see all the unclassified transactions


  Scenario: Check for unclassified transactions
    Given I have the browser open
    When I navigate to the URL
    And I see a button that shows and aggregate all unclassified transactions
		Then I tap the show unclassified transactions button
    And I see that a list of unclassified transactions