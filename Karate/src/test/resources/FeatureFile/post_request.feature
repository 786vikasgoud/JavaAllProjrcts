Feature: Performing the POST request

  Scenario: Post request
    * def req_payload =
    """
    {
      "bookId": "1",
      "customerName": "Vikas Oud"
    }
    """
    Given header Authorization = 'Bearer'+BearerToken
    And header Content-Type = "application/json"
    And url baseurl
    And path 'orders'
    And request req_payload
    When method POST
    Then status 201
    And print response
    And def json_Response = response
    And match json_Response.created == true
    And match json_Response.orderId == '#present'
#  "bookId": "{{bookId}}",
#Feature: performing the post request
#  Scenario: post request
#    * def req_payload =
#  """
#    {
#      "bookId":"16",
#       "customerName": "Vikas oud"
#    }
#  """
#    Given header Authorization = 'Bearer 92349d4601f50aafc4ab15f6c802c2b029fb8d351630d080aac886ddfd948cff'
#    And header Content-Type = "application/json"
#    And url 'https://simple-books-api.glitch.me'
#    And path 'orders'
#    And request req_payload
#    When method POST
#    Then status 201
#    And print response

