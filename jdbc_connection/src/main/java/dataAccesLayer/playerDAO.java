package dataAccesLayer;

import entity.player;
import entity.team;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class playerDAO {
    Connection con=null;

    public playerDAO(Connection con) {
        this.con = con;
    }

    public player setPlayer(ResultSet rs){
        try {
            player pl = new player();
            pl.setPlayerId(rs.getInt("playerid"));
            pl.setPlayerName(rs.getString("playername"));
            pl.setType(rs.getString("type"));
            pl.setTeamId(rs.getString("teamid"));
            pl.setSalary(rs.getFloat("salary"));
            pl.setPlayerRating(rs.getInt("playerrating"));
            return pl;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    public List<player> getListOfPlayers(){
        try{
            List<player> players=new ArrayList<player>();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM player");
            while(rs.next()) {
                players.add(setPlayer(rs));
            }
            return players;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    public player getPlayerById(int id) {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM player WHERE playerid="+id);
            return setPlayer(rs);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
