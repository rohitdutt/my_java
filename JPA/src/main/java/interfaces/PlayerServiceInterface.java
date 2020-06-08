package interfaces;

import entity.Player;

public interface PlayerServiceInterface {
    public String getPlayerById(int jerseyNo);
    public String getListOfPlayers();
    Boolean setPlayer(String jsonObj);
}
