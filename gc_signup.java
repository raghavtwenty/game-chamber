// self package
package game_chamber;

// required sql imports for mysql connectivity 
import java.sql.*;

// utility imports
import java.util.*;

import java.io.*;

// class for profile creation 
class create_account_profile {

    // variable initialization
    String username;
    String name;
    String mail_id;
    String password;
    String password_2;
    String profile_pic;
    int level;
    int level_points;

    // constructor for default initialization
    public create_account_profile(String input_username, String input_name, String input_mail_id, String input_password,
            String input_password_2, String input_profile_pic) {

        username = input_username;
        name = input_name;
        mail_id = input_mail_id;
        password = input_password;
        password_2 = input_password_2;
        profile_pic = input_profile_pic;
        final int level = 0;
        final int level_points = 0;
    }
}

// main class for this file
public class gc_signup {

    PreparedStatement ps = null;
    Connection con = null;
    Statement stmt = null;

    // new user input and insertion into table
    public static void new_account_creation(String gui_signup_username, String gui_signup_name, 
    String gui_signup_mail_id,  String gui_signup_password, String gui_signup_password_2, 
    String gui_signup_profile_pic) {

        // variable initialization
        FileInputStream fs = null;
        String input_username = gui_signup_username;
        String input_name = gui_signup_name;
        String input_mail_id = gui_signup_mail_id ;
        String input_password = gui_signup_password;
        String input_password_2 = gui_signup_password_2;
        String input_profile_pic = gui_signup_profile_pic;

        // scanner object creation
        Scanner sc = new Scanner(System.in);

        // input from the user
        //System.out.println("Enter your Username : ");
        //input_username = sc.nextLine();

        // check if the username already exists
        try {
                Connection con = gc_connection.getCon();
                PreparedStatement ps = con.prepareStatement("SELECT USERNAME FROM PROFILE WHERE USERNAME IN (?)");
                int count = 0;
                ps.setString(1, input_username);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    count = count + 1; // if count increases to 1, then there exists a same username
            }

            if (count == 1) { // count to 1 then stop
                System.out.println("Username already exists, try with some other username.");
            } else {
                //System.out.println("Enter your name : ");
                //input_name = sc.nextLine();
                //System.out.println("Enter your mail id :");
                //input_mail_id = sc.nextLine();

                // check if the mail id contains @
                if (input_mail_id.contains("@") == true) {

                    // first time ask for password
                    //System.out.println("Enter your password :");
                    //input_password = sc.nextLine();
                    //System.out.println("Re-Enter your password :");
                    //input_password_2 = sc.nextLine();

                    // check both password fields
                    while (!input_password.equals(input_password_2)) {
                        System.out.println("\npasswords in both fields should match !");

                        // re-ask
                        //System.out.println("Enter your password :");
                        //input_password = sc.nextLine();
                        //System.out.println("Re-Enter your password :");
                        //input_password_2 = sc.nextLine();

                        // if passwords match, then break
                        if (input_password.equals(input_password_2)) {
                            break;
                        }
                    }

                    // location for the profile pic
                    //System.out.println("Enter your profile pic location :");
                    //input_profile_pic = sc.nextLine();
                    sc.close();

                    try {
                        File f = new File(input_profile_pic);
                        fs = new FileInputStream(f);

                        // profile object
                        create_account_profile new_user_obj = new create_account_profile(input_username, input_name,
                                input_mail_id,
                                input_password, input_password_2, input_profile_pic);

                        // insert the new user into the profile table
                        ps = con.prepareStatement("INSERT INTO PROFILE VALUES(?,?,?,?,?,?,?)");
                        ps.setString(1, new_user_obj.username);
                        ps.setString(2, new_user_obj.name);
                        ps.setString(3, new_user_obj.mail_id);
                        ps.setString(4, new_user_obj.password_2);
                        ps.setBinaryStream(5, fs, (int) f.length());
                        ps.setInt(6, new_user_obj.level);
                        ps.setInt(7, new_user_obj.level_points);
                        ps.executeUpdate();

                        // create empty row with username for the current user in games
                        ps = con.prepareStatement("INSERT INTO SUBWAY_SURFERS VALUES(?,0,0,0,0,0,0)");
                        ps.setString(1, new_user_obj.username);
                        ps.executeUpdate();
                        ps = con.prepareStatement("INSERT INTO CLASH_OF_CLANS VALUES(?,0,0,0,0,0,0)");
                        ps.setString(1, new_user_obj.username);
                        ps.executeUpdate();
                        ps = con.prepareStatement("INSERT INTO BGMI VALUES(?,0,0,0,0,0,0)");
                        ps.setString(1, new_user_obj.username);
                        ps.executeUpdate();
                        ps = con.prepareStatement("INSERT INTO CANDY_CRUSH VALUES(?,0,0,0,0,0,0)");
                        ps.setString(1, new_user_obj.username);
                        ps.executeUpdate();

                        // final
                        System.out.println("\nAccount Created.");
                        gc_signup_graphics gcs = new gc_signup_graphics();
                        gcs.setVisible(false);

                                // call login graphics page

                        gc_login_graphics login_f = new gc_login_graphics();
                        login_f.login_panel();

                    } catch (Exception e) { // profile file not found error handling
                        System.out.println(e);
                    }
                } else {
                    System.out.println("Incorrect email");
                }
            }
        } catch (Exception e) { // check of existing username error handling
            System.out.println(e);
        }
    }
}

class passw_init {
    protected String s_password;
    protected String s_passwordCheck;

    passw_init(String passw, String passwCheck) {
        s_password = passw;
        s_passwordCheck = passwCheck;
    }
}

class pass_validation extends passw_init {
    pass_validation(String pword, String pwordCheck) {
        super(pword, pwordCheck);
    }

    public boolean pass_check() {
        boolean res = true;
        if (!s_password.equals(s_passwordCheck)) {
            res = false;
        }
        return res;
    }
}