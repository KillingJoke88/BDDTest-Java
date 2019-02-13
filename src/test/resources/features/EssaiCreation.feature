Feature: Essai creation
  Creation d'un premier features par qTest Scenario

  Scenario: Creation d'un feature
    Given J ai cree mon projet sur JIRA
    When J ajoute un User Story
    Then J edite un fichier feature
    Then le fichier feature est ajoute sur GIT
    
