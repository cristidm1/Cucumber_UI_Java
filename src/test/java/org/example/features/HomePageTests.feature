Feature: List Menu Items

  Background: User retrieve the Text from Menu Items
    Given User is on the Home Page
    When User retrieve the text for Menu Items

  @smoke
  Scenario: Retrieve the text for all Menu Items
    Given User is on the Home Page
    When User retrieve the text for Menu Items
    Then Text should be printed on the console

  @regression
  Scenario: Retrieve the text for all Menu Items
    Given User is on the Home Page
    When User retrieve the text for Menu Items
    Then Text should be printed on the console

  @usingBackground
  Scenario: Retrieve the text for all Menu Items
    Then Text should be printed on the console