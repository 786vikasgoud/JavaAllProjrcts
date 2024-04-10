Feature: print the hello world feature
  Scenario: hello world scenario
    * print 'hello world'
    * def total_price = '22'
    * print total_price
    * def json_object =
    """
      [
        {"name":"Vikas",
        "age":22,
        "gender":"male"},
        {"name":"Krishna",
        "age":24,
        "gender":"male"}
      ]
    """
    * print json_object
    * print json_object[0].name