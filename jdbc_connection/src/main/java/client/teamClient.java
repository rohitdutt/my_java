package client;

import configuration.Configuration;
import connection.JDBCConnection;
import java.sql.*;
import serviceLayer.TeamService;

public class teamClient {
    public teamClient() {
    }

    public static void main(String[] args) {
        Configuration config  = new Configuration();
        JDBCConnection jdbcObj = new JDBCConnection(config.getLocalhostDriver(),config.getLocalhostURL(),config.getLocalhostUser(),config.getLocalhostPassword());
        Connection con = jdbcObj.getConnection();
        TeamService teamServiceObj = new TeamService(con);
        String teams = teamServiceObj.getListofTeams();
        System.out.println(teams);
        jdbcObj.stopConnection(con);
    }
}
