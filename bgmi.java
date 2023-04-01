package game_chamber;

import javax.swing.*;
import java.awt.*;

public class bgmi extends JFrame {
    bgmi() {
        this.setTitle("GAME CHAMBER");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(360, 720);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(50, 49, 49));
    }

    public void callbgmi() {
        game_panel();
        game_stats();
    }

    public void game_panel() {
        // ImageIcon image = new ImageIcon("SfY63dVD_400x400.jpg");
        JPanel user_panel = new JPanel();
        JLabel user_label = new JLabel();

        user_panel.setBounds(0, 0, 360, 200);
        user_panel.setBackground(new Color(0, 0, 0));
        user_panel.setLayout(null);

        user_label.setText("BGMI");
        // user_label.setIcon(image);
        user_label.setForeground(Color.WHITE);
        user_label.setBounds(100, 100, 100, 100);
        user_label.setFont(new Font("Inter", Font.BOLD, 20));

        user_panel.add(user_label);

        this.add(user_panel);

    }

    private void game_stats() {
        JPanel stat_panel = new JPanel();
        stat_panel.setBounds(100, 100, 360, 300);
        stat_panel.setBackground(new Color(50, 49, 49));
        stat_panel.setLayout(null);
        JLabel CHICKEN_DINNER = new JLabel();
        JLabel total_kills = new JLabel();
        JLabel Chamber_points = new JLabel();
        JLabel total_play_time = new JLabel();
        JLabel mission_completed = new JLabel();

        mission_completed.setText("mission completed                                            " + "0");
        mission_completed.setForeground(Color.white);
        mission_completed.setFont(new Font("Inter", Font.BOLD, 10));
        mission_completed.setBounds(50, 200, 300, 100);

        total_kills.setText("total KILLS                                                        " + "0");
        total_kills.setForeground(Color.white);
        total_kills.setFont(new Font("Inter", Font.BOLD, 10));
        total_kills.setBounds(50, 250, 300, 100);

        total_play_time.setText("total play time                                                 " + "0");
        total_play_time.setForeground(Color.white);
        total_play_time.setFont(new Font("Inter", Font.BOLD, 10));
        total_play_time.setBounds(50, 300, 300, 100);

        Chamber_points.setText("chamber points                                                   " + "0");
        Chamber_points.setForeground(Color.white);
        Chamber_points.setFont(new Font("Inter", Font.BOLD, 10));
        Chamber_points.setBounds(50, 350, 300, 100);

        CHICKEN_DINNER.setText("CHICKEN DINNER                                                   " + "0");
        CHICKEN_DINNER.setForeground(Color.white);
        CHICKEN_DINNER.setFont(new Font("Inter", Font.BOLD, 10));
        CHICKEN_DINNER.setBounds(50, 400, 300, 100);

        stat_panel.add(CHICKEN_DINNER);
        stat_panel.add(total_play_time);
        stat_panel.add(total_kills);
        stat_panel.add(Chamber_points);
        stat_panel.add(mission_completed);

        this.add(stat_panel);

    }

}