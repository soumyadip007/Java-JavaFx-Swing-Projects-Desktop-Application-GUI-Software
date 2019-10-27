package Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;

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

public class Add_faculty extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_faculty frame = new Add_faculty();
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
	public Add_faculty() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 319, 1014, 460);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JTextArea nm = new JTextArea();
		nm.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		nm.setBounds(280, 26, 688, 80);
		contentPane.add(nm);
		ButtonGroup btg=new ButtonGroup();
		
		
		JTextArea sub = new JTextArea();
		sub.setFont(new Font("Segoe UI", Font.PLAIN, 37));
		sub.setBounds(280, 119, 688, 80);
		contentPane.add(sub);
		
		JLabel label = new JLabel("Faculty Name");
		label.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		label.setBounds(32, 26, 285, 81);
		contentPane.add(label);
		
		JTextArea idd = new JTextArea();
		idd.setFont(new Font("Segoe UI", Font.PLAIN, 38));
		idd.setBounds(280, 212, 688, 81);
		contentPane.add(idd);
		
		JLabel label_1 = new JLabel("Subject/ Dept.");
		label_1.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		label_1.setBounds(32, 130, 285, 81);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Faculty ID.\r\n\r\n");
		label_2.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		label_2.setBounds(32, 212, 285, 81);
		contentPane.add(label_2);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			/* (non-Javadoc)
			 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
			 */
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(btnNewButton,"Are you sure?");
				//JOptionPane.setRootFrame(null);
				if(a==JOptionPane.YES_OPTION){
					
					String name1=nm.getText();
					String sub1=sub.getText();
					int j=0;
				String id1=idd.getText();
					try{
						System.out.println("add");
						
						Class.forName("com.mysql.jdbc.Driver");
						
						Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
						
						PreparedStatement st=(PreparedStatement) con.prepareStatement("INSERT INTO facult(name,user,sub,pass) values(?,?,?,?)");

						st.setString(1, name1);
						st.setString(2, id1);
						st.setString(3, sub1);
						st.setString(4, "UEMK");
						
						
						j=st.executeUpdate();
						
					}
					catch(Exception w1)
					{
					System.out.println(w1);	
					}
					
					int i = 0;
					if(j==1)
					{
						String n="\n";
						
						
						JOptionPane.showMessageDialog(btnNewButton,"Congratulations,"+n+"Student is added sucessfully"+n+"Thankyou.");
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