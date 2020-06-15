Feature: Redirect to a fully classified transactions list (dashboard)
	As a user I want to see the transactions classified
	So I get redirected to a different page that displays a fully classified transactions list
	
	Scenario: The user wants to go to the dashboard
		Given I have the browser open
		When I navigate to the home page
		And I classify a transaction
		And I click  on "Validar"
		Then I get redirected to a different page displaying a fully classified transactions list
