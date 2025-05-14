
package bibliotheque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    
 private Connection con =null;
 private final String url ="jdbc:mysql://localhost:3306/Bibliothèque? ";
 private final String user = "root";
 private final String password = "";
    
 
  public DatabaseConfig() 
  {
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection to BD estableshed!");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public Connection getCon() {
        return con;
    }
}

