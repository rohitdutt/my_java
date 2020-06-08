package dataAccessLayer;

import connection.JPAConnection;
import interfaces.*;
import entity.Player;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class PlayerDAO implements PlayerDAOInterface {
   EntityManager em=null;
    public PlayerDAO(EntityManager em) {
        this.em=em;
    }

    public Player getPlayerById(int jerseyNo) {
        Player p=em.find(Player.class,jerseyNo);
        return p;
    }

    public List<Player> getListOfPlayers() {
        Query q=em.createNativeQuery("SELECT * FROM player");
        List<Player> players=q.getResultList();
        return players;
    }

    public Boolean setPlayer(Player p) {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
