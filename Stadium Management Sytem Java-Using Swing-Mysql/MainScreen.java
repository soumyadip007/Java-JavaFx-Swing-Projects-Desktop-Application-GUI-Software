package Stedium_Management;
/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class MainScreen extends JFrame {

	private JPanel contentPane;

//	MainScreen frame;
	MainScreen(String s){
		super(s);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					MainScreen frame = new MainScreen();
					frame.setTitle("Stadium Management System");
					frame.setVisible(true);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}

	/**
	 * Create the frame.
	 */
	public MainScreen() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\STDM.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		setResizable(false);
		//contentPane.setTitle();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Stadium Management System");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
		lblNewLabel.setBounds(250, 0, 590, 103);
		contentPane.add(lblNewLabel);
		
		JButton AdminBtn = new JButton("Admin Login");
		AdminBtn.setFont(new Font("Tahoma", Font.PLAIN, 32));
		AdminBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminLogin ad=new AdminLogin();
				ad.setTitle("Stadium Management System");
				ad.setVisible(true);
			}
		});
		AdminBtn.setBounds(128, 245, 243, 93);
		contentPane.add(AdminBtn);
		
		JButton UserBtn = new JButton("User Login");
		UserBtn.setFont(new Font("Tahoma", Font.PLAIN, 32));
		UserBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Userlogin ad=new Userlogin();
				ad.setTitle("Stadium Management System");
				ad.setVisible(true);
			}
		});
		UserBtn.setBounds(647, 245, 243, 93);
		contentPane.add(UserBtn);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Soumyadeep\\Desktop\\STdM1.jpeg"));
		lblNewLabel_1.setBounds(0, 0, 1010, 562);
		contentPane.add(lblNewLabel_1);
	}
}
