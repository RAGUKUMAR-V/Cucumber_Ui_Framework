Feature: This is used to check pending timesheet
 @Sanity @Regression
  Scenario Outline: To verify the HR Manager is having pending timsheet
    Given The user is logged in successfully and on home screen
    When user clicks the time option from menu bar
    And  user enter the name as "manda akhil user" and select from auto suggestive dropdown
    And click on view button
    Then user should see the message as "<Message>"

    Examples: 
      | Message  |
      | No Records Found |  