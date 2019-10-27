package Stedium_Management;

/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.xdevapi.Statement;

import Hariom.Connection;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Add_events extends JFrame {

	private JPanel contentPane;
	private JTextField textPromo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_events frame = new Add_events();
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
	public Add_events() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\STDM.jpg"));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(458, 319, 1000, 460);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Date");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel.setBounds(104, 79, 53, 29);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		///textArea.setText("DD-MM-YY");
		textArea.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textArea.setBounds(169, 78,166, 37);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("Events");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(584, 76, 56, 34);
		contentPane.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_2 = new JLabel("(dd-mm-yy)");
		lblNewLabel_2.setBounds(93, 111, 68, 16);
		contentPane.add(lblNewLabel_2);
		
		JTextArea textEvents = new JTextArea();
		textEvents.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textEvents.setBounds(657, 78,166, 37);
		contentPane.add(textEvents);
		
		JLabel lblSeats = new JLabel("Seats");
		lblSeats.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblSeats.setBounds(104, 196, 56, 36);
		contentPane.add(lblSeats);
		
		JTextArea textSeats = new JTextArea();
		textSeats.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textSeats.setBounds(169, 196, 166, 37);
		contentPane.add(textSeats);
		
		JTextArea textTime = new JTextArea();
		textTime.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textTime.setBounds(657, 199, 166, 37);
		contentPane.add(textTime);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblTime.setBounds(584, 200, 56, 29);
		contentPane.add(lblTime);
		
		JRadioButton rdbtnAddPromo = new JRadioButton("Add promo");
		rdbtnAddPromo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnAddPromo.isSelected())
				{
					textPromo.setEnabled(true);
				}
				else
				{
					textPromo.setEnabled(false);
				}
				
			}
		});
		rdbtnAddPromo.setBounds(412, 226, 127, 25);
		contentPane.add(rdbtnAddPromo);
		
		textPromo = new JTextField();
		textPromo.setEnabled(false);
		textPromo.setBounds(412, 254, 116, 29);
		//textField.setEnabled(false);
		contentPane.add(textPromo);
		textPromo.setColumns(10);
		
		JButton btnNewButton = new JButton("Add\r\n\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(btnNewButton,"Are you sure?");
				//JOptionPane.setRootFrame(null);
				if(a==JOptionPane.YES_OPTION){
					String date=textArea.getText();
					String seats=textSeats.getText();
					String time=textTime.getText();
					String event=textEvents.getText();
					if(rdbtnAddPromo.isSelected())
					{
						String promo=textPromo.getText();
					}	
					
	/*				try{
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con=(Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","soumya","1234");
						String query="select date yo event ";
						Statement st=con.createStatement();
						int x=st.executeUpdate(query);
						
						con.close();
					}
					catch(Exception f)
					{
						System.out.println(f);
					}	
					JOptionPane.showMessageDialog(btnNewButton, "Event is successfully added");
					//System.exit(0);*/
				}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		btnNewButton.setBounds(412, 309, 127, 61);
		contentPane.add(btnNewButton);
	}
}

