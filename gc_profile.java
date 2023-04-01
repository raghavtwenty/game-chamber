// self package
package game_chamber;

// required sql imports for mysql connectivity 
import java.sql.*;

// main class for this file
public class gc_profile {

    // global declaration
    protected static String profile_username;
    protected static String profile_name;
    protected static String profile_level;
    protected static String profile_level_points;

    // profile view on the top
    static void view(String username_login, String logged_name, String logged_level, String logged_level_points) {

        profile_username = username_login;
        profile_name = logged_name;
        profile_level = logged_level;
        profile_level_points = logged_level_points;

        // current user variables
        System.out.println("Your name : " + profile_name);
        System.out.println("Your level : " + profile_level);
        System.out.println("Your level points : " + profile_level_points);

        // leaderboard variables
        String name;
        String level;
        String level_points;

        try {
            Connection con = gc_connection.getCon();
            PreparedStatement ps = con.prepareStatement(
                    "SELECT NAME,LEVEL,LEVEL_POINTS FROM PROFILE WHERE USERNAME NOT IN (?) ORDER BY LEVEL AND LEVEL_POINTS");
            ps.setString(1, profile_username);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                name = rs.getString("name");
                level = rs.getString("level");
                level_points = rs.getString("level_points");

                /*
                System.out.println(name);
                System.out.println(level);
                System.out.println(level_points);
                System.out.println("\n");
                */

            }

            ps = con.prepareStatement("select b.username, sum(b.chamber_points+cc.chamber_points+coc.chamber_points+ss.chamber_points) from bgmi b inner join candy_crush cc on b.username = cc.username inner join clash_of_clans coc on b.username = coc.username inner join subway_surfers ss on b.username = ss.username where ss.username =(?);");
            ps.setString(1, profile_username);
            ResultSet chamber_points_r = ps.executeQuery();

            while (chamber_points_r.next()){
                int cp;
                cp = chamber_points_r.getInt(1);
                System.out.println("TOTAL CHAMBER POINTS : "+ cp);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
