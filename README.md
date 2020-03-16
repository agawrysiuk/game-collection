# game-collection

Your game repository. Technologies/libraries/frameworks used:

- Spring Boot
- PostgreSQL, H2 Datbase (for tests)
- Jackson
- Angular 9
- Bootstrap

It contains:

### Frontend angular application

- It downloads the basic list of games from [RAWG Video Games Database API].
- Displays the simplified view of games you are looking for.
- Tells backend to "Save" a game: to download a detailed game object from the RAWG API.
- Displays the games you saved in a tile view (check out screenshot above).
- Picks a random game for you to play.

[RAWG Video Games Database API]: https://rawg.io/apidocs

### Backend Spring Boot application

- Provides REST endpoints to communicate with the frontend.
- Contains a service to download a detailed game from the RAWG API.
- Defines a model for the Game object.
- Saves the games objects to the database.

