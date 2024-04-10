Feature:feature to test the search functionality
  Scenario: validating the search functionality
    Given launch the chrome browser
    And open the Amazon website
    When enter the login details
    Then search for the product
    And chech the search is sucessfull
