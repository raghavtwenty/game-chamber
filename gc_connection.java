package game_chamber;

import java.sql.*;

public class gc_connection {
    public static Connection getCon() {
        int connection_validation = 0;
        switch (connection_validation) {
            case 0:
                try {

                    // call the java-mysql installed called from the class path
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    // new object creation for connection
                    // (db name, username, password)
                    Connection con = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/social_network", "social_network", "12345678");

                    return con;

                } catch (Exception e) {
                    // print error message, incase of error
                    System.out.println(e);
                    return null;
                }

            default:
                System.out.println("\nCheck DB Connection.");
                return null;
        }
    }
}
