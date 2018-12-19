Feature: Create account
  Scenario Outline: create new account by email
    Given user is on the page create account
    When user enters "<name>" and "<email>" and "<phone>" and "<password>" and "<verifyPassword>"
    When user select checkbox gender
    When user select country
    When user select checkbox subscriptions
    When user click submit
    Then gets confirmation
    Examples:
    | name | email | phone | password | verifyPassword |
    | cong nghiem | nghiem@gmail.com | 0987776666 | 12345687 | 12345687 |
