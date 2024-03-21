Feature: HomePage

Scenario Outline: Testing login

Given I am on homepage of SDM
When I enter username <username> and password <password>
Then I should be loggedIn sucessfully and landed on listing page


Examples:
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|
|locked_out_user|secret_sauce|


