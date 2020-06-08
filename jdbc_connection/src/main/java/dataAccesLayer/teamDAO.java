package dataAccesLayer;

//import com.mysql.cj.protocol.Resultset;
import entity.team;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class teamDAO {
    Connection con=null;

    public teamDAO(Connection con) {
        this.con = con;
    }

    public team setTeam(ResultSet rs){
        try {
            team tm = new team();
            tm.setId(rs.getString("id"));
            tm.setTeamName(rs.getString("teamname"));
            tm.setState(rs.getString("state"));
            tm.setOwner(rs.getString("owner"));
            tm.setValuation(rs.getFloat("valuation"));
            return tm;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    public List<team> getListOfTeam(){
        try{
            List<team> teams=new ArrayList<team>();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM team");
            while(rs.next()) {
                teams.add(setTeam(rs));
            }
            return teams;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    public team getTeamById(String id) {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM team WHERE id='id'");
            return setTeam(rs);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}

