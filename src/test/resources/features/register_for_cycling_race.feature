Feature: Register for Cycling Race

  Scenario: Criterium Dick

    Given I have registered for Criterium Woerden as "Dick"
    When I request the startlist
    Then the name "Dick" should be on the list

  Scenario: Criterium Jens

    Given I have registered for Criterium Woerden as "Jens"
    When I get the startlist
    Then the name "Jens" should be on the list