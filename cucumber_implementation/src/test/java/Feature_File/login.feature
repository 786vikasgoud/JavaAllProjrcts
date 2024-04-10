Feature: feature to test login functionality
 Scenario: validating the login details with valid inputs
    Given Launching the chrome browser
    When Enter the "shivaiahgarivikasgoud@gmail.com" and "Vikas@786"
    And Click the login button
    Then Verify the loodo present in the pages



 Scenario Outline: validating the login details with in valid inputs
   Given Launching the chrome browser
   When Enter the amazon login <username> and <password>
   And Click the login button
   Then Verify the loodo present in the pages
   Examples:
     | username | password |
     | Vikas    | Vikas password|
     | Ram      |Haniuma password|