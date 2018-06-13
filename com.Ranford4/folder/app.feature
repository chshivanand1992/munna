Feature: Login
Scenario: validate the tittle of homepage
Given    launch site
When     check the tittle with "KEXKIM BANK" data
Then     Homepage  should be displayed
And      close site

Scenario: validate the username and password with multiple data
Given    launch site
When     enter the username and password and click on login
Then     branches button should be displayed
And     close site




