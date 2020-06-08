package serviceLayer;

import com.google.gson.Gson;
import connection.JDBCConnection;
import dataAccesLayer.playerDAO;
import dataAccesLayer.teamDAO;
import entity.player;
import entity.team;
import java.sql.Connection;
import java.util.List;

public class PlayerService {

    Connection con;

    public PlayerService(Connection con) {
        this.con = con;
    }

    public String getListofPlayers() {
        playerDAO playerDAOobj = new playerDAO(con);
        List<player> players = playerDAOobj.getListOfPlayers();
        Gson gsonObj = new Gson();
        String jsonString = gsonObj.toJson(players);
        return jsonString;
    }

    public String getPlayerById(int id){
        playerDAO playerDAOObj=new playerDAO(con);
        player p=playerDAOObj.getPlayerById(id);
        Gson gsonObj = new Gson();
        String jsonString = gsonObj.toJson(p);
        return jsonString;
    }


}
