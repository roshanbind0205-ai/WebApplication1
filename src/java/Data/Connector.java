
package Data;

import java.sql.Connection;
import java.sql.DriverManager;


public class Connector {
     public static Connection getConnection() {
        try {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "system";
            String password = "1234";
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (java.sql.SQLException e) {
            System.out.println(e);
            return null;
        }
    }

      
}