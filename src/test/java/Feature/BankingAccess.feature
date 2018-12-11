Feature:TestingBanking access

  Scenario: Opeing Barclays Banking Sites
    Given I am a Chrome user
    When I open Barclays website
    Then Barclays web page displays
    And Login button is displayed
    And Register button is displayed
    And Contact us button is displayed

  Scenario: Opeing Santander Banking Sites
    Given I am a Chrome user
    When I open Santander website
    Then Santander Home page displayed
    And San Login button is displayed



