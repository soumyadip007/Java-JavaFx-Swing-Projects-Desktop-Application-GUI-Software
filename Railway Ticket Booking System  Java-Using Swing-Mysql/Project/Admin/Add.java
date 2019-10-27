package Admin;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
public class Add extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add frame = new Add();
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
	public Add() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\Book Hub\\0 (Custom).jpg"));
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 319, 1014, 460);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Full Name");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel.setBounds(59, 25, 145, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblGurdiansName = new JLabel("Email Id");
		lblGurdiansName.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblGurdiansName.setBounds(59, 107, 164, 32);
		contentPane.add(lblGurdiansName);
		
		JLabel lblGender = new JLabel("Shift");
		lblGender.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblGender.setBounds(59, 184, 145, 32);
		contentPane.add(lblGender);
		
		JTextArea stuname = new JTextArea();
		stuname.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		stuname.setBounds(235, 26, 166, 37);
		contentPane.add(stuname);
		
		JTextArea partname = new JTextArea();
		partname.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		partname.setBounds(235, 102, 166, 37);
		contentPane.add(partname);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Day");
		rdbtnNewRadioButton.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		rdbtnNewRadioButton.setBounds(235, 172, 75, 44);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Night");
		rdbtnNewRadioButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		rdbtnNewRadioButton_1.setBounds(235, 213, 138, 40);
		contentPane.add(rdbtnNewRadioButton_1);
		ButtonGroup btg=new ButtonGroup();
		btg.add(rdbtnNewRadioButton_1);
		btg.add(rdbtnNewRadioButton);
		
		
		JLabel lblDob = new JLabel("DD/MM/YYYY");
		lblDob.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblDob.setBounds(481, 25, 158, 32);
		contentPane.add(lblDob);
		
		JComboBox date = new JComboBox();
		for(int i=1;i<=31;i++)
		{
			String str=String.valueOf(i);
			date.addItem(str);
		}
		date.setBounds(662, 32, 48, 27);
		contentPane.add(date);
		
		JComboBox month = new JComboBox();
		month.setBounds(739, 32, 75, 27);
		month.addItem("Jan");
		month.addItem("Feb");
		month.addItem("Mar");
		month.addItem("Apr");
		month.addItem("May");
		month.addItem("Jun");
		month.addItem("Jul");
		month.addItem("Aug");
		month.addItem("Sep");
		month.addItem("Oct");
		month.addItem("Nov");
		month.addItem("Dec");
		contentPane.add(month);
		
		JComboBox year = new JComboBox();
		for(int i=1901;i<=2018;i++)
		{
			String str=String.valueOf(i);
			year.addItem(str);
		}
		year.setBounds(841, 32, 109, 27);
		contentPane.add(year);
		
		JLabel lblRollNo = new JLabel("Starting From");
		lblRollNo.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblRollNo.setBounds(481, 184, 158, 32);
		contentPane.add(lblRollNo);
		
		JLabel lblClassTeacher = new JLabel("Destination");
		lblClassTeacher.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblClassTeacher.setBounds(481, 261, 145, 32);
		contentPane.add(lblClassTeacher);
		
		JTextArea roll = new JTextArea();
		roll.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		roll.setBounds(662, 185, 166, 37);
		contentPane.add(roll);
		
		JLabel lblSection = new JLabel("Train Name");
		lblSection.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblSection.setBounds(481, 107, 169, 32);
		contentPane.add(lblSection);
		
		JTextArea teacher = new JTextArea();
		teacher.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		teacher.setBounds(662, 262, 166, 37);
		contentPane.add(teacher);
		
		JLabel lblClass = new JLabel("Time");
		lblClass.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblClass.setBounds(59, 261, 145, 32);
		contentPane.add(lblClass);
		
		JTextArea stuclass = new JTextArea();
		stuclass.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		stuclass.setBounds(235, 262, 166, 37);
		contentPane.add(stuclass);

		JTextArea section = new JTextArea();
		section.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		section.setBounds(662, 110, 166, 37);
		contentPane.add(section);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			/* (non-Javadoc)
			 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
			 */
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(btnNewButton,"Are you sure?");
				//JOptionPane.setRootFrame(null);
				if(a==JOptionPane.YES_OPTION){
				
					String name=stuname.getText();
					String prnt= partname.getText();

					String  condition="";
					if(rdbtnNewRadioButton.isSelected())
					{
						condition="Male";
						
					}
					else if(rdbtnNewRadioButton_1.isSelected())
					{
						condition="Female";
						
					}
					int i=1;
					String cls=stuclass.getText();
					String rl=roll.getText();
					String tch=teacher.getText();
					String sec=section.getText();
					
					
					String dt=(String) date.getSelectedItem();
					String mnth=(String) month.getSelectedItem();
					String yr=(String) year.getSelectedItem();
					 int rand_int1=0;
					String date=dt+"/"+mnth+"/"+yr;
					try{
						System.out.println("add");
						
						Class.forName("com.mysql.jdbc.Driver");
						
						Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
						
						PreparedStatement st=(PreparedStatement) con.prepareStatement("INSERT INTO stu(name,prt,gender,class,dob,section,teach,roll,pass,marks) values(?,?,?,?,?,?,?,?,?,?)");
						
						st.setString(1, name);
						st.setString(2, prnt);
						st.setString(3, condition);
						st.setString(4, cls);
						st.setString(5, date);
						st.setString(6, sec);
						st.setString(7, tch);
						st.setString(8, rl);
						st.setString(9, "UEMK");
						Random rand=new Random();
						  rand_int1 = rand.nextInt(1000000); 
						  st.setInt(10,rand_int1);
						int j=0;
						j=st.executeUpdate();
						
					}
					catch(Exception w1)
					{
					System.out.println(w1);	
					}
					
					
					if(i==1)
					{
						String n="\n";
					
						JOptionPane.showMessageDialog(btnNewButton,"Congratulations,"+n+"Ticket is booked sucessfully.\n+Ticket ID:"+rand_int1+""+n+"Thankyou.");
					}
					else
					{

						JOptionPane.showMessageDialog(btnNewButton,"Please,enter the informations");
					}
				}
				
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		btnNewButton.setBounds(376, 318, 197, 80);
		contentPane.add(btnNewButton);
		
	}
}