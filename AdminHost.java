package Textbook_selling_system;
/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTree;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JEditorPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;

public class AdminHost extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHost frame = new AdminHost();
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
	public AdminHost() {

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
		
		JMenuItem mntmAddOldBooks = new JMenuItem("Add Old Books");
		mntmAddOldBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_old_books obj=new Add_old_books();
				obj.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmAddOldBooks);
		
		JMenuItem mntmAddNewBooks = new JMenuItem("Add New Books");
		mntmAddNewBooks.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Add_new_books obj=new Add_new_books();
			obj.setVisible(true);
		}
	});
		mnNewMenu_1.add(mntmAddNewBooks);
		
		JMenu menu = new JMenu("Manage");
		menuBar.add(menu);
		
		
		
		JMenu mnNewMenu_2 = new JMenu("Orders");
		menu.add(mnNewMenu_2);
		
		JMenuItem menuItem1 = new JMenuItem("Show Orders");
		mnNewMenu_2.add(menuItem1);
		
		JMenuItem menuItem2 = new JMenuItem("Manage Orders");
		mnNewMenu_2.add(menuItem2);
		
		JMenu mnNewMenu_3 = new JMenu("User/Admin");
		menu.add(mnNewMenu_3);
		
		
		JMenuItem menuItem_1 = new JMenuItem("Manage Users");
		mnNewMenu_3.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("Manage Admins");
		mnNewMenu_3.add(menuItem_2);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(btnNewButton,"Are you sure?");
				//JOptionPane.setRootFrame(null);
				if(a==JOptionPane.YES_OPTION){
						
				dispose();
				Main_screen ms=new Main_screen();
				ms.setTitle("Book Hub");
				ms.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(899, 39, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton add = new JButton("Add old books");
		add.setFont(new Font("Tahoma", Font.PLAIN, 29));
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_old_books obj=new Add_old_books();
				obj.setVisible(true);
			}
		});
		add.setBounds(46, 197, 264, 118);
		contentPane.add(add);
		
		JButton btnNewButton_1 = new JButton("Add new Books");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_new_books obj=new Add_new_books();
				obj.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(374, 197,264, 118);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("Show orders");
		button.setFont(new Font("Tahoma", Font.PLAIN, 29));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Show_bookings obj=new Show_bookings();
				obj.setVisible(true);
			}
		});
		button.setBounds(699, 197, 264, 118);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Manage users");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		button_1.setBounds(374, 366, 264, 118);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Manage Orders");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(46, 366, 264, 118);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Manage Admin");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 29));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(699, 366, 264, 118);
		contentPane.add(button_3);
		
		JMenu mnNewMenu = new JMenu("New menu");
		mnNewMenu.setBounds(0, 39, 58, -32);
		contentPane.add(mnNewMenu);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Soumyadeep\\Desktop\\Book Hub\\37467261-books-wallpaper (Custom).jpg"));
		label.setBounds(0, 26, 1008, 536);
		contentPane.add(label);

	
		
		
	
		
		
		
	
	}
}
