Feature: Login

  Scenario Outline: Valid user can sign in
    Given Go to the home page
    And User login with username "<username>" and password as "<password>"
    Then The user should login successfully and is on the inventory page
    Examples:
      |username       |password     |
      |standard_user  |secret_sauce |