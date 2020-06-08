package client;

import connection.HibernateSession;
import org.hibernate.Session;
import serviceLayer.PlayerService;

public class PlayerClient {
    public static void main(String[] args) {
        HibernateSession hibernateSession=new HibernateSession();
        Session session=hibernateSession.getSession();
        PlayerService playerServiceObj=new PlayerService(session);
        String jsonString=playerServiceObj.getListOfPlayers();
        System.out.println(jsonString);
    }
}
