Feature: implementing simple book all operations

  Background:
    * url baseurl
    * def req_data = read('classpath:payloads/data.json')
    * def req_data2 = read('classpath:payloads/data2.json')
    * def token = { tok: "emp" }
  Scenario: implementing the get request
    Given path GetReq
    And header Content-Type = "application/json"
    When method GET
    Then status 200
    And def req_response = response
    And print req_response
    And match req_response.id == '#present'
    And match req_response.name == '#present'

  Scenario: Generating the bearer token
    * def email = getRandomEmail
    * print email
    * set req_data.clientEmail = email
    Given path Gen_token
    And header Content-Type = 'application/json'
    And request req_data
    When method POST
    Then status 201
    And def req_response = response
    And print req_response.accessToken
    * def Token = req_response.accessToken
    * print Token

#  Scenario: implementing the post request
    Given path Post_req
    And header Content-Type = "application/json"
    And print token
    And header Authorization = "Bearer "+Token
    And request req_data2
    When method POST
    Then status 201
    And def Res_data = response
    And print Res_data.orderId
    And print Post_req+"/"+Res_data.orderId
    
    Given path Post_req + "/" + Res_data.orderId
    And header Authorization = "Bearer " + Token
    When method GET
    Then status 200
    And print response

    * def json_data =
    """   {
      "customerName": "VikramKumar"
    }
    """
    * set req_data2.customerName = "Vikas"
    * print json_data.customerName
    Given path Post_req+"/"+Res_data.orderId
    And header Authorization = "Bearer " + Token
    And request req_data2
    When method PATCH
    Then status 204
    And print responseStatus

    Given path Post_req + "/" + Res_data.orderId
    And header Authorization = "Bearer " + Token
    When method GET
    Then status 200
    And print response
    And print response.customerName

    Given path Post_req + "/" + Res_data.orderId
    And header Authorization = "Bearer "+Token
    When method DELETE
    Then status 204
    And print responseStatus




