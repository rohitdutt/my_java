package serviceLayer;

import Interfaces.PlayerServiceInterface;
import com.google.gson.Gson;
import dataAccessLayer.PlayerDAO;
import entity.Player;
import org.hibernate.Session;

import java.util.List;

public class PlayerService implements PlayerServiceInterface {
    PlayerDAO playerDAO=null;

    public PlayerService(Session session) {
        this.playerDAO=new PlayerDAO(session);
    }

    public String getPlayerById(int jerseyNo) {
      return null;
    }

    public String getListOfPlayers() {
        List<Player> players=playerDAO.getListOfPlayers();
        Gson gsonObj=new Gson();
        String jsonString=gsonObj.toJson(players);
        return jsonString;
    }

    public Boolean setPlayerById(Player p) {
        return null;
    }
}
