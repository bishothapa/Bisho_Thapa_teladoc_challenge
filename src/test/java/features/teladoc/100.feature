Feature: Add a user and validate the user has been added to the table

@Scenario1
Scenario: User should able to Add a user and validate the user has been added to the table 
Given   User has to add a user and validate 
When User click on the Add User Button   
Then the Add User button pops up 

@Scenario2
Scenario: User should able to Delete the user novak from the table and validate the user has been deleted.
Given  User should be able to Delete novak and validate 
When User Delete novak an validate    
Then the novak should be deleted and empty that place 