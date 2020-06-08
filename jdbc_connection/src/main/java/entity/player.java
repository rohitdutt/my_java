package entity;

public class player {
    int playerId;
    String playerName;
    String type;
    String teamId;
    float salary;
    int playerRating;

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getPlayerRating() {
        return playerRating;
    }

    public void setPlayerRating(int playerRating) {
        this.playerRating = playerRating;
    }

    @Override
    public String toString() {
        return "player{" +
                "playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                ", type='" + type + '\'' +
                ", teamId='" + teamId + '\'' +
                ", salary=" + salary +
                ", playerRating=" + playerRating +
                '}';
    }

}
