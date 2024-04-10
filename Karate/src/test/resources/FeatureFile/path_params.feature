Feature: Defining the path parameters
  Scenario: performing the get request by using the path params
    Given url 'https://simple-books-api.glitch.me'
    And path "books/6"
    When method GET
    Then status 200
    And print response
    And def json_Response = response
#    And print json_Response[json_Response.length-1].name
    And print json_Response.name
    And match json_Response.name == "Viscount Who Loved Me"