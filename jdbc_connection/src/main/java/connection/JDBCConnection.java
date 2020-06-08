package connection;
import java.sql.*;
import java.sql.DriverManager;

public class JDBCConnection {
    //This class will provide API for JDBC connectivity.
    String driver;
    String url;
    String user;
    String password;

    public JDBCConnection(String driver, String url, String user, String password) {
        this.driver = driver;
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection getConnection(){
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,user,password);
            return con;
        }catch(Exception e){
            System.out.println("Inside Exception");
            System.out.println(e);
            return null;
        }
    }

    public Boolean stopConnection(Connection con){
        try{
            con.close();
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
}
