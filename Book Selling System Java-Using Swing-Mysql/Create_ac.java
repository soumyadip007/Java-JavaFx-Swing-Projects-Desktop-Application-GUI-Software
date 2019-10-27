package Textbook_selling_system;
/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Create_ac extends JFrame {

	private JPanel contentPane;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField email;
	private JTextField username;
	private JTextField mob;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create_ac frame = new Create_ac();
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
	
	public Create_ac() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\Book Hub\\0 (Custom).jpg"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewUserRegister = new JLabel("New User Register");
		lblNewUserRegister.setForeground(new Color(102, 255, 0));
		lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
		lblNewUserRegister.setBounds(362, 52, 325, 50);
		contentPane.add(lblNewUserRegister);
		
		JLabel lblName = new JLabel("First name");
		lblName.setForeground(new Color(255, 204, 51));
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName.setBounds(58, 151, 99, 43);
		contentPane.add(lblName);
		
		JLabel lblNewLabel = new JLabel("Last name");
		lblNewLabel.setForeground(new Color(255, 204, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(58, 243, 110, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmailAddress = new JLabel("Email\r\n address");
		lblEmailAddress.setForeground(new Color(255, 204, 0));
		lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmailAddress.setBounds(58, 324, 124, 36);
		contentPane.add(lblEmailAddress);
		
		firstname = new JTextField();
		firstname.setFont(new Font("Tahoma", Font.PLAIN, 32));
		firstname.setBounds(214, 151, 228, 50);
		contentPane.add(firstname);
		firstname.setColumns(10);
		
		lastname = new JTextField();
		lastname.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lastname.setBounds(214, 235, 228, 50);
		contentPane.add(lastname);
		lastname.setColumns(10);
		
		email = new JTextField();

		email.setFont(new Font("Tahoma", Font.PLAIN, 32));
		email.setBounds(214, 320, 228, 50);
		contentPane.add(email);
		email.setColumns(10);
		
		username = new JTextField();
		username.setFont(new Font("Tahoma", Font.PLAIN, 32));
		username.setBounds(707, 151, 228, 50);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(255, 204, 0));
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setBounds(542, 159, 99, 29);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 204, 0));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(542, 245, 99, 24);
		contentPane.add(lblPassword);
		
		JLabel lblMobileNumber = new JLabel("Mobile number");
		lblMobileNumber.setForeground(new Color(255, 204, 0));
		lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMobileNumber.setBounds(542, 329, 139, 26);
		contentPane.add(lblMobileNumber);
		
		mob = new JTextField();
		mob.setFont(new Font("Tahoma", Font.PLAIN, 32));
		mob.setBounds(707, 320, 228, 50);
		contentPane.add(mob);
		mob.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
		passwordField.setBounds(707, 235, 228, 50);
		contentPane.add(passwordField);
		
		btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first=firstname.getText();
				String last=lastname.getText();
				String emailadd=email.getText();
				String user1=username.getText();
				String mb=mob.getText();
				int len=mb.length();
				String pass1=passwordField.getText();
				
				String msg=""+first;
				msg+=" \n";
				if(len==10)
				{
					try{
						//	String drivername="com.microsoft.sqlserver.jdbc.SQLServerDriver";
						//	Class.forName("com.mysql.jdbc.Driver");
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/book selling system","root","");
							//Statement st=con.createStatement();
							
							String query="INSERT INTO account VALUES('"+first+"','"+last+"','"+user1+"','"+pass1+"','"+emailadd+"','"+mb+"')";
							Statement sta=con.createStatement(); 
							int x=sta.executeUpdate(query);
							if(x==0)
							{
								JOptionPane.showMessageDialog(btnNewButton, "User name is alredy exist");
							}
							else
							{
								JOptionPane.showMessageDialog(btnNewButton,"Welcome, "+msg+"Your account is sucessfully created");
							}
							con.close();
						}
						catch(Exception f)
						{
							System.out.println(f.getMessage());
						}	
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");
				}
				
				
			/*	try{
					String drivername="com.microsoft.sqlserver.jdbc.SQLServerDriver";//driver name
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					String db="jdbc:sqlserver://PERSONAL\\SQLEXPRESS:1433;databaseName=test";
					String user="PERSONAL/Soumyadeep";
					String pass="";
					String query="SELECT * FROM INSERT INTO user_details('','"+first+"','"+last+"','"+user1+"','"+pass1+"','"+emailadd+"','"+mb+"')";
					Connection con=DriverManager.getConnection(db,user,pass);
					Statement st=con.createStatement();
					int x=st.executeUpdate(query);
					if(x==1)
					{
						JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
					}
					con.close();
				}
				catch(Exception f)
				{
					System.out.println(f.getMessage());
				}	*/	
				//JOptionPane.showMessageDialog(btnNewButton,"Welcome, "+msg+"Your account is sucessfully created");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(345, 397, 139, 50);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Already Have Account ? Sign in");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Userlogin us=new Userlogin();
				us.setTitle("Book Hub");
				us.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_1.setBounds(297, 474, 435, 50);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Reset\r\n\r\n\r\n");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_2.setBounds(542, 397, 139, 50);
		contentPane.add(btnNewButton_2);
		
		label = new JLabel("");
		label.setForeground(new Color(255, 204, 0));
		label.setIcon(new ImageIcon("C:\\Users\\Soumyadeep\\Desktop\\Book Hub\\3 (Custom).jpg"));
		label.setBounds(0, 0, 1008, 562);
		contentPane.add(label);
	}
}