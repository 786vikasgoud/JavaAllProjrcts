Feature: Reading the daya from the json
  Scenario: perform reading the data
    * def user_req = read('classpath:payloads/data.json')
    * print user_req
    * print getRandomEmail
#    * print Ut
#  * def email = Ut.random_email(6)
#    * def user_req = read('classpath:/src/test/resources/payloads/data.json')
#    * def request_Body = read('classpath:src/test/resources/payloads/data.json')
