@ui
Feature: Find Top 5 insider trading today
  Everybody wants to know the 5 insider trade of the day

    Scenario Outline: Get the first insider trade today
    Given I am on the OpenInsider page
    When I search for "<ticker>"
    Then the page title should contain "<ticker>"

    Examples:
      | ticker  |
      | BA    |
      | NVDA  |

