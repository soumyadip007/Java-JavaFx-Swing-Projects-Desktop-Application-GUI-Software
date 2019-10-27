package Textbook_selling_system;
/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class UserHost extends JFrame {

	private JPanel contentPane;
	private JTable table;

	
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				UserHost frame = new UserHost();
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
	public UserHost() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\Book Hub\\0 (Custom).jpg"));
		
		
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JMenuItem mntmAddOldBooks = new JMenuItem("Buy Books");
		mntmAddOldBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuyBooks obj=new BuyBooks();
				obj.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmAddOldBooks);
		
		JMenuItem mntmAddNewBooks = new JMenuItem("Recycle your books");
		mntmAddNewBooks.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Add_old_books obj=new Add_old_books();
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
		
		JButton add = new JButton("Buy Books");
		add.setFont(new Font("Tahoma", Font.PLAIN, 29));
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuyBooks obj=new BuyBooks();
				obj.setVisible(true);
			}
		});
		add.setBounds(46, 197, 264, 118);
		contentPane.add(add);
		JButton btnNewButton_1 = new JButton("Recycle Books ");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_old_books obj=new Add_old_books();
				obj.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(374, 197,264, 118);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("History");
		button.setFont(new Font("Tahoma", Font.PLAIN, 29));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuyBooks obj=new BuyBooks();
				obj.setVisible(true);
			}
		});
		button.setBounds(699, 197, 264, 118);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Request");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Request obj=new Request();
				obj.setVisible(true);
			}
		});
		button_1.setBounds(237, 366, 264, 118);
		contentPane.add(button_1);
		
		JButton button_3 = new JButton("Connect us");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 29));
		button_3.setBounds(550, 366, 264, 118);
		contentPane.add(button_3);
		
		JLabel lblNewLabel = new JLabel("Book Hub");
		lblNewLabel.setBackground(new Color(255, 200, 0));
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		lblNewLabel.setBounds(24, 25, 230, 98);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblBuySellRecycle = new JLabel("Buy Sell Recycle");
		lblBuySellRecycle.setForeground(new Color(255, 255, 204));
		lblBuySellRecycle.setFont(new Font("Sylfaen", Font.PLAIN, 28));
		lblBuySellRecycle.setBounds(99, 84, 431, 86);
		contentPane.add(lblBuySellRecycle);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Soumyadeep\\Desktop\\Book Hub\\why-you-should-read-and-re-read-these-high-school-books-as-an-adult (Custom) (Custom).jpeg"));
		label.setBounds(0, 25, 1008, 537);
		contentPane.add(label);
		
		
	}
}
