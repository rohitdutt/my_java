package Interfaces;

import entity.Player;

public interface PlayerServiceInterface {
    public String getPlayerById(int jerseyNo);
    public String getListOfPlayers();
    public Boolean setPlayerById(Player p);
}
