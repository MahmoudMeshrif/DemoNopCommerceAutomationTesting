@smoke
  Feature:Shopping cart | User can click on Shopping cart successfully
    @smoke
      Scenario: User Click on shopping cart button when cart is empty
      When User click on shopping cart tab
      Then Message appears your shopping cart is empty



    @smoke
    Scenario: User can click on shopping cart button and success message appear
      When User click on shopping cart button
      Then User see success message for shopping cart
      And user see background color green for shopping cart

    @smoke
    Scenario: User can click on Shopping cart Tab on the top of the page
      When User click on shopping cart button
      And User click on shopping cart tab
      Then Verify Qty value is bigger than 0 for shopping cart
