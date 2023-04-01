/*
// self package
package game_chamber;

// required sql imports for mysql connectivity 
import java.sql.*;

// common game class
class game {
    game() {
        int achivements_completed = 0;
        int missions_completed = 0;
        int total_play_time = 0;
        int chamber_points = 0;
    }
}

// common class for subway surfers and candy crush
class subway_surfers_candy_crush extends game {
    static int best_score = 0;
    static int total_score = 0;
}

// bgmi class
class bgmi extends game {
    static int total_kills = 0;
    static int chicken_dinner = 0;
}

// coc class
class coc extends game {
    static int town_hall_level = 0;
    static int clan_level = 0;
}

// main class for this file
public class gc_game {

    // global variables
    static String profile_username;

    // create objects
    subway_surfers_candy_crush subway_obj = new subway_surfers_candy_crush();
    subway_surfers_candy_crush candy_obj = new subway_surfers_candy_crush();
    bgmi bgmi_obj = new bgmi();
    coc coc_obj = new coc();

    // take variables from the login file
    static void login(String username_login) {
        profile_username = username_login;
    }

    // retrive game info from the tables
    public static void game_info_retrive(PreparedStatement ps, Connection con, Statement stmt) {
        try {

            // retrive subway surfers game information
            ps = con.prepareStatement("SELECT * FROM SUBWAY_SURFERS WHERE USERNAME = (?)");
            ps.setString(1, profile_username);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                achivements_completed = rs.getInt("achivements");
                subway_obj.missions_completed = rs.getInt("missions_completed");
                subway_obj.total_play_time = rs.getInt("total_play_time");
                subway_obj.chamber_points = rs.getInt("chamber_points");
                subway_obj.best_score = rs.getInt("best_score");
                subway_obj.total_score = rs.getInt("total_score");

                System.out.println(subway_obj.achivements_completed);
                System.out.println(subway_obj.missions_completed);
                System.out.println(subway_obj.total_play_time);
                System.out.println(subway_obj.chamber_points);
                System.out.println(subway_obj.best_score);
                System.out.println(subway_obj.total_score);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
*/