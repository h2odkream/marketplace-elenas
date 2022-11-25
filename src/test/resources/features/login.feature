# language: en
Feature: Enter the Elenas Marketplace
    I as a user
    I want to create a new user
    To login Marketplace

  Background:
    Given the "user" open the page "https://marketplace.elenas.co"

  Scenario: Login
    When the "user" login with "pruebaelenas01@gmail.com" and "Elenas01"
    Then he should see the successful login
