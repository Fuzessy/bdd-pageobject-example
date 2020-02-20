Feature: multiply two number
  Scenario: multiply two positive numbers
    Given open calculator
    When multiply 2 and 3
    Then the result is 6

#  Scenario: multiply two negative numbers
#    Given open calculator
#    When multiply -2 and -3
#    Then the result is 6
#
#  Scenario: multiply one positive and one negative number
#    Given open calculator
#    When multiply -2 and 3
#    Then the result is -6
#
#  Scenario: multiply with zero
#    Given open calculator
#    When multiply 0 and 3
#    Then the result is 0