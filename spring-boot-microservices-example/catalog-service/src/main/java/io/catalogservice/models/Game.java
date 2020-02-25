package io.catalogservice.models;

public class Game {
    private String gameId;
    private String name;
    private String description;

    public Game() {

    }

    public Game(String gameId, String name, String description) {
        this.gameId = gameId;
        this.name = name;
        this.description = description;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
