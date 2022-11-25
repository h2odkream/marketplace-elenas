# language: en
Feature: Fill form with data user
    I as a user
    I want fill form
    To validate

Scenario Outline: Fill form
  When complete registration form
    |<name>| <lastName> | <email> | <cellphone> |
  Then he should validate that the form can be completed
  Examples:
    | name  | lastName | email                    | cellphone  |
    | Jaime | Duran    | jaimeduran0444@gmail.com | 3208560106 |
