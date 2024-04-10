Feature: performing the the query parameter operation
  Scenario: performing the get operation providing the Query parameters
    * def query = {type : "fiction"}
    Given url 'https://simple-books-api.glitch.me'
    And path 'books'
    And params query
    When method GET
    Then status 200
    And print response