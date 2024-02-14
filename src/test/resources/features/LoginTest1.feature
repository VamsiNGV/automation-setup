Feature: LoginTest

  @LoginTest
  @Regression

   Scenario Outline:
    Given I am on the login page
    When I enter "<username>" and "<password>"
    And I click on login button
    Then I should see the home page
    Examples:
      | username | password |
        | tomsmith    | SuperSecretPassword!    |
