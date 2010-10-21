Feature: Project Overview
  In order to to protect revenue by sharing knowledge about projects
  DAI employees will need have an overview about running projects and projects under development, to avoid reinventing the wheel.

  Scenario: Overview about project titles
    Given A project with title "This Project"
    When I list all Projects
    Then I should see "This Project"
  
  Scenario: Overview about project descriptions
    Given A project with title "With description"
    And this project has the description "Very informative"
    When I list all Projects
    Then I should see "Very informative"
