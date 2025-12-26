
package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Crud {

    public static void main(String[] args) throws SQLException {
        Connection connection = Connector.getConnection();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.err.println("\n0-Exit, 1-Insert,2-Update,3-Delete,4-Select");
            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 0:
                    return;

                case 1: {
                    System.err.println("Insert");
                    System.err.println("Enter Book Name");
                    String bookname = scanner.nextLine();
                    System.err.println("Enter Book Price");
                    int price = Integer.parseInt(scanner.nextLine());
                    PreparedStatement statement = connection.prepareStatement("insert into bookwa values(?,?)");
                    statement.setObject(1, bookname);
                    statement.setObject(2, price);
                    statement.execute();
                }
                break;

                case 2: {
                    System.err.println("Update");
                    System.err.println("Enter Book Name");
                    String bookname = scanner.nextLine();
                    System.err.println("Enter Book Price");
                    String price = scanner.nextLine();
                    PreparedStatement statement = connection.prepareStatement("update bookwa set price=? where bookname=?");
                    statement.setObject(2, bookname);
                    statement.setObject(1, price);
                    statement.execute();
                }
                break;

                case 3: {
                    System.err.println("Delete");
                    System.err.println("Enter Book Name");
                    String bookname = scanner.nextLine();
//                    System.err.println("Enter Book Price");
//                    int price= Integer.parseInt( scanner.nextLine());
                    PreparedStatement statement = connection.prepareStatement("delete from  bookwa  where bookname=?");
                    statement.setObject(1, bookname);
//                    statement.setObject(2,price);
                    statement.execute();
                }
                break;

                case 4: {
                    System.err.println("Select");
                    PreparedStatement statement = connection.prepareStatement("select * from bookwa");
                    ResultSet rs = statement.executeQuery();
                    System.err.printf("\n%s\t\t\t%s\n", "Book Name", "Price ");
                    while (rs.next()) {
                        String bookname = "" + rs.getObject("bookname");
                        String price = "" + rs.getObject("price");
                        System.err.printf("%s\t\t%s\n", bookname, price);
//                        rs.next();
                    }

                }
                break;
                default:
                    System.err.println("Invalid");
            }
        }
    }
}
