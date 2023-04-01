package game_chamber;

import javax.swing.*;
import java.awt.*;

public class leaderb extends JFrame {

   public String username, level, name;

   leaderb() {
      this.setTitle("GAME CHAMBER");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setResizable(false);
      this.setSize(360, 720);
      this.setVisible(true);
      this.getContentPane().setBackground(new Color(50, 49, 49));
      // ImageIcon image = new ImageIcon("");
      // this.setIconImage(image.getImage());

   }

   public void call() {
      user_panel();
      opp_panel();
      opp_panel2();
      opp_panel(name);
   }

   public void user_panel() {
      // ImageIcon image = new ImageIcon("SfY63dVD_400x400.jpg");
      JPanel user_panel = new JPanel();
      JLabel user_label = new JLabel();
      JLabel user_level = new JLabel();
      user_panel.setBounds(0, 0, 360, 200);
      user_panel.setBackground(new Color(0, 0, 0));
      user_panel.setLayout(null);

      user_label.setText("PLAYER");
      // user_label.setIcon(image);
      user_label.setForeground(Color.WHITE);
      user_label.setBounds(100, 100, 100, 100);
      user_label.setFont(new Font("Inter", Font.BOLD, 20));

      user_level.setText("LEVEL 1");
      user_level.setBounds(100, 120, 100, 100);
      user_level.setForeground(Color.white);
      user_level.setFont(new Font("Inter", Font.BOLD, 10));

      user_panel.add(user_label);
      // user_panel.add(user_level);
      this.add(user_panel);
   }

   public void opp_panel() {
      // ImageIcon image = new ImageIcon("SfY63dVD_400x400.jpg");
      JPanel opp_panel1 = new JPanel();
      JLabel opp_label1 = new JLabel();
      JLabel opp_level1 = new JLabel();

      opp_panel1.setBounds(50, 200, 150, 100);
      opp_panel1.setBackground(new Color(50, 49, 49));
      opp_panel1.setLayout(null);

      opp_label1.setText("RAGHAV");
      // opp_label1.setIcon(image);
      opp_label1.setBounds(100, 200, 100, 100);
      opp_label1.setForeground(Color.WHITE);
      opp_label1.setFont(new Font("Inter", Font.BOLD, 20));

      opp_level1.setText("LEVEL 1");
      opp_level1.setBounds(100, 220, 100, 100);
      opp_level1.setForeground(Color.white);
      opp_level1.setFont(new Font("Inter", Font.BOLD, 10));

      opp_panel1.add(opp_label1);
      // user_panel1.add(user_level);
      this.add(opp_panel1);

   }

   public void opp_panel2() {
      // ImageIcon image = new ImageIcon("SfY63dVD_400x400.jpg");
      JPanel opp_panel2 = new JPanel();
      JLabel opp_label2 = new JLabel();
      JLabel opp_level2 = new JLabel();
      opp_panel2.setBounds(50, 50, 150, 100);
      opp_panel2.setBackground(new Color(136, 24, 199));
      opp_panel2.setLayout(null);

      opp_label2.setText("farhaan");
      opp_label2.setBounds(100, 320, 100, 100);
      // opp_label2.setIcon(image);
      opp_label2.setForeground(Color.WHITE);
      opp_label2.setFont(new Font("Inter", Font.BOLD, 20));

      opp_level2.setText("LEVEL 1");
      opp_level2.setBounds(50, 340, 100, 100);
      opp_level2.setForeground(Color.white);
      opp_level2.setFont(new Font("Inter", Font.BOLD, 10));

      opp_panel2.add(opp_label2);
      // user_panel2.add(user_level);
      this.add(opp_panel2);

   }

   public void opp_panel(String n) {
      name = n;
      // ImageIcon image = new ImageIcon("SfY63dVD_400x400.jpg");
      JPanel opp_panel3 = new JPanel();
      JLabel opp_label3 = new JLabel();
      JLabel opp_level3 = new JLabel();
      opp_panel3.setBounds(50, 50, 150, 100);
      opp_panel3.setBackground(new Color(136, 24, 199));
      opp_panel3.setLayout(null);

      opp_label3.setText(name);
      opp_label3.setBounds(100, 100, 100, 100);
      // opp_label3.setIcon(image);
      opp_label3.setForeground(Color.WHITE);
      opp_label3.setFont(new Font("Inter", Font.BOLD, 20));

      opp_level3.setText("LEVEL 1");
      opp_level3.setBounds(100, 120, 100, 100);
      opp_level3.setForeground(Color.white);
      opp_level3.setFont(new Font("Inter", Font.BOLD, 10));

      opp_panel3.add(opp_label3);
      // user_panel3.add(user_level);
      this.add(opp_panel3);

   }
}
