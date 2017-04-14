@Cash
Feature: Cash withdrawal

  Scenario: Successful withdrawal from an account in credit
    Given I have deposited $100.00 on my account
    And Ik heb ook nog $50.34 erbij gedaan
    When I request $20
    Then $20 should be dispensed.
    And My Account should have $130.34

  Scenario: Successful withdrawal from an account in credit
    Given I have deposited $100.00 on my account
    And Ik heb ook nog $0 erbij gedaan
    When I request $20
    Then $20 should be dispensed.
    And My Account should have $800

