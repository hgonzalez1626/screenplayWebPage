Feature: Google Search
  As a user I want to search the word automation in the platform google

  Scenario Outline: Sucessfully search
    Given User visit the google web search
    When User trie to search the next information
      | word   |
      | <word> |
    Then User verifies is success for the search

    Examples:
      | word       |
      | Automation |

