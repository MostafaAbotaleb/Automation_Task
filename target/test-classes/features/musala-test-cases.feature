Feature: Musala Software

  Scenario Outline: Verifying contact us Form error message
    Given open contact page
    And user fill the form as fllow
      | name    | Mostafa                |
      | email   | <email>                |
      | subject | This is a test subject |
      | message | This is a test message |
    When user click on send
    Then error message should be displayed
    Examples:
      | email     |
      | test@test |
      | test.com  |
      | test      |
      | @test.com |
      | .com      |

  Scenario: Verifying URLs of company and facebook pages and leadership section and Fb picture profile
    Given open company page
    Then the correct URL is loaded
    And the leadership section is visible
    When user open the facebook link
    Then the facebook URL is loaded
    And the Musala Soft profile picture appears on the new page


  Scenario Outline: Verify apply position form error messages
    Given open careers page
    And user click on check our open positions button
    Then the correct URL of join us page is loaded
    When user select "Anywhere" from location dropdown list
    And select "Java Developer" position
    Then the following sections are displayed
      | General description |
      | Requirements        |
      | Responsibilities    |
      | What we offer       |
    And the apply button is displayed
    And user click on apply button
    And user fill the position form as fllow
      | name    | <name>    |
      | email   | <email>   |
      | mobile  | <mobile>  |
      | message | <message> |
    And Upload "MyCv.pdf" CV
    When user click on send
    And user click on close button of the popup
    Then error messages "<errorMessage>" should be displayed
    Examples:
      | name  | email    | mobile     | message | errorMessage                           |
      |       | a@dd.com | 00333331   | aaaaa   | The field is required.                 |
      | aaa   |          | 00222222   | aa11    | The field is required.                 |
      | aa11  | a_b@cd.ca|            | aa@@    | The field is required.                 |
      | aa@2  | a1@a1.org| 0123456789 |         | The field is required.                 |
      | aa#3  | a@a      | 110222099  | 11111   | The e-mail address entered is invalid. |
      | aa aa | a@a.ca   | @@@        | @@@@@   | The telephone number is invalid.       |
      |a b c  | a@a.net  | aaaa       | as      | The telephone number is invalid.        |


  Scenario Outline: Verifying apply Form error message
    Given open careers page
    And user click on check our open positions button
    When user select "<available_cities>" from location dropdown list
    And print opened positions for "<available_cities>" city
    Examples:
      | available_cities |
      | Sofia            |
      | Skopje           |