Feature: Increase shared knowledge
  In order to aquire projects with a long term financing
  DAI-employees will need to exercise knowledge transfer to privide sustainable products.
  
  Scenario: A Project whould have a title
    Given a Project called "SharedKnowledge"
    When I list all existing projects
    Then I should see "SharedKnowledge"

  
  
