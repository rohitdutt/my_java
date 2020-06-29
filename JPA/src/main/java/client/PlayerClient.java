package client;

import connection.JPAConnection;
import serviceLayer.PlayerService;

import javax.persistence.EntityManager;

public class PlayerClient {
    public static void main(String[] args) {
        JPAConnection connection=new JPAConnection();
        EntityManager em=connection.getConnection();
        PlayerService playerServiceObj=new PlayerService(em);
        String jsonString=playerServiceObj.getPlayerById(4);
//        System.out.println(jsonString);
//        System.out.println("--------------------------------------------");
        playerServiceObj.setPlayer(jsonString);
//        System.out.println("--------------------------------------------");
//        String jsonString=playerServiceObj.getListOfPlayers();
        System.out.println(jsonString);
        connection.closeConnection();
    }
}
