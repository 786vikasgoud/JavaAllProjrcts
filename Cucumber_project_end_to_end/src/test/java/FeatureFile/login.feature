Feature: Validating the login page
  Background:
    Given Lanching the chrome browser
    And Open the amazon website
  @smoke
  Scenario: validating the login page details by providing the valid data
    When enter the login details <"shivaiahgarivikasgoud@gmail.com"> <"Vikas786@">
    And click the sign in button
    Then validate the title page
  Scenario: validating the login page details by providing the invalid data
    When enter the login details <"shivaiahgarivikasgoud@gmail.com"> <"Vikas786">
    And click the sign in button
    Then validate the error message

