Feature: Styched Fashion website operations

  Scenario: Verify user successfully login with valid credentials and logout
    Given user open the website
    Then verify user is on home page
    When user click on login button
    Then verify user is on login page
    When user enter valid email "login.username" and password "login.password"
    And click on login button
    Then verify user is on userHome page
    When user click on logout button
    Then verify user is on home page

  Scenario: Verify product is successfully added into cart
    Given user open the website
    Then verify user is on home page
    When user click on login button
    Then verify user is on login page
    When user enter valid email "login.username" and password "login.password"
    And click on login button
    Then verify user is on userHome page
    When user click on TShirt item
    Then verify user is on TShirt items page
    When user click on first TShirt item
    And click on add to cart button
    Then verify TShirt item is added into cart successfully


  Scenario: Verify product is successfully added into cart, remove from cart
    Given user open the website
    Then verify user is on home page
    When user click on login button
    Then verify user is on login page
    When user enter valid email "login.username" and password "login.password"
    And click on login button
    Then verify user is on userHome page
    When user click on TShirt item
    Then verify user is on TShirt items page
    When user click on first TShirt item
    And click on add to cart button
    Then verify TShirt item is added into cart successfully
    When user click on remove item
    Then verify product is removed from cart
