Feature: Buy tickets
  User can set departure, destination, dates, more... and finally buying tickets,

  Scenario: user should buy tickets
    Given User navigate to the app
    When User accepts cookies
    And User selects flights
    And User selects dates
    And User selects passengers
    #And User updates dates