#Author: Andres Felipe Villalba Zapata
Feature: Get client by id

  @GetClient
  Scenario: User calls web service to get a client by it's id
    Given  That the user calls the service with the token "N0lg2-JiWZpb4s-3-zz7MB6pqxLvAcJ3u1Cj"
    When Make a request to find the customer with ID "1"
    Then The status code must be 200
    And Response should includes the following
      | First_Name | Nasir                |
      | Last_Name  | Cummerata            |
      | Gender     | male                 |
      | Email      | edward87@example.com |