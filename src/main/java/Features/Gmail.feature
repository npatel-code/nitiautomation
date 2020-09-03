Feature: Gmail login

Scenario: User is able to login

Given open google page
Then click on Gmail button
When Enter userid
Then Enter password
Then click on login button
And close the webdriver
