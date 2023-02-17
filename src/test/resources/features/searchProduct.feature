Feature: search a product feature

  Background: User has to login
    Given User is logged in

  @smoke
  Scenario: verify that user is able to search product
    Given is able to navigates to the homepage
    Then the user enter the product name
    When the products results should be displayed

    Scenario: login
      Given user is on HomePage
      Then user navigates to login page
      And user enters "testuser" and "Test@123"

       Scenario Outline: Login
        Given user is on HomePage
        Then user navigates to login page
        And user enters "<username>" and "<password>"
        Then message displayed successfully logged in
        Examples:
        | username | password |
        | TestUser1 | Test@123 |
        | TestUser2 | Test@234 |

