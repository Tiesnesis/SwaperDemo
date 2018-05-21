Feature: Account entries

  Scenario: User have no account entries
    When I request account entries from 2018-05-01 date to 2018-05-21 date
    Then I have 0 account entries