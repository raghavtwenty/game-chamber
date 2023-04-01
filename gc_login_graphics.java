package game_chamber;

import javax.swing.*;
//import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class gc_login_graphics extends JFrame implements ActionListener {
    JButton Login_button_lp, Signup_button_lp;
    public JTextField UserName_input_lp, PassWord_input_lp;
    public static String user_name_lp, pass_word_lp;

    gc_login_graphics() {

        this.setTitle("Game Chamber");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(360, 720);
        this.setVisible(true);
        this.setLayout(null);
        /*
         * ImageIcon login_image = new ImageIcon("logo.");
         * this.setIconImage(login_image.getImage());
         */
        this.getContentPane().setBackground(new Color(0, 0, 0));
    }

    public void login_panel() {

        gameChamber_label("GAME");
        gameChamber_label("CHAMBER");

        main_panal_lp();

        credits();
    }

    public void gameChamber_label(String gc) {
        JLabel gc_label = new JLabel();
        // Border border = BorderFactory.createLineBorder(Color.green, 3);

        gc_label.setText(gc);
        gc_label.setForeground(new Color(255, 255, 255));
        gc_label.setFont(new Font("Inter", Font.BOLD, 40));
        if (gc.equals("GAME")) {
            gc_label.setBounds(25, 80, 230, 45);
            gc_label.setVisible(true);
        } else {
            gc_label.setBounds(25, 120, 230, 45);
            gc_label.setVisible(true);
        }
        // gc_label.setBorder(border);
        this.add(gc_label);
    }

    public void main_panal_lp() {
        JPanel m_panal = new JPanel();
        JLabel welcome_label = new JLabel();

        // username and password
        JLabel userName_label = new JLabel();
        UserName_input_lp = new JTextField();
        JLabel passWord_label = new JLabel();
        PassWord_input_lp = new JTextField();

        // buttons
        Login_button_lp = new JButton();
        JLabel dot_label = new JLabel();
        Signup_button_lp = new JButton();

        // Border border = BorderFactory.createLineBorder(Color.red, 3);
        // m_panal.setBorder(border);

        m_panal.setBounds(25, 200, 295, 380);
        m_panal.setBackground(new Color(0, 0, 0));
        m_panal.setLayout(null);
        m_panal.setVisible(true);

        welcome_label.setText("Welcome Back");
        welcome_label.setBounds(0, 15, 250, 30);
        welcome_label.setForeground(new Color(255, 255, 255));
        welcome_label.setFont(new Font("Inter", Font.BOLD, 32));
        welcome_label.setVisible(true);

        // welcome_label.setBorder(border);

        userName_label.setText("Username");
        userName_label.setVisible(true);
        userName_label.setBounds(15, 60, 250, 20);
        userName_label.setForeground(new Color(255, 255, 255));
        userName_label.setFont(new Font("Inter", Font.PLAIN, 20));

        // userName_label.setBorder(border);

        UserName_input_lp.setVisible(true);
        UserName_input_lp.setBounds(15, 85, 250, 30);
        UserName_input_lp.setFont(new Font("Inter", Font.PLAIN, 14));

        passWord_label.setVisible(true);
        passWord_label.setText("Password");
        passWord_label.setBounds(15, 135, 250, 20);
        passWord_label.setForeground(new Color(255, 255, 255));
        passWord_label.setFont(new Font("Inter", Font.PLAIN, 20));

        // passWord_label.setBorder(border);

        PassWord_input_lp.setVisible(true);
        PassWord_input_lp.setBounds(15, 160, 250, 30);
        PassWord_input_lp.setFont(new Font("Inter", Font.PLAIN, 14));

        Login_button_lp.addActionListener(this);
        Login_button_lp.setVisible(true);
        Login_button_lp.setBounds(100, 215, 95, 35);
        Login_button_lp.setText("Log in");
        Login_button_lp.setFocusable(false);
        Login_button_lp.setFont(new Font("Inter", Font.BOLD, 16));
        Login_button_lp.setBackground(new Color(255, 255, 255));

        dot_label.setText("..........................................OR..........................................");
        dot_label.setVisible(true);
        dot_label.setBounds(5, 255, 295, 20);
        dot_label.setForeground(new Color(255, 255, 255));
        dot_label.setFont(new Font("Inter", Font.PLAIN, 12));

        // dot_label.setBorder(border);

        Signup_button_lp.addActionListener(this);
        Signup_button_lp.setVisible(true);
        Signup_button_lp.setBounds(100, 285, 95, 35);
        Signup_button_lp.setText("Sign up");
        Signup_button_lp.setFocusable(false);
        Signup_button_lp.setFont(new Font("Inter", Font.BOLD, 16));
        Signup_button_lp.setBackground(new Color(255, 255, 255));

        /*
         * BG CODE HERE
         * ImageIcon propic = new ImageIcon(getClass().getResource("Absolute Path"));
         * JLabel propicImg_label = new JLabel(propic);
         * t_panel.add(propicImg_label);
         */

        m_panal.add(welcome_label);
        // ADD THE BG TO PANEL HERE
        m_panal.add(Login_button_lp);
        m_panal.add(dot_label);
        m_panal.add(Signup_button_lp);
        m_panal.add(userName_label);
        m_panal.add(UserName_input_lp);
        m_panal.add(passWord_label);
        m_panal.add(PassWord_input_lp);
        this.add(m_panal);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Login_button_lp) {
            user_name_lp = UserName_input_lp.getText();
            pass_word_lp = PassWord_input_lp.getText();
            System.out.println(user_name_lp + "\n" + pass_word_lp);

            // call login validation file
            this.setVisible(false);
            gc_login.login(user_name_lp, pass_word_lp);

        }
        if (e.getSource() == Signup_button_lp) {
            gc_signup_graphics sf = new gc_signup_graphics();
            this.setVisible(false);
            sf.sign_panel();
        }
    }

    public void credits() {
        JLabel credit_label = new JLabel();

        credit_label.setText("Designed & developed by FARHAAN J, NAVEEN R, RAGHAVA");
        credit_label.setBounds(20, 660, 350, 15);
        credit_label.setForeground(new Color(255, 255, 255));
        credit_label.setFont(new Font("Inter", Font.ITALIC, 10));

        this.add(credit_label);
    }
}
