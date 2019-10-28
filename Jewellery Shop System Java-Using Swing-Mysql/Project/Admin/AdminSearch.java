package Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;

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

public class AdminSearch extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Students frame = new Add_Students();
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
	public AdminSearch(String name1,String prt1,String gender1,String class1,String dob1,String section1,String teach1,String roll1,String marks1) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\Book Hub\\0 (Custom).jpg"));
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 319, 1014, 460);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Name");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel.setBounds(59, 25, 145, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblGurdiansName = new JLabel("Gurdian's Name");
		lblGurdiansName.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblGurdiansName.setBounds(59, 101, 145, 32);
		contentPane.add(lblGurdiansName);
		
		JTextArea stuname = new JTextArea();
		stuname.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		stuname.setBounds(235, 26, 166, 37);
		contentPane.add(stuname);
		stuname.setText(name1);
		stuname.setEditable(false);
		
		JTextArea partname = new JTextArea();
		partname.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		partname.setBounds(235, 102, 166, 37);
		partname.setText(prt1);
		contentPane.add(partname);
		partname.setEditable(false);
		
		
		ButtonGroup btg=new ButtonGroup();
		
		
		JLabel lblDob = new JLabel("DD/MM/YYYY");
		lblDob.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblDob.setBounds(481, 25, 158, 32);
		contentPane.add(lblDob);
		
		
		JLabel lblRollNo = new JLabel("Roll No.");
		lblRollNo.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblRollNo.setBounds(481, 171, 158, 32);
		contentPane.add(lblRollNo);
		
		JLabel lblClassTeacher = new JLabel("Class Teacher");
		lblClassTeacher.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblClassTeacher.setBounds(59, 250, 145, 32);
		contentPane.add(lblClassTeacher);
		
		JTextArea roll = new JTextArea();
		roll.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		roll.setBounds(651, 172, 166, 37);
		contentPane.add(roll);
		roll.setText(roll1);
		JLabel lblSection = new JLabel("Section ");
		lblSection.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblSection.setBounds(481, 101, 169, 32);
		contentPane.add(lblSection);
		
		JTextArea teacher = new JTextArea();
		teacher.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		teacher.setBounds(235, 251, 166, 37);
		contentPane.add(teacher);
		teacher.setText(teach1);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblClass.setBounds(59, 184, 145, 32);
		contentPane.add(lblClass);
		
		JTextArea stuclass = new JTextArea();
		stuclass.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		stuclass.setBounds(235, 185, 166, 37);
		contentPane.add(stuclass);
		stuclass.setText(class1);
		JTextArea section = new JTextArea();
		section.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		section.setBounds(651, 102, 166, 37);
		contentPane.add(section);
		section.setText(section1);
		
		

		JTextArea dob = new JTextArea();
		dob.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		dob.setBounds(651, 26, 166, 37);
		contentPane.add(dob);
		dob.setText(dob1);
		dob.setEditable(false);
		
		JLabel lblMarks = new JLabel("Marks");
		lblMarks.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblMarks.setBounds(481, 250, 158, 32);
		contentPane.add(lblMarks);
		
		JTextArea marks = new JTextArea();
		marks.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		marks.setBounds(651, 251, 166, 37);
		contentPane.add(marks);
		marks.setText(marks1);
		
		
		
		JButton btnNewButton = new JButton("UPDATE");
		
		
		
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

					
					int i=1;
					String cls=stuclass.getText();
					String rl=roll.getText();
					String tch=teacher.getText();
					String sec=section.getText();
					String marks11=marks.getText();
					
					try{
						System.out.println("add");
						
						Class.forName("com.mysql.jdbc.Driver");
						
						Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
						
						PreparedStatement st=(PreparedStatement) con.prepareStatement("Update  stu set class=? , section=?,teach=?,roll=?,marks=? where name=?");
						st.setString(1,cls);
						st.setString(2,sec);
						st.setString(3, tch);
						st.setString(4, rl);
						st.setString(5, marks11);
						st.setString(6,name);
						
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
						
						
						JOptionPane.showMessageDialog(btnNewButton,"Congratulations,"+n+"Student Updated sucessfully"+n+"Thankyou.");
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