package Data;

import Data.Connector;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcUseOracle {

    public static void main(String[] args) {
        try {

            java.sql.Connection connection = Connector.getConnection();
            System.out.println(connection);

//            PreparedStatement statement = connection.prepareStatement("insert into book values(?,?,?)");
//            statement.setObject(1, 3);
//            statement.setObject(2, "Anguler");
//            statement.setObject(3, 5000);
//            statement.execute();


    
           PreparedStatement statement = connection.prepareStatement("delete from book where price=?");
           statement.setObject(1, 300);
           statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(JdbcUseOracle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
