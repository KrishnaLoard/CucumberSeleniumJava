Feature: Testing the Sample Form Using Cucumber

  Scenario: Checking If Page Elements Are Displayed
    Given Check Page Is Loaded
    When User Enters the FirstName "John" and Email "Bheemajiyani"
    Then Entered Value "Male" Successfully
    When User Checks Gender Checkbox and Selects the "Female" Gender
    Then User Enters the Mobile Number After Checking "9998277024"
