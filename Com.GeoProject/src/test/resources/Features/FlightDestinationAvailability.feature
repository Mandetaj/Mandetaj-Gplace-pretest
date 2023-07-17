Feature: Ticket Booking Application

  Scenario Outline: User should be able to search for destination on the airline page BA
    Given A user is on the British Airways home page
    And The user enter the FROM destination with "<ABBREVIATION>" and "<FROM_DESTINATION>" in the search boxes
    And The user enter the TO destination "<ABBREVIATION1>" with "<TO_DESTINATION>" in the search boxes
    And The user select the leaving date "<MONTH1>" and "<DATE1>"
    And The user select the return date "<MONTH2>" and "<DATE2>"
    When The user click the submit button
    # Then The user should be navigated to the British Airways page
    But The user is blocked with permission issue due to automated software been used

    Examples: 
      | MONTH1    | DATE1 | MONTH2      | DATE2 | ABBREVIATION1 | ABBREVIATION | FROM_DESTINATION                  | TO_DESTINATION                                             |
      | July 2023 |    22 | August 2023 |    10 | Nig           | LHR          | London, London Heathrow (LHR), UK | Lagos, Lagos Murtala Muhammed International (LOS), Nigeria |
      | July 2023 |    22 | August 2023 |    10 | ITA           | LHR          | London, London Heathrow (LHR), UK | Milan, Linate (LIN), Italy                                 |
      | July 2023 |    22 | August 2023 |    10 | ITA           | SPA         | Alicante, Alicante (ALC), Spain | Milan, Linate (LIN), Italy                                 |
