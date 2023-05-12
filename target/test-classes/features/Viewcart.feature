#Author: Gomolemo Molotsane
@viewcart

Feature: Add prod on acart

  Scenario: add to cart
      When click search 
      And  enter prodname
      And  click searchAgain
      And  add to cart
      Then view cart
      
      