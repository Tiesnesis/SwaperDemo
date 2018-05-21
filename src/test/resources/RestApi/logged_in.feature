Feature: Logged In

  Scenario: User can login
    When I get my data
    Then my data status is REGISTERED
    And my data idDocumentsStatus is NO_DOCUMENTS