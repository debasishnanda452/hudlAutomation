Feature: HUDL app validation

  Background: Validate login functionality of HUDL is working fine with valid credentials
    Given Home Page of HUDL is opened
    When I enetred valid email and password
    And I clicked on login button
    Then HUDL home page should be displayed

  Scenario: Validate user is able to open the video in Video page
    Given User clicks on video link in home page
    When User clicks on 1st video available in the video page
    Then video should be played

  Scenario: Validate user is able search the required video
    Given User clicks on video link in home page
    When I search SportscodeXML in search your library box
    Then Correct video should be displayed
    	
  Scenario: Validate QA hire project is displayed in Highlights page
    Given User clicks on Highlights link in home page
    When Highlight page is displayed
    Then Timeline, Highlight, Team, Schedule links should be displayed

    