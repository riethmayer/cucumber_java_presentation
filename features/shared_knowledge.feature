Feature: Increase shared knowledge
  In order to aquire projects with a long term financing
  DAI-employees will need to exercise knowledge transfer 
  to provide quality products and sustainable products.
  
  Scenario: A project should have a title
    Given a Project called "SharedKnowledge"
    When I list all existing projects
    Then I should see "SharedKnowledge"

  Scenario: A feature is a set of scenarios
    
  Scenario: The definition of done
