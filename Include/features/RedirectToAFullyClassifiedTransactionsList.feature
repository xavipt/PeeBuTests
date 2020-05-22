Feature: Redirect to a fully classified transactions list
	As a user I have no unclassified transactions
	So I get redirected to a different page that displays a fully classified transactions list
	
	Scenario: Given I have the browser open
		When I navigate to the home page
		And I have no unclassifed transactions
		Then I get redirected to a different page displaying a fully classified transactions list
