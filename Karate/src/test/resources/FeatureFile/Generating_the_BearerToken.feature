Feature: Generating the BearerToken
  Scenario: performing the post operation to generating the bear token
    * def random_email =
    """
    function(s){
      var text ="";
      var str ="abcdefghijklmnopqrstuvwxyz";
      for(let i=0;i<s;i++){
          text +=str.charAt(Math.floor(Math.random()*str.length()));
      }
      return text;
    }
    """
    * def email = random_email(8)
    * def request_data = read('classpath:payloads/data.json')
    * set request_data.clientEmail = email+"@example.com"
    Given url baseurl
    And path '/api-clients/'
    And header Content-Type = "application/json"
    And header Authorization = 'Bearer'+BearerToken
    And request request_data
    When method POST
    Then status 201
    And print response
