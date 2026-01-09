Feature: Login functionality

  Scenario: Login with valid credentials
    Given the following user credentials:
      | username | password |
      | alice    | 12345    |
      | bob      | passw0rd |
    When the users try to login
    Then they should see their dashboard
   
   
   Scenario: Search with multiple keywords
    Given the following search keywords:
      | apple     |
      | banana    |
      | cucumber  |
      
        
