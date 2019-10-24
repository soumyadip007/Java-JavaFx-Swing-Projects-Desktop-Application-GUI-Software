package Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import javax.swing.JTextArea;
public class AdminHome extends JFrame {

	private JPanel contentPane;
	private JFrame jf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHome frame = new AdminHome();
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
	public AdminHome() {
	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\Book Hub\\0 (Custom).jpg"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1008, 26);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Main Menu");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmAddOldBooks = new JMenuItem("Add Student");
		mntmAddOldBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Students obj=new Add_Students();
				obj.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmAddOldBooks);
		
		JMenuItem mntmAddNewBooks = new JMenuItem("Add Marks");
		mntmAddNewBooks.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			aa obj=new aa();
			obj.setVisible(true);
		}
	});
		mnNewMenu_1.add(mntmAddNewBooks);
		
		JMenu mnSettings = new JMenu("Settings");
		menuBar.add(mnSettings);
		
		JMenu mnNewMenu_3 = new JMenu("Adminstration");
		mnSettings.add(mnNewMenu_3);
		
		
		JMenuItem mntmAddFaculty = new JMenuItem("Add Faculty");
		mnNewMenu_3.add(mntmAddFaculty);
		
		JMenuItem mntmManageFaculty = new JMenuItem("Manage Faculty");
		mnNewMenu_3.add(mntmManageFaculty);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(btnNewButton,"Are you sure?");
				//JOptionPane.setRootFrame(null);
				if(a==JOptionPane.YES_OPTION){
						
				dispose();
				AdminLogin ms=new AdminLogin();
				ms.setTitle("Faculty Login");
				ms.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(899, 39, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton add = new JButton("Add student");
		add.setFont(new Font("Tahoma", Font.PLAIN, 29));
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Students obj=new Add_Students();
				obj.setVisible(true);
			}
		});
		add.setBounds(46, 197, 264, 118);
		contentPane.add(add);
		
		JButton btnNewButton_1 = new JButton("Add Marks");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aa obj=new aa();
				obj.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(374, 197,264, 118);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("All Students");
		button.setFont(new Font("Tahoma", Font.PLAIN, 29));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home obj=new Home();
				obj.setVisible(true);
			}
		});
		button.setBounds(693, 197, 264, 118);
		contentPane.add(button);
		
		JButton btnAlter = new JButton("Update Student");
		btnAlter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aa obj=new aa();
				obj.setVisible(true);
			}
		});
		btnAlter.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnAlter.setBounds(183, 366, 264, 118);
		contentPane.add(btnAlter);
		
		JButton btnAddFaculty = new JButton("Add Faculty");
		btnAddFaculty.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnAddFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_faculty obj=new Add_faculty();
				obj.setVisible(true);
			}
		});
		btnAddFaculty.setBounds(528, 366, 264, 118);
		contentPane.add(btnAddFaculty);
		
		JMenu mnNewMenu = new JMenu("Search");
		mnNewMenu.setBounds(0, 39, 58, -32);
		contentPane.add(mnNewMenu);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textArea.setBounds(65, 69, 587, 68);
		contentPane.add(textArea);
		
		JButton btnNewButton_2 = new JButton("Search");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_2.setBounds(688, 68, 148, 69);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String pstr=textArea.getText();
				try{
					System.out.println("add");
					
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
					
					PreparedStatement st=(PreparedStatement) con.prepareStatement("Select name,prt,gender,class,dob,section,teach,roll,marks section from stu where name=?");
					int i;
					
					st.setString(1,pstr);
					ResultSet rs=st.executeQuery();
					if(rs.next())
					{
						
						AdminSearch obj=new AdminSearch(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
						obj.setVisible(true);
					
					}
					else{
						JOptionPane.showMessageDialog(btnNewButton,"Sorry, Record Not Found");
						i=0;
					}
					
					
					
					
				}
				catch(Exception w1)
				{
				System.out.println(w1);	
				}
				
			}
		});
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Soumyadeep\\Desktop\\Book Hub\\why-you-should-read-and-re-read-these-high-school-books-as-an-adult (Custom).jpeg"));
		label.setBounds(0, 26, 1008, 536);
		contentPane.add(label);	
	}
}