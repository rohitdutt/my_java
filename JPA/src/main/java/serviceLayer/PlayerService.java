package serviceLayer;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import connection.JPAConnection;
import interfaces.PlayerServiceInterface;
import com.google.gson.Gson;
import dataAccessLayer.PlayerDAO;
import entity.Player;

import javax.persistence.EntityManager;
import java.util.List;

public class PlayerService implements PlayerServiceInterface {

    PlayerDAO playerDAO=null;

    public PlayerService(EntityManager em) {
        playerDAO=new PlayerDAO(em);
    }

    public String getPlayerById(int jerseyNo) {
        Player playerObj=playerDAO.getPlayerById(jerseyNo);
        Gson gsonObj=new Gson();
        String jsonString=gsonObj.toJson(playerObj);
        return jsonString;
    }

    public String getListOfPlayers() {
        List<Player> players=playerDAO.getListOfPlayers();
        Gson gsonObj=new Gson();
        String jsonString=gsonObj.toJson(players);
        return jsonString;
    }

    public Boolean setPlayer(String jsonString) {
        Gson gsonObj =new Gson();
        JsonParser parser = new JsonParser();
        JsonObject jsonObj = (JsonObject) parser.parse(jsonString);
        Player p=gsonObj.fromJson(jsonObj,Player.class);
        playerDAO.setPlayer(p);
        return true;
    }
}
