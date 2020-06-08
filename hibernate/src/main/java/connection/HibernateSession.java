package connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSession {

    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public Session getSession(){
        Session session= sessionFactory.openSession();
        return session;
    }

    public void closeSession(){

    }
}
