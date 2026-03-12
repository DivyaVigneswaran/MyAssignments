Feature: login  functionality of LeafTaps

Scenario: valid login
	Given launch the browser 
	Given load the URL
	When enter the Username
	When enter the Password 
	When click on the login button
	Then it will navigate to the CRM/SFA page	
	