Feature: search
  Scenario: do search
    Given I am on the home page
    When I do search a product " "
    Then I see the respective product List and select random product
    Then add the trolley

