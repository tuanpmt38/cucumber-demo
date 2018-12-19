Feature: test login
  @tag1
  Scenario: the user should be able to login with correct username and correct password
    Given user is on the login page
    When user enters correct username and correct password
    Then user gets confirmation
#
  @tag2
  Scenario Outline: the user should be able to login
    Given user is on the login page
    When user enters "<username>" and "<password>"
    Then user gets confirmation

    Examples:
      | username | password |
      | tim@testemail.com |trpass |
      | rw@testemail.com | rwpass |
      | kq@testemail.com | kqpass |