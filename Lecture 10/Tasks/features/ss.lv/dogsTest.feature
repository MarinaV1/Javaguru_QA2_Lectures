@SsLv
@Dogs
Feature: Test ss.lv dogs page filtering and validates it

  Scenario: Open dog page and change price, age and region
    Given Open HomePage
    And Open Dog category
    And Validate that DogPage is open
    When Set min price to 1000 and max price 0
    And Set min age to 1 and max age 12
    And Change region to Riga
    Then Press search button


