Feature: Validating the search product
  @smoke
  Scenario: Validating the product by providing the valid product
    Given lanch the chrome browser
    When Login into the login page
    And Search for the product
    And click the product link
    Then new tab will open
    And validate the correct product is displayed or not