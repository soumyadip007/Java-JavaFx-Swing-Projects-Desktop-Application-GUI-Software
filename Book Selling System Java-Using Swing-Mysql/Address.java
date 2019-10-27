package Textbook_selling_system;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.ScrollPane;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Address extends JFrame {

	private JPanel contentPane;
	public String name;
	public String pin;
	public String addl;
	public String landmark;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Address frame = new Address();
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
	public Address() {
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(650, 319, 514, 460);
	setResizable(false);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	

	JLabel name = new JLabel("Full Name :- ");
	name.setFont(new Font("Segoe UI", Font.PLAIN, 20));
	name.setBounds(26, 13, 117, 41);
	contentPane.add(name);
	
	JTextArea namet = new JTextArea();
	namet.setFont(new Font("Segoe UI", Font.PLAIN, 20));
	namet.setBounds(155, 15, 325, 39);
	contentPane.add(namet);
	
	JLabel label = new JLabel("Pincode :- ");
	label.setFont(new Font("Segoe UI", Font.PLAIN, 20));
	label.setBounds(26, 74, 117, 41);
	contentPane.add(label);
	
	JTextArea pint = new JTextArea();
	pint.setFont(new Font("Segoe UI", Font.PLAIN, 20));
	pint.setBounds(155, 79, 165, 41);
	contentPane.add(pint);
	
	JLabel label_1 = new JLabel("Address :- ");
	label_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
	label_1.setBounds(26, 150, 117, 41);
	contentPane.add(label_1);
	
	JEditorPane editorPane = new JEditorPane();
	editorPane.setBounds(155, 133, 325, 124);
	contentPane.add(editorPane);
	
	JLabel label_2 = new JLabel("Landmark :- ");
	label_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
	label_2.setBounds(26, 282, 117, 41);
	contentPane.add(label_2);
	
	JTextArea landmarkt = new JTextArea();
	landmarkt.setFont(new Font("Segoe UI", Font.PLAIN, 20));
	landmarkt.setBounds(155, 287, 165, 41);
	contentPane.add(landmarkt);
	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\Book Hub\\0 (Custom).jpg"));
	
	
	JButton btnAdd = new JButton("Add");
	btnAdd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		
			dispose();
			int a=JOptionPane.showConfirmDialog(btnAdd, "Are you ready to process your order?");
			if(a==JOptionPane.YES_OPTION)
			{
				String name=namet.getText();
				String pin=pint.getText();
				String add=editorPane.getText();
				String landmark=landmarkt.getText();
				
				
				Random rand=new Random();
				int i=rand.nextInt(9999999);
				String tktno=String.valueOf(i);
				tktno+="\n";
				String n="\n";
				//seatb+=")\n";

				String id=String.valueOf(i);
				
			
				JOptionPane.showMessageDialog(btnAdd,"Congratulations,"+n+"Your order is successfully placed"+n+"Your Order Id is "+i+n+"Thankyou.");
				
				
				//JOptionPane.showMessageDialog(btnAdd, "Cogratulations,Your order is successfully placed");
			}
		}
	});
	btnAdd.setBounds(148, 338, 172, 74);
	contentPane.add(btnAdd);
	}
}
