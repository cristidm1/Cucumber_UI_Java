Feature: Company size - dropdown list

  Background: User goes to Complete Form page
    Given User it's on the Complete Form page
    When User it's selecting the Company size

  @smoke
  Scenario: User should be able to select Company size value from dropdown using String
    Given Should be able to select company size "level3" from Dropdown list using String

  @regression
  Scenario: User should be able to select company size value from dropdown using DataTable without header
    Given Should be able to select company size from Dropdown list using DataTable without header
      | level3 |

  @regression
  Scenario: User should be able to select company size value from dropdown using DataTable with header and single row
    Given Should be able to select company size from Dropdown list using DataTable with header and single row
      | company size | company Name |
      | level3       | Mezdrea SRL  |

  @regression
  Scenario: User should be able to select company size value from dropdown using DataTable with header and rows
    Given Should be able to select company size from Dropdown list using DataTable with header and multiple rows
      | company size | company Name |
      | level3       | Mezdrea SRL  |
      | level4       | Cristi CO    |
   