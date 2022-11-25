# language: en
Feature: Enter the Elenas Marketplace
    I as a user
    I want to create a new user
    To login Marketplace

  Background:
    Given the "user" open the page "https://marketplace.elenas.co"

Scenario Outline: Create user
  When creating a new user
    | <email> | <cellphone> | <password> |
  Then he should validate that it has been successfully created.
  Examples:
    | email                    | cellphone  | password |
    | pruebaelenas52@gmail.com | 3105676752 | Elenas01 |




