Feature: Check transaction details
  As a user  I want to choose a transaction from the list  
  So that I can see the details for that transaction

  Background: 
    Given I have the browser open
    When I navigate to the home page

  Scenario: There is no Data on the transactions
    When I have no data on the transactions
    Then I see an message "There is no data to show"

  Scenario: See the aggregation of the data on a chart
    And I get redirected to a different page displaying a fully classified transactions list
    Then I find the chart 
    And I see information on the chart
    
    
    Scenario: See the aggregation of the data on a table
    And I get redirected to a different page displaying a fully classified transactions list
    Then I find the table
    And I see information on the table
