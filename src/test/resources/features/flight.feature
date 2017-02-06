Feature: Flight

  Scenario Outline: : Match the flight numbers
    Given the flight <flightno> is leaving today

    Examples:
    |flightno|
    | EZY4567 |
    | F038    |
    | CA01618 |


    Scenario Outline: Make a deposit
 Given  I have deposited <amount> on my account
      Examples:
      |amount|
      |12.25|
      |4|
      |5.2|
