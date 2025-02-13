Feature: Testing the Sample Form Using Cucumber
 Scenario Outline: Checking If Page Element Displayed
    Given Check Page Is Loaded.
    When User Enters the FirstName "<firstname>" and Email "<email>"
    Then User Should be Able to Enter the Values Successfully.
   Examples:
     | firstname | email |
     | Kishan | Kishan.Bheemajiyani@gmail.com |
