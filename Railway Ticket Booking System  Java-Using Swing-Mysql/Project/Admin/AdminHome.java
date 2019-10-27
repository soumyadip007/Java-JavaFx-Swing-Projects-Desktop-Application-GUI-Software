package Admin;

import java.awt.BorderLayout;

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
import java.awt.Color;
import javax.swing.UIManager;
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
		
		JMenuItem mntmAddOldBooks = new JMenuItem("AddAdmin Events\r\n");
		mntmAddOldBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add obj=new Add();
				obj.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmAddOldBooks);
		
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
		
		JButton btnAllEvents = new JButton("See All Bookings");
		btnAllEvents.setFont(new Font("Tahoma", Font.PLAIN, 65));
		btnAllEvents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home obj=new Home();
				obj.setVisible(true);
			}
		});
		btnAllEvents.setBounds(41, 88, 912, 236);
		contentPane.add(btnAllEvents);
		/**
		 * 
		 * @author Soumyadip Chowdhury
		 * @github soumyadip007
		 *
		 */	
		JButton btnAddFaculty = new JButton("Add Railway Manager");
		btnAddFaculty.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnAddFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddAdmin obj=new AddAdmin();
				obj.setVisible(true);
			}
		});
		btnAddFaculty.setBounds(41, 345, 912, 166);
		contentPane.add(btnAddFaculty);
		
		JMenu mnNewMenu = new JMenu("Search");
		mnNewMenu.setBounds(0, 39, 58, -32);
		contentPane.add(mnNewMenu);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.BLACK);
		label.setIcon(new ImageIcon("C:\\Users\\Soumyadeep\\Desktop\\Book Hub\\why-you-should-read-and-re-read-these-high-school-books-as-an-adult (Custom).jpeg"));
		label.setBounds(0, 26, 1008, 536);
		contentPane.add(label);	
	}
}