Feature: Check transaction details
  As a user  I want to choose a transaction from the list  
  So that I can see the details for that transaction

  Background: 
    Given I have the browser open
    When I navigate to the home page
		And I get redirected to a different page displaying a fully classified transactions list

  Scenario: See the aggregation of the data on a chart
    
    Then I find the "chart" 
    And I see information on the chart
    
    
    Scenario: See the aggregation of the data on a table
    Then I find the "table"
    And I see information on the table

    Scenario Outline: In the case of 1 transaction of Health I See the top 5 despesas
    Then I find the "Top 5 despesas"
    And I see the <category> on the table
    
    Examples: 
      | category      |
      | 'cabeleireiro' |
      | 'entretenimento'  |
      | 'escola'      |
      | 'restauracao'       |
      | 'saude'   |
      
      Scenario Outline: In the case of 1 transaction of Health I See the bar on the chart
    Then I find the "Despesas por categoria"
    And I see the <category> on the chart
    
    Examples: 
      | category      |
      | 'cabeleireiro' |
      | 'entretenimento'  |
      | 'escola'      |
      | 'restauracao'       |
      | 'saude'   |
      | 'animais' |
      | 'mecanica'  |
      | 'outro'      |
      | 'roupas'       |
      | 'supermercado'   |