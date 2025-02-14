Feature: Testing registration Form with Different Scenarios

  Scenario Outline: Testing Multiple Inputs and Cases
    Given Load the Main Page
    When FirstName is Visible "<firstname>" in step
    Then Verify the Textbox and Enter the value "<firstnamevalue>" in step

    Examples: 
      | firstname  | firstnamevalue |
      | name1 		 |     5 					|
      | name2 		 |     7 					|
      