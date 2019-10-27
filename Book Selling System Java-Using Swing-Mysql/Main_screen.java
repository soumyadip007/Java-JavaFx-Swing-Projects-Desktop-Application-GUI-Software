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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main_screen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

//	MainScreen frame;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Main_screen frame = new Main_screen();
					frame.setTitle("");
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
	public Main_screen() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\Book Hub\\0 (Custom).jpg"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		setResizable(false);
		//contentPane.setTitle();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Hub");
		lblNewLabel.setBackground(new Color(255, 200, 0));
		lblNewLabel.setForeground(new Color(204, 255, 0));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		lblNewLabel.setBounds(54, 0, 230, 98);
		contentPane.add(lblNewLabel);
		
		JButton AdminBtn = new JButton("Admin Login");
		AdminBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		AdminBtn.setFont(new Font("Tahoma", Font.PLAIN, 32));
		AdminBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminLogin ad=new AdminLogin();
				ad.setTitle("Book Hub");
				ad.setVisible(true);
			}
		});
		AdminBtn.setBounds(128, 245, 243, 93);
		contentPane.add(AdminBtn);
		
		JButton UserBtn = new JButton("User Login");
		
		UserBtn.setFont(new Font("Tahoma", Font.PLAIN, 32));
		UserBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Userlogin ad=new Userlogin();
				ad.setTitle("Book Hub");
				ad.setVisible(true);
			}
		});
		UserBtn.setBounds(647, 245, 243, 93);
		contentPane.add(UserBtn);
		
		
		
		JLabel lblBuySellRecycle = new JLabel("Buy Sell Recycle");
		lblBuySellRecycle.setForeground(new Color(255, 255, 204));
		lblBuySellRecycle.setFont(new Font("Sylfaen", Font.PLAIN, 28));
		lblBuySellRecycle.setBounds(136, 52, 431, 86);
		contentPane.add(lblBuySellRecycle);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Soumyadeep\\Desktop\\Book Hub\\0 (Custom).jpg"));
		lblNewLabel_1.setBounds(0, 0, 1008, 562);
		contentPane.add(lblNewLabel_1);
	
	}
}