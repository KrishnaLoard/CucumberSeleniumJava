@GoogleSampleCase
Feature: Checking Google Elements Sample

  Scenario: Sample Google Pages.
    Given User is on Google Home Page.
    When User is On Login Page.
    And Check Google Logo
    Then Assert Certain GooglePage Elements. Kill Driver.