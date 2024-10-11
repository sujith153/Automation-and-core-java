@regression
Feature: iFrametest

  @smoke2
  Scenario: 
    Given Lanch the iframe test URL
    When OPen the iFrame page by clicking on the next button
    Then Click on the "Study our free HTML Tutorial" button and very the title.
    Then Verify default header.