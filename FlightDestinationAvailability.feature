Feature: Ticket Booking Application

  Scenario Outline: User should be able to search for destination on the airline page BA
  Given A user is on the British Airways home page
  And The user enter the FROM destination with "<ABBREVIATION>" and "<FROM_DESTINATION>" in the search boxes
  And The user enter the TO destination "<ABBREVIATION1>" with "<TO_DESTINATION>" in the search boxes
  And The user select the leaving date "<MONTH1>" and "<DATE1>"
  And The user select the return date "<MONTH2>" and "<DATE2>"
  When The user click the submit button
 Then The user should be navigated to the British Airways page ERROR page
  And The user close the driver
  
  Examples:
  | MONTH1    | DATE1 | MONTH2      | DATE2 | ABBREVIATION1 | ABBREVIATION | FROM_DESTINATION                  | TO_DESTINATION                                             |
  | July 2023 |    22 | August 2023 |    10 | Nig           | LHR          | London, London Heathrow (LHR), UK | Lagos, Lagos Murtala Muhammed International (LOS), Nigeria |
  | July 2023 |    22 | August 2023 |    10 | ITA           | LHR          | London, London Heathrow (LHR), UK | Milan, Linate (LIN), Italy                                 |
  | July 2023 |    22 | August 2023 |    10 | ITA           | SPA          | Alicante, Alicante (ALC), Spain   | Milan, Linate (LIN), Italy                                 |
  
  Scenario Outline: 2 User should not be able to use the search button for destinations FROM, where abbreviation is INCORRECT
  Given A user is on the British Airways home page
  When The user enter an incorrect FROM destination with "<ABBREVIATION>"
  Then The user should be navigated to the British Airways page ERROR page
  And The user close the driver
  
  Examples:
  | ABBREVIATION |
  | Taj |
  | $%HTTP%& |
  | 2023 |
  | JS1234|
  |  |
  Scenario Outline: 3 User should not be able to use the search button for destinations TO, where abbreviation is INCORRECT
  Given A user is on the British Airways home page
  And The user enter an incorrect FROM destination with "<InValid_ABBREVIATION>" to destination with correct "<Valid_ABBREVIATION>" and "<To_DESTINATION>" in the search boxes
  When The user click the submit button
  Then The user should be navigated to the British Airways page ERROR page
  And The user close the driver
  
  Examples:
  | InValid_ABBREVIATION | Valid_ABBREVIATION | To_DESTINATION                    |
  | Taj                  | LHR                | London, London Heathrow (LHR), UK |
  | 123                  | SPA                | Alicante, Alicante (ALC), Spain |
 
 
  Scenario Outline: 4 User should not be able to use the search button for destinations FROM where abbreviation is CORRECT but INCORRECT destination
    Given A user is on the British Airways home page
    And The user enter a correct FROM destination with "<Valid_ABBREVIATION>" and "<FROM_DESTINATION>"  TO incorrect destination with "<InValid_ABBREVIATION>" in the search boxes
    When The user click the submit button
    Then The user should be navigated to the British Airways page ERROR page
     And The user close the driver
    Examples: 
      | InValid_ABBREVIATION | Valid_ABBREVIATION | FROM_DESTINATION                  |
      | Bishop               | LHR                | London, London Heathrow (LHR), UK |
      | $568&                  | SPA                | Alicante, Alicante (ALC), Spain |
  
  
  Scenario Outline: 5 User should not be able to use the search button when dates are not selected
    Given A user is on the British Airways home page
    And The user enter the FROM destination with "<ABBREVIATION>" and "<FROM_DESTINATION>" in the search boxes
    And The user enter the TO destination "<ABBREVIATION1>" with "<TO_DESTINATION>" in the search boxes
    When The user click the submit button
    Then The user should be navigated to the British Airways page ERROR page
     And The user close the driver

    Examples: 
      | ABBREVIATION1 | ABBREVIATION | FROM_DESTINATION                  | TO_DESTINATION                                             |                            |
      | Nig           | LHR          | London, London Heathrow (LHR), UK | Lagos, Lagos Murtala Muhammed International (LOS), Nigeria |                            |
      |            10 | ITA          | LHR                               | London, London Heathrow (LHR), UK                          | Milan, Linate (LIN), Italy |
      | ITA           | SPA          | Alicante, Alicante (ALC), Spain   | Milan, Linate (LIN), Italy                                 |                            |
