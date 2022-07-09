Feature: Authentication SauceLab Site
  As a user I want to login in the web SauceLab

  Scenario Outline: Successfully Authentication SauceLab
    Given User visit the SauceLab Web
    When User trie to login with the next information
      | user   | password   |
      | <user> | <password> |
    Then User verifies is success authentication was successful

    Examples:
      | user          | password     |
      | standard_user | secret_sauce |

