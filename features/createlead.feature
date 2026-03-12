Feature:login functionality of facebook

Scenario:valid login

	Given browser launch 
	Given load URL
	When enter the username
	When enter the pswd
	When click submit 
	When click crms/sfa
	When click leads
	When click create lead
	When enter the firstname 
	When enter the lastname 
	When enter the companyname 
	When enter the profileTitle
	Then click the submit