// self package
package game_chamber;

// required sql imports for mysql connectivity 
import java.sql.*;

// utility imports
import java.util.*;

// main class for this file
public class gc_login {
    PreparedStatement ps = null;
    Connection con = null;
    Statement stmt = null;

    public static void login(String user_name_lp, String pass_word_lp) {

        // variable declaration
        final String username_login = user_name_lp;
        final String password_login = pass_word_lp;
        String logged_name = null;
        String logged_level = null;
        String logged_level_points = null;
        int count = 0;

        // repeated ask
        while (count == 0) {

            // scanner object creation
            Scanner sc = new Scanner(System.in);

            // input from the user
            // System.out.println(username_login);
            // username_login = sc.nextLine();
            // System.out.println(password_login);
            // password_login = sc.nextLine();

            try {
                Connection con = gc_connection.getCon();
                PreparedStatement ps = con
                        .prepareStatement("SELECT * FROM PROFILE WHERE USERNAME = (?) AND PASSWORD = (?)");
                ps.setString(1, username_login);
                ps.setString(2, password_login);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    count = 1;
                    if (rs.getString("name").equals(" ")) {
                        System.out.println("Incorrect username password.");
                        break;
                    } else {

                        // global user variables
                        logged_name = rs.getString("name");
                        logged_level = rs.getString("level");
                        logged_level_points = rs.getString("level_points");

                        // global view
                        System.out.println("Your name : " + logged_name);
                        System.out.println("Your level : " + logged_level);
                        System.out.println("Your level points : " + logged_level_points);

                        // pass the values to the profile page

                        gc_profile.view(username_login, logged_name, logged_level, logged_level_points);
                        home_frame home_f = new home_frame();
                        home_f.top_panel_hp(logged_name);
                        home_f.middle_panel_hp();
                        home_f.bottom_panel_hp();
                        // gc_game.login(username_login);
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            sc.close();
        }
    }
}