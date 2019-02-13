Feature: Se connecter   

  Scenario: Se connecter avec un mail
    Given je suis sur la page de connexion
    When je saisi mon adresse mail
    Then je suis connecté
