package client;

import configuration.Configuration;
import connection.JDBCConnection;
import java.sql.Connection;
import serviceLayer.PlayerService;

public class playerClient {
    public playerClient() {
    }

    public static void main(String[] args) {
        Configuration config=new Configuration();
        JDBCConnection jdbcObj = new JDBCConnection(config.getLocalhostDriver(),config.getLocalhostURL(), config.getLocalhostUser(), config.getLocalhostPassword());
        Connection con = jdbcObj.getConnection();
        PlayerService playerServiceObj = new PlayerService(con);
        String players= playerServiceObj.getListofPlayers();
        System.out.println(players);
        String p= playerServiceObj.getPlayerById(101);
        System.out.println(p);
        jdbcObj.stopConnection(con);
    }
}
