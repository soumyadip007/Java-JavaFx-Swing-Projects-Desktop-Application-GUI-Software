package bank.management.sys;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame  implements ActionListener {
    JLabel label1 ;
    JLabel label2 ;
    JLabel label3 ; // we use it here we make to make it globally available

    JButton button1;
    JButton button2;
    JButton button3;

    JTextField textField2;
    JPasswordField passwordField3;
    JCheckBox showPasswordCheckbox;
    String hk;

    Login(String hk) {
        setTitle("BANKING GUI"); // or we can use super function to set the title
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);

        label1 = new JLabel("Welcome to the bank simulation");
        label1.setBounds(230,125,450,40);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGrade",Font.BOLD,25));
        add(label1);


        label2 = new JLabel("Card No.");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150 ,190,375,30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);

        label3 = new JLabel("Pin.");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150,250,375,30);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);

        showPasswordCheckbox = new JCheckBox("Show Password");
        showPasswordCheckbox.setBounds(580, 250, 120, 30);
        showPasswordCheckbox.addActionListener(e -> {
            JCheckBox checkbox = (JCheckBox) e.getSource();
            if (checkbox.isSelected()) {
                passwordField3.setEchoChar((char) 0); // Show the password
            } else {
                passwordField3.setEchoChar('\u2022'); // Hide the password  , here the \u2022 is the code for .sign
            }

        });
        add(showPasswordCheckbox);


        button1 = new JButton("Sign In");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(325,300,100,30);
        button1.addActionListener(this);
        add(button1);



        button2 = new JButton("Clear");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(455,300,100,30);
        button2.addActionListener(this);
        add(button2);


        button3 = new JButton("Sign Up");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(325,350,230,30);
        button3.addActionListener(this);
        add(button3);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);

        setLayout(null);
        setSize(850,480);// for defining the size of the frame
        setLocation(450,200); // here we define the loaction of the box form x axis and y axis
        setVisible(true); // if we put this function between the any object that we want to show can never be shown
        /* set visibility always be define at last */

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            if (e.getSource()==button1){
                Connn c = new Connn();
                String cardno = textField2.getText();
                String pin = passwordField3.getText();
                String q = "select * from login where card_num = '"+cardno+"' and  pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(cardno,pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }

            }else if(e.getSource()==button2){
                textField2.setText("");
                passwordField3.setText("");
            }else if (e.getSource()==button3){
                new Signup();
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();

        }
    }

    public static void main(String[] args) {

        new Login("");
    }
}
