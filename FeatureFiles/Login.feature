Feature: User Login

  Scenario: Successful Login
    Given the user is on the nopCommerce login page
    When the user enters valid credentials (username: "test@gmail.com", password: "test@123")
    And the user clicks on the Login button
    Then the user should be redirected to the My Account page
    And the user should see a welcome message
