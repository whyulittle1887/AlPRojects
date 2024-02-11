Feature: To test the get endpoints of the application
  To test different get end points with different data formats supported by the application

  Scenario: To get all the data from the application in JSON format
    Given url 'http://localhost:9897/normal/webapi/all'
    When method get
    Then status 200