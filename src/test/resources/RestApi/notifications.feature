Feature: Notifications

  Scenario: User can disable notifications
    When I set my notification settings
        | name                      | value | type  |
        | ACCOUNT_SUMMARY           | false | PUSH  |
        | FUNDING                   | false | PUSH  |
        | WITHDRAWAL                | false | PUSH  |
        | INCOMING_INTEREST_DAILY   | false | PUSH  |
        | INCOMING_INTEREST_WEEKLY  | false | PUSH  |
        | INCOMING_INTEREST_MONTHLY | false | PUSH  |
        | FUNDING                   | false | EMAIL |
        | WITHDRAWAL                | false | EMAIL |
        | ACCOUNT_SUMMARY           | false | EMAIL |
        | NEWS_LETTERS              | false | EMAIL |
    Then I check my notification settings
        | name                      | value | type  |
        | ACCOUNT_SUMMARY           | false | PUSH  |
        | FUNDING                   | false | PUSH  |
        | WITHDRAWAL                | false | PUSH  |
        | INCOMING_INTEREST_DAILY   | false | PUSH  |
        | INCOMING_INTEREST_WEEKLY  | false | PUSH  |
        | INCOMING_INTEREST_MONTHLY | false | PUSH  |
        | FUNDING                   | false | EMAIL |
        | WITHDRAWAL                | false | EMAIL |
        | ACCOUNT_SUMMARY           | false | EMAIL |
        | NEWS_LETTERS              | false | EMAIL |