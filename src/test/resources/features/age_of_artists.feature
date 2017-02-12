Feature: Age of artists

  Scenario: Calculate the age of an artist based on their birthdate
    Given the artists with their birthdate
      | name         | birthDate |
      | Elvis        | 13-1-1935 |
      | John Lennon  | 2-4-1940  |
      | Jeff Porcaro | 3-5-1955  |

  Scenario: Navigate inmates in correct order
    Given the dossier
      | naam         | bsn   |
      | hoofddossier | 12345 |
      | medebewoner1 | 11    |
      | medebewoner2 | 12    |
      | medebewoner3 | 13    |
