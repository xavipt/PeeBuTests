Feature: Check Home Page
  As a user
	I want to navigate to the PeeBuTests URL
  So that I can see the landing page of the PeeBuTests
	

  Scenario: Check if the Home Page exists
  Given I have the browser open
  When I navigate to the URL
  Then I verify that the page exists