# language: en
Feature: Login with unknown user
  I as a user
  want to try to create an account with non-existing datons
  to validate that it does data validations.

Scenario: Login failed
  When enter data "3208560106" and "123456"
  Then he should validate that the user is unknown
