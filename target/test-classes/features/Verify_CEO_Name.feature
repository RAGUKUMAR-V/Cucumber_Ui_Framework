
Feature: This is used to get CEO name from OrangeHRM app
 
  Scenario Outline: To verify the HR Manager name
    Given user is logged in successfully and on home screen
    When user clicks the directory option from menu bar
    And  user selects the job title as "Account Assistant" from the dropdown
    And click then search button
    Then user should see CEO name as "<HR_Manager_Name>"

    Examples: 
      | HR_Manager_Name  |
      | 12345  |    
        
