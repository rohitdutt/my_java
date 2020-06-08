package serviceLayer;

import com.google.gson.Gson;
import dataAccesLayer.teamDAO;
import entity.team;

import java.sql.Connection;
import java.util.List;

public class TeamService {
    Connection con;

    public TeamService(Connection con) {
        this.con = con;
    }

    public String getListofTeams() {
        teamDAO teamDAOobj = new teamDAO(con);
        List<team> teams = teamDAOobj.getListOfTeam();
        Gson gsonObj = new Gson();
        String jsonString = gsonObj.toJson(teams);
        return jsonString;
    }

    public String getTeamById(String id) {
        teamDAO teamDAOObj = new teamDAO(con);
        team t = teamDAOObj.getTeamById(id);
        Gson gsonObj = new Gson();
        String jsonString = gsonObj.toJson(t);
        return jsonString;
    }


}
