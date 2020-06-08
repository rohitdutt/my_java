package Interfaces;

import entity.Player;

import java.util.List;

public interface PlayerDAOInterface {
    public Player getPlayerById(int jerseyNo);
    public List<Player> getListOfPlayers();
    public Boolean setPlayerById(Player p);
}
