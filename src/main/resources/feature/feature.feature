
Feature: Title of your feature

Scenario: create repo using post option by POM
Given hit API using pom
Then verify the reponse
Then assert the response

Scenario: get the repo details 
Given hit api using target URI
Then verify new repor creation
Then verify the name

Scenario: delete the repo using delete
Given create the uri with path parameter
Then use authentication
Then hit api with delete
Then verify the response
