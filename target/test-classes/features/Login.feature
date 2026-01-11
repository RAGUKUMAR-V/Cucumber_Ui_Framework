Feature: Login Test Scenarios

   Scenario Outline: To verify Login With Valid and Invalid credentials
   
   Given When user is on login page
   When Enter "<Username>" and "<Password>"
   Then Verify user is logged in Successfully
   
   Examples:
   |Username|Password|
   |Admin|admin123|
   |Admin|admin1234|
   |Admin1|admin123|
   |Admin12|admin1234|
   
   