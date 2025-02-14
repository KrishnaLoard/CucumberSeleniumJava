Feature: Testing the Sample Form Using Cucumber

  Scenario: Checking If Page Elements Are Displayed
    Given Check Page Is Loaded
    When User Enters the FirstName "John" and Email "Kishan.bheemajiyani@gmail.com"
    Then User Should be Able to Enter the Values "Male" Successfully
    When User Checks Gender Checkbox and Selects the "Female" Gender
    Then User Enters the Mobile Number After Checking "9998277024"
    When Enter the Date of Birth "1991-11-24"
    Then Check The Date of Birth Is Correct "English".
    When Select "Sports" As Hobbies
    Then Select File As DropOff
    When Enter Address into the TextArea "100 Graydon Hall Drive"
    Then Select City and State OR Whatever.
