Feature: Password

  @ChangePassword
  Scenario: User can change password
    When I change my password
    Then I can log in with new password