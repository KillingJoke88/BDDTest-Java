Feature: Creation d un compte utilisateur 
This feature verifies the functionality on Sign Up form

Scenario Outline: Creation valide
        Given Je n ai pas de compte
        When Je suis sur l ecran de creation de compte
        Then Je clique sur la saisie du email
        And Je saisi mon email <email>
        Then Je clique sur la saisie du mot de passe
        And Je saisi mon mot de passe <mot_de_passe>
        Then Je clique sur la saisie validation du mot de passe
        And Je saisi mon mot de passe <mot_de_passe>
        Then Je clique sur le bouton de validation
        
        Examples: sample data
          | email         | mot_de_passe             |
          | "abv@yahoo.fr" | "123456"                |
          | "test@gmail.com" | "somePassWithVeryLongValue" |

Scenario Outline: Format de mail invalide
    	Given Je n ai pas de compte
        When Je suis sur l ecran de creation de compte
        Then Je clique sur la saisie du email
        And Je saisi mon email <email>
        Then Je clique sur la saisie du mot de passe
        And Je saisi mon mot de passe <mot_de_passe>
        Then Je clique sur la saisie validation du mot de passe
        And Je saisi mon mot de passe <mot_de_passe>
        Then Je clique sur le bouton de validation
        
        Examples: sample data
              | email             | mot_de_passe              |
          #nom de domaine trop petit
              | "abv@yahoo.f"       | "123456"                    | 
          #caractère interdit
              | "ab*v@yahoo.fr"     | "123456"                    |
          #commence par moins deux caractères avant l'extention du mail
              | "t@gmail.com"       | "somePassWithVeryLongValue" |
          #un caractère non ASCII présent
              | "µetatest@gmail.com" | "somePassWithVeryLongValue" |


Scenario Outline: Format de mot de passe invalide
        Given Je n ai pas de compte
        When Je suis sur l ecran de creation de compte
        Then Je clique sur la saisie du email
        And Je saisi mon email <email>
        Then Je clique sur la saisie du mot de passe
        And Je saisi mon mot de passe <mot_de_passe>
        Then Je clique sur la saisie validation du mot de passe
        And Je saisi mon mot de passe <mot_de_passe>
        Then Je clique sur le bouton de validation
        
        Examples:
              | email             | mot_de_passe              |
          #mot de passe trop petit, 8 caractères minimum
              | "abv@yahoo.f"       | "M0tDe"                    | 
          #mot de passe ne contenant pas une lettre majuscule
              | "abv@yahoo.fr"     | "m0tdep@sse"                    |
          #mot de passe ne contenant pas une lettre minuscule
              | "abv@yahoo.fr"     | "M0TDEP@SSE"                    |
          #mot de passe ne contenant pas un chiffre
              | "abv@yahoo.fr"     | "MotDeP@sse"                    |
          #mot de passe ne contenant pas un caractère spécial
              | "abv@yahoo.fr"     | "M0tDePasse"                    |
