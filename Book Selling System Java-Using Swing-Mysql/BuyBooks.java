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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BuyBooks extends JFrame {

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuyBooks frame = new BuyBooks();
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
	public BuyBooks() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\Book Hub\\0 (Custom).jpg"));
		
		setBounds(450, 319, 1014, 460);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String col[]={"Book name","Price","Writter"};
		String data[][]={{"Eng","AAA","S.C"}};
		
		JTable table = new JTable(data,col);
	DefaultTableModel md=new DefaultTableModel();
		md.setColumnIdentifiers(col);
		
		table.setModel(md);
		
		table.setBounds(0, 0, 1008, 303);
		table.setFillsViewportHeight(true);
		contentPane.add(table);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(157, 193, 146, 14);
		contentPane.add(progressBar);
		
		JButton btnNewButton = new JButton("Buy");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Address obj=new Address();
				obj.setVisible(true);
				
				//contentPane.add(obj);
			//	JOptionPane.showMessageDialog(btnNewButton, "Co;
			}
		});
		btnNewButton.setBounds(430, 316, 168, 96);
		contentPane.add(btnNewButton);
	}
}