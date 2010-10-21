Feature: Project Overview for employees
  In order to protect revenue by sharing knowledge about our projects
  DAI employees will need to have an overview about running projects 
  and projects under development, to avoid reinventing the wheel.

  Scenario: Overview about project titles
    Given A project with title "this Project"
    When I list all Projects
    Then I should see "this Project"

  
