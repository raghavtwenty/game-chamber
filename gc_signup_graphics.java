package game_chamber;

import javax.swing.*;
//import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gc_signup_graphics extends JFrame implements ActionListener {

    JTextField username_input_sp, 
    name_input_sp, 
    email_input_sp, 
    password_input_sp, 
    passwordCheck_input_sp, 
    propic_input_sp;

    JButton signup_button_sp, login_button_sp;

    String user_name_sp, 
    name_sp, 
    email_sp, 
    password_sp, 
    passwordCheck_sp,
    profile_pic_sp;

    gc_signup_graphics(){
        this.setTitle("Signup");
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

    public void sign_panel(){
        gameChamber_label("GAME");
        gameChamber_label("CHAMBER");

        main_panel_sp();

        credits();
    }
    public void gameChamber_label(String gc){
        JLabel gc_label = new JLabel();
        //Border border = BorderFactory.createLineBorder(Color.green, 3);

        gc_label.setText(gc);
        gc_label.setForeground(new Color(255, 255, 255));
        gc_label.setFont(new Font("Inter", Font.BOLD, 40));
        if (gc.equals("GAME")){
            gc_label.setBounds(25, 80, 230, 45);
        }
        else {
            gc_label.setBounds(25, 120, 230, 45);
        }
        //gc_label.setBorder(border);
        this.add(gc_label);
    }

    public void main_panel_sp(){
        JPanel m_panel = new JPanel();
        JLabel welcome_label = new JLabel();
        JLabel Username_sp_label = new JLabel();
        username_input_sp = new JTextField();
        JLabel Name_label = new JLabel();
        name_input_sp = new JTextField();
        JLabel Email_label = new JLabel();
        email_input_sp = new JTextField();
        JLabel Password_label = new JLabel();
        password_input_sp = new JTextField();
        JLabel PasswordCheck_label = new JLabel();
        passwordCheck_input_sp = new JTextField();
        JLabel Propic_label = new JLabel();
        propic_input_sp = new JTextField();
        signup_button_sp = new JButton();
        JLabel dot_label = new JLabel();
        login_button_sp = new JButton();

        //Border border = BorderFactory.createLineBorder(Color.red, 3);
        //m_panal.setBorder(border);

        m_panel.setBounds(25, 180, 295, 455);
        m_panel.setBackground(new Color(0, 0, 0));
        m_panel.setLayout(null);

        welcome_label.setText("Welcome Back");
        welcome_label.setBounds(0, 15, 250, 30);
        welcome_label.setForeground(new Color(255, 255, 255));
        welcome_label.setFont(new Font("Inter", Font.BOLD, 32));

        //welcome_label.setBorder(border);

        Username_sp_label.setText("Username");
        Username_sp_label.setBounds(15, 50, 250, 15);
        Username_sp_label.setForeground(new Color(255, 255, 255));
        Username_sp_label.setFont(new Font("Inter", Font.PLAIN, 14));

        //Username_sp_label.setBorder(border);

        username_input_sp.setBounds(15, 70, 250, 25);
        username_input_sp.setFont(new Font("Inter", Font.PLAIN, 14));

        Name_label.setText("Name");
        Name_label.setBounds(15, 100, 250, 15);
        Name_label.setForeground(new Color(255, 255, 255));
        Name_label.setFont(new Font("Inter", Font.PLAIN, 14));

        name_input_sp.setBounds(15, 120, 250, 25);
        name_input_sp.setFont(new Font("Inter", Font.PLAIN, 14));

        Email_label.setText("Email");
        Email_label.setBounds(15, 150, 250, 15);
        Email_label.setForeground(new Color(255, 255, 255));
        Email_label.setFont(new Font("Inter", Font.PLAIN, 14));

        email_input_sp.setBounds(15, 170, 250, 25);
        email_input_sp.setFont(new Font("Inter", Font.PLAIN, 14));

        Password_label.setText("Password");
        Password_label.setBounds(15, 200, 250, 15);
        Password_label.setForeground(new Color(255, 255, 255));
        Password_label.setFont(new Font("Inter", Font.PLAIN, 14));

        password_input_sp.setBounds(15, 220, 250, 25);
        password_input_sp.setFont(new Font("Inter", Font.PLAIN, 14));

        PasswordCheck_label.setText("Re-Enter Password");
        PasswordCheck_label.setBounds(15, 250, 250, 15);
        PasswordCheck_label.setForeground(new Color(255, 255, 255));
        PasswordCheck_label.setFont(new Font("Inter", Font.PLAIN, 14));

        passwordCheck_input_sp.setBounds(15, 270, 250, 25);
        passwordCheck_input_sp.setFont(new Font("Inter", Font.PLAIN, 14));

        Propic_label.setText("Profile Picture Location");
        Propic_label.setBounds(15, 300, 250, 15);
        Propic_label.setForeground(new Color(255, 255, 255));
        Propic_label.setFont(new Font("Inter", Font.PLAIN, 14));

        propic_input_sp.setBounds(15, 320, 250, 25);
        propic_input_sp.setFont(new Font("Inter", Font.PLAIN, 14));

        signup_button_sp.addActionListener(this);
        signup_button_sp.setBounds(100, 360, 95, 25);
        signup_button_sp.setText("Sign up");
        signup_button_sp.setFocusable(false);
        signup_button_sp.setFont(new Font("Inter", Font.BOLD, 16));
        signup_button_sp.setBackground(new Color(255, 255, 255));

        dot_label.setText("..........................................OR..........................................");
        dot_label.setBounds(5, 390, 295, 15);
        dot_label.setForeground(new Color(255, 255, 255));
        dot_label.setFont(new Font("Inter", Font.PLAIN, 12));

        login_button_sp.addActionListener(this);
        login_button_sp.setBounds(100, 420, 95, 25);
        login_button_sp.setText("Log in");
        login_button_sp.setFocusable(false);
        login_button_sp.setFont(new Font("Inter", Font.BOLD, 16));
        login_button_sp.setBackground(new Color(255, 255, 255));

        /*BG CODE HERE
        ImageIcon propic = new ImageIcon(getClass().getResource("Absolute Path"));
        JLabel propicImg_label = new JLabel(propic);
        t_panel.add(propicImg_label);
        */

        m_panel.add(welcome_label);
        // ADD THE BG TO PANEL HERE
        m_panel.add(Username_sp_label);
        m_panel.add(username_input_sp);
        m_panel.add(Name_label);
        m_panel.add(name_input_sp);
        m_panel.add(Email_label);
        m_panel.add(email_input_sp);
        m_panel.add(Password_label);
        m_panel.add(password_input_sp);
        m_panel.add(PasswordCheck_label);
        m_panel.add(passwordCheck_input_sp);
        m_panel.add(Propic_label);
        m_panel.add(propic_input_sp);
        m_panel.add(signup_button_sp);
        m_panel.add(dot_label);
        m_panel.add(login_button_sp);
        this.add(m_panel);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == signup_button_sp){
            user_name_sp = username_input_sp.getText();
            name_sp = name_input_sp.getText();
            email_sp = email_input_sp.getText();
            password_sp = password_input_sp.getText();
            passwordCheck_sp = passwordCheck_input_sp.getText();
            profile_pic_sp = propic_input_sp.getText();
            gc_signup.new_account_creation(user_name_sp,name_sp,email_sp,password_sp,passwordCheck_sp,profile_pic_sp);
            //System.out.println(user_name_sp+"\n"+name_sp+"\n"+email_sp+"\n"+password_sp+"\n"+passwordCheck_sp+"\n"+profile_pic_sp);
        }
        if (e.getSource() == login_button_sp){
            gc_login_graphics lf = new gc_login_graphics();
            this.setVisible(false);
            lf.login_panel();
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
