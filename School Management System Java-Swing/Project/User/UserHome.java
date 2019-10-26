package User;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import Admin.Add_Students;
import Admin.AdminLogin;
import Admin.AdminSearch;
import java.awt.Color;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.UIManager;

public class UserHome extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				//	UserHome frame = new UserHome();
					
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the frame.
	 */
	public UserHome(String userSes) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		String name1 = null;
		String prt1 = null;
		String gender1  = null;
		String class1 = null;
		String dob1 = null;
		String section1 = null;
		String teach1 = null;
		String roll1 = null;
		String marks1 = null;
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1008, 26);
		JMenu mnNewMenu_1 = new JMenu("Settings");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmAddOldBooks = new JMenuItem("Change Password");
		mntmAddOldBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			///	Add_Students obj=new Add_Students();
			//	/obj.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmAddOldBooks);
		

		JMenuItem mmm = new JMenuItem("Logout");
		mntmAddOldBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(mntmAddOldBooks,"Are you sure?");
				//JOptionPane.setRootFrame(null);
				if(a==JOptionPane.YES_OPTION){
					dispose();
					UserLogin obj=new UserLogin();
					obj.setTitle("Student-Login");
					obj.setVisible(true);
				}
				dispose();
				UserLogin obj=new UserLogin();
				obj.setVisible(true);
			}
		});
		mnNewMenu_1.add(mmm);
		
		
		contentPane.add(menuBar);
		try{
			System.out.println("add");
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
			
			PreparedStatement st=(PreparedStatement) con.prepareStatement("Select name,prt,gender,class,dob,section,teach,roll,marks section from stu where name=?");
			int i;
			
			st.setString(1,userSes);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				name1=rs.getString(1);
				 prt1=rs.getString(2);
				 gender1=rs.getString(3);
				 class1=rs.getString(4);
				 dob1=rs.getString(5);
				 section1=rs.getString(6);
				 teach1=rs.getString(7);
				 roll1=rs.getString(8);
				 marks1=rs.getString(9);
				
			
			}
			
			
			
			
		}
		catch(Exception w1)
		{
		System.out.println(w1);	
		}
		
		JLabel lblNewLabel = new JLabel("My Name");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		lblNewLabel.setBounds(35, 46, 249, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblGurdiansName = new JLabel("Gurdian's Name");
		lblGurdiansName.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		lblGurdiansName.setBounds(35, 149, 222, 32);
		contentPane.add(lblGurdiansName);
		
		JTextArea stuname = new JTextArea();
		stuname.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		stuname.setBounds(235, 50, 561, 48);
		contentPane.add(stuname);
		stuname.setText(name1);
		stuname.setEditable(false);
		
		JTextArea partname = new JTextArea();
		partname.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		partname.setBounds(235, 132, 255, 62);
		partname.setText(prt1);
		contentPane.add(partname);
		partname.setEditable(false);
		
		
		ButtonGroup btg=new ButtonGroup();
		
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		lblDob.setBounds(570, 149, 158, 32);
		contentPane.add(lblDob);
		
		
		JLabel lblRollNo = new JLabel("Roll No.");
		lblRollNo.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		lblRollNo.setBounds(570, 356, 158, 32);
		contentPane.add(lblRollNo);
		
		JLabel lblClassTeacher = new JLabel("Class Teacher");
		lblClassTeacher.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		lblClassTeacher.setBounds(35, 356, 175, 32);
		contentPane.add(lblClassTeacher);
		
		JTextArea roll = new JTextArea();
		roll.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		roll.setBounds(684, 347, 255, 62);
		contentPane.add(roll);
		roll.setEditable(false);
		roll.setText(roll1);
		JLabel lblSection = new JLabel("Section ");
		lblSection.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		lblSection.setBounds(570, 241, 169, 32);
		contentPane.add(lblSection);
	
		
		JTextArea teacher = new JTextArea();
		teacher.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		teacher.setBounds(235, 346, 255, 63);
		contentPane.add(teacher);
		teacher.setText(teach1);
		teacher.setEditable(false);
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		lblClass.setBounds(35, 242, 145, 32);
		contentPane.add(lblClass);
		
		JTextArea stuclass = new JTextArea();
		stuclass.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		stuclass.setBounds(235, 237, 255, 63);
		contentPane.add(stuclass);
		stuclass.setText(class1);
		stuclass.setEditable(false);
		JTextArea section = new JTextArea();
		section.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		section.setBounds(684, 232, 255, 63);
		contentPane.add(section);
		section.setText(section1);
		section.setEditable(false);
		
		

		JTextArea dob = new JTextArea();
		dob.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		dob.setBounds(684, 136, 255, 62);
		contentPane.add(dob);
		dob.setText(dob1);
		dob.setEditable(false);
		
		JLabel lblMarks = new JLabel("Marks (Total %)");
		lblMarks.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		lblMarks.setBounds(213, 469, 205, 32);
		contentPane.add(lblMarks);
		
		JTextArea marks = new JTextArea();
		marks.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		marks.setBounds(436, 465, 237, 54);
		contentPane.add(marks);
		marks.setText(marks1);
		marks.setEditable(false);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int a=JOptionPane.showConfirmDialog(btnNewButton,"Are you sure?");
				//JOptionPane.setRootFrame(null);
				if(a==JOptionPane.YES_OPTION){
					dispose();
					UserLogin obj=new UserLogin();
					obj.setTitle("Student-Login");
					obj.setVisible(true);
				}
				dispose();
				UserLogin obj=new UserLogin();
			
				obj.setTitle("Student-Login");
				obj.setVisible(true);
						
			}
		});
		btnNewButton.setBounds(808, 39, 175, 26);
		contentPane.add(btnNewButton);
		final String a=name1;
		JButton button = new JButton("Change-password\r\n");
		button.setBackground(UIManager.getColor("Button.disabledForeground"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Change bo=new Change(a);
				bo.setTitle("Change Password");
				bo.setVisible(true);
						
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button.setBounds(808, 69, 175, 32);
		contentPane.add(button);
		
		
	}
	
}
