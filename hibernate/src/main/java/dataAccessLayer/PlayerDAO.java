package dataAccessLayer;

import Interfaces.*;
import entity.Player;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;


@Deprecated
public class PlayerDAO implements PlayerDAOInterface {
    Session session=null;

    public PlayerDAO(Session session) {
        this.session = session;
    }

    public Player getPlayerById(int jerseyNo) {
        return null;
    }

    public List<Player> getListOfPlayers() {
        session.beginTransaction();
        NativeQuery q =session.createNativeQuery("SELECT * FROM player");
        List<Player> players = q.getResultList();
        session.getTransaction().commit();
        session.close();
        return players;
    }

    public Boolean setPlayerById(Player p) {
        return null;
    }
}
