Feature: Nev bar for the webpage
  By clicking of different menu items we can navigate between pages

  Scenario: By Clicking Hem we should stay on home
    Given I am on main page
    When I click on Hem
    Then I should be at home page

  Scenario: By Clicking Menu item Hem from other page we should comeback to home
    Given I am on main page
    When I am on other page
    And I click on Hem
    Then I should be at home page


  Scenario: By clicking on Tjanster we go to news page
    Given I am on main page
    When I click on Tjanster button
    Then I should be at services page



  Scenario: By Clicking on Utbildningar we go to contact page
    Given I am on main page
    When I click on Utbildningar button
    Then I should be at Utbildningar page

  Scenario: By Clicking on Blogg we go to blog page
    Given I am on main page
    When I click on Blogg
    Then I should be at blogg page