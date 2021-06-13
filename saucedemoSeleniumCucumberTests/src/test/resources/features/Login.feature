Feature: Login

#  Scenario: login with valid credentials
#    Given I am on the login page
#    When I fill in "Email" with "test@test.com"
#    And I fill in "Password" with "test123pass"
#    And I press "Login"
#    Then I should be on the users home page
#    And I should see "Login successful"

  Scenario Outline: Valid user can sign in
    Given Go to the home page
    And User login with username "<username>" and password as "<password>"
    Then The user should login successfully and is brought to the inventory page
    Examples:
      |username       |password     |
      |standard_user  |secret_sauce |