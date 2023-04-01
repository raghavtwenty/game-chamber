package game_chamber;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class home_frame extends JFrame implements ActionListener {

    JButton game1_name_button, game2_name_button,game3_name_button,game4_name_button;
    home_frame(){

        this.setTitle("Game Chamber");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(360, 720);
        this.setVisible(true);
        this.setLayout(null);
        /*
        ImageIcon login_image = new ImageIcon("logo.");
        this.setIconImage(login_image.getImage());
        */
        this.getContentPane().setBackground(new Color(0, 0, 0));
    }

    public void top_panel_hp(String name_hp_in){
        JPanel t_panel = new JPanel();
        JPanel t_l_corner_panel = new JPanel();
        JPanel t_profile_pic_panel = new JPanel();
        JLabel t_name_label = new JLabel();


        Border border = BorderFactory.createLineBorder(Color.red, 3);
        //t_panel.setBorder(border);

        t_panel.setBounds(0, 0, 345, 180);
        t_panel.setBackground(new Color(0, 0, 0));
        t_panel.setLayout(null);


        t_l_corner_panel.setBounds(0, 0, 130, 130);
        t_l_corner_panel.setBackground(new Color(255, 0, 0));
        t_l_corner_panel.setLayout(null);

        /*CODE FOR TOP-LEFT-CORNER BG
        t_l_corner_panel.add();
        */

        t_profile_pic_panel.setBounds(70, 50, 70, 70);
        t_profile_pic_panel.setBackground(new Color(0, 255, 0));
        t_profile_pic_panel.setLayout(null);

        /*CODE FOR TOP-PROFILE PIC
        t_profile_pic_panel.add();
        */

        t_name_label.setText(name_hp_in);
        t_name_label.setBounds(160, 75, 180, 15);
        t_name_label.setForeground(new Color(255, 255, 255));
        t_name_label.setFont(new Font("Inter", Font.BOLD, 14));

        t_panel.add((t_profile_pic_panel));
        t_panel.add(t_l_corner_panel);
        t_panel.add(t_name_label);
        this.add(t_panel);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == game1_name_button) {
            subwaysurfers ss = new subwaysurfers();
            
            ss.callsub();

        }
        if (e.getSource() == game2_name_button) {
            
        }
        if (e.getSource() == game3_name_button) {
            

        }
        if (e.getSource() == game4_name_button) {
            
        }
    }

    public void middle_panel_hp(){
        JPanel mid_panel = new JPanel();
        JPanel game1_panel = new JPanel();
        JPanel game2_panel = new JPanel();
        JPanel game3_panel = new JPanel();
        JPanel game4_panel = new JPanel();

        mid_panel.setBounds(0, 180, 345, 440);
        mid_panel.setBackground(new Color(25, 25, 25));
        mid_panel.setLayout(new GridLayout(2, 2));

        Border border = BorderFactory.createLineBorder(Color.red, 3);
        //mid_panel.setBorder(border);

        game1_panel.setBackground(new Color(25, 25, 25));
        game1_panel.setLayout(null);

        JPanel game1_pic_panel = new JPanel();
        game1_pic_panel.setBounds(34, 30, 100, 100);
        game1_pic_panel.setBackground(new Color(0, 255, 0));
        game1_pic_panel.setLayout(null);

        JButton game1_name_button = new JButton();
        game1_name_button.addActionListener(this);
        game1_name_button.setBorder(null);
        game1_name_button.setBounds(12, 145, 140, 35);
        game1_name_button.setText("Subway Surfers");
        game1_name_button.setFocusable(false);
        game1_name_button.setFont(new Font("Inter", Font.BOLD, 14));
        game1_name_button.setBackground(new Color(0,0,0));
        game1_name_button.setForeground(new Color(255, 255, 255));

        game1_panel.add(game1_name_button);
        game1_panel.add(game1_pic_panel);

        /*CODE FOR SUBWAY SURFERS PIC
        game1_panel.add();
        */

        game2_panel.setBackground(new Color(25, 25, 25));
        game2_panel.setLayout(null);

        JPanel game2_pic_panel = new JPanel();
        game2_pic_panel.setBounds(34, 30, 100, 100);
        game2_pic_panel.setBackground(new Color(0, 255, 0));
        game2_pic_panel.setLayout(null);

        JButton game2_name_button = new JButton();
        game2_name_button.addActionListener(this);
        game2_name_button.setBorder(null);
        game2_name_button.setBounds(12, 145, 140, 35);
        game2_name_button.setText("BGMI");
        game2_name_button.setFocusable(false);
        game2_name_button.setFont(new Font("Inter", Font.BOLD, 14));
        game2_name_button.setBackground(new Color(0,0,0));
        game2_name_button.setForeground(new Color(255, 255, 255));

        game2_panel.add(game2_name_button);
        game2_panel.add(game2_pic_panel);

        /*CODE FOR BGMI PIC
        game2_panel.add();
        */

        game3_panel.setBackground(new Color(25, 25, 25));
        game3_panel.setLayout(null);

        JPanel game3_pic_panel = new JPanel();
        game3_pic_panel.setBounds(34, 30, 100, 100);
        game3_pic_panel.setBackground(new Color(0, 255, 0));
        game3_pic_panel.setLayout(null);

        JButton game3_name_button = new JButton();
        game3_name_button.addActionListener(this);
        game3_name_button.setBorder(null);
        game3_name_button.setBounds(12, 145, 140, 35);
        game3_name_button.setText("Clash of Clans");
        game3_name_button.setFocusable(false);
        game3_name_button.setFont(new Font("Inter", Font.BOLD, 14));
        game3_name_button.setBackground(new Color(0,0,0));
        game3_name_button.setForeground(new Color(255, 255, 255));

        game3_panel.add(game3_name_button);
        game3_panel.add(game3_pic_panel);

        /*CODE FOR CLASH OF CLANS PIC
        game3_panel.add();
        */

        game4_panel.setBackground(new Color(25, 25, 25));
        game4_panel.setLayout(null);

        JPanel game4_pic_panel = new JPanel();
        game4_pic_panel.setBounds(34, 30, 100, 100);
        game4_pic_panel.setBackground(new Color(0, 255, 0));
        game4_pic_panel.setLayout(null);

        JButton game4_name_button = new JButton();
        game4_name_button.addActionListener(this);
        game4_name_button.setBorder(null);
        game4_name_button.setBounds(12, 145, 140, 35);
        game4_name_button.setText("Candy Crush");
        game4_name_button.setFocusable(false);
        game4_name_button.setFont(new Font("Inter", Font.BOLD, 14));
        game4_name_button.setBackground(new Color(0,0,0));
        game4_name_button.setForeground(new Color(255, 255, 255));

        game4_panel.add(game4_name_button);
        game4_panel.add(game4_pic_panel);

        /*CODE FOR CANDY CRUSH PIC
        game4_panel.add();
        */

        mid_panel.add(game1_panel);
        mid_panel.add(game2_panel);
        mid_panel.add(game3_panel);
        mid_panel.add(game4_panel);
        this.add(mid_panel);
    }

    public void bottom_panel_hp(){
        JPanel bot_panel = new JPanel();
        JPanel b_profile_panel = new JPanel();
        JPanel b_home_panel = new JPanel();

        bot_panel.setBounds(0, 620, 345, 60);
        bot_panel.setBackground(new Color(75, 75, 75));
        bot_panel.setLayout(new GridLayout(1, 2, 3, 0));

        Border border = BorderFactory.createLineBorder(Color.red, 3);
        //bot_panel.setBorder(border);

        b_profile_panel.setBackground(new Color(35, 35, 35));

        JButton profile_icon_button = new JButton();
        profile_icon_button.addActionListener(this);
        profile_icon_button.setBorder(null);
        profile_icon_button.setBounds(5, 5, 160, 50);
        profile_icon_button.setText("Profile");
        profile_icon_button.setFocusable(false);
        profile_icon_button.setFont(new Font("Inter", Font.BOLD, 14));
        profile_icon_button.setBackground(new Color(35, 35, 35));
        profile_icon_button.setForeground(new Color(255, 255, 255));

        b_profile_panel.add(profile_icon_button);
        b_profile_panel.setLayout(null);

        b_home_panel.setBackground(new Color(35, 35, 35));

        JButton home_icon_button = new JButton();
        home_icon_button.addActionListener(this);
        home_icon_button.setBorder(null);
        home_icon_button.setBounds(5, 5, 160, 50);
        home_icon_button.setText("Home");
        home_icon_button.setFocusable(false);
        home_icon_button.setFont(new Font("Inter", Font.BOLD, 14));
        home_icon_button.setBackground(new Color(35, 35, 35));
        home_icon_button.setForeground(new Color(255, 255, 255));

        b_home_panel.add(home_icon_button);
        b_home_panel.setLayout(null);

        bot_panel.add(b_profile_panel);
        bot_panel.add(b_home_panel);
        this.add(bot_panel);
    }
}
