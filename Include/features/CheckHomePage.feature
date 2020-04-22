Feature: Check Home Page
  As a user
	I want to navigate to the PeeBuTests URL
  So that I can see the landing page of the PeeBuTests
	
	Background:
		Given I have the browser open
		When I navigate to the home page

  	Scenario: Check if the Home Page exists
  	Then I verify that the page exists
  	And I verify that the page has "Home"

  	#Scenario Outline: the API Web Service is not available
  	#Then I verify that the API is not up