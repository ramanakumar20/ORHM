Feature: Login to OrangeHRM application
Scenario: Login test
Given Open the chrome browser and navigate to OrangeHRM application
When User enters vald "<Login Name>" and "<Password>" click on submit
Then User should able to successfully login to the OrangeHRM application
Then close the browser


				 | Login Name | Password | 
         | admin      | admin    |
      



  