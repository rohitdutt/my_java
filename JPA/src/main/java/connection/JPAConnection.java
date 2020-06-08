package connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAConnection {
    public EntityManager getConnection(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("rmadb");
        EntityManager em=emf.createEntityManager();
        return em;
    }
    public void closeConnection(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("rmadb");
        EntityManager em=emf.createEntityManager();
        em.close();
        emf.close();
    }
}
