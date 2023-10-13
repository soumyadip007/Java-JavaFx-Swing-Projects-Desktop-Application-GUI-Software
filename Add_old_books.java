package Textbook_selling_system;
/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add_old_books extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_old_books frame = new Add_old_books();
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
	public Add_old_books() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\Book Hub\\0 (Custom).jpg"));
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 319, 1014, 460);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book's name :- ");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel.setBounds(59, 25, 145, 32);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("Writer's name :- ");
		label.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		label.setBounds(59, 101, 145, 32);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Condition :- ");
		label_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		label_1.setBounds(59, 184, 145, 32);
		contentPane.add(label_1);
		
		JTextArea bkname = new JTextArea();
		bkname.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		bkname.setBounds(235, 26, 166, 37);
		contentPane.add(bkname);
		
		JTextArea wrtrname = new JTextArea();
		wrtrname.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		wrtrname.setBounds(235, 102, 166, 37);
		contentPane.add(wrtrname);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton(" Old");
		rdbtnNewRadioButton.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setEnabled(false);
		rdbtnNewRadioButton.setBounds(235, 172, 75, 32);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton(" New");
		rdbtnNewRadioButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		rdbtnNewRadioButton_1.setSelected(false);
		rdbtnNewRadioButton_1.setEnabled(false);
		rdbtnNewRadioButton_1.setBounds(235, 213, 81, 26);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel label_2 = new JLabel(" Published Date :- ");
		label_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		label_2.setBounds(481, 25, 158, 32);
		contentPane.add(label_2);
		
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
		
		JLabel label_3 = new JLabel(" Subject's name :- ");
		label_3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		label_3.setBounds(481, 184, 158, 32);
		contentPane.add(label_3);
		
		JComboBox sub = new JComboBox();
		sub.setBounds(662, 188, 166, 32);
		sub.addItem("English");
		sub.addItem("Hindi");
		sub.addItem("Bengali");
		sub.addItem("Maths");
		sub.addItem("Physics");
		sub.addItem("Chemistry");
		sub.addItem("Biology");
		sub.addItem("Computer");
		sub.addItem("History");
		sub.addItem("Geography");
		sub.addItem("Others");
		contentPane.add(sub);
		
		JLabel label_4 = new JLabel(" Price (INR) :- ");
		label_4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		label_4.setBounds(481, 261, 145, 32);
		contentPane.add(label_4);
		
		JTextArea publs = new JTextArea();
		publs.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		publs.setBounds(662, 102, 166, 37);
		contentPane.add(publs);
		
		JLabel label_5 = new JLabel(" Publisher name :- ");
		label_5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		label_5.setBounds(481, 101, 169, 32);
		contentPane.add(label_5);
		
		JTextArea price = new JTextArea();
		price.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		price.setBounds(662, 262, 166, 37);
		contentPane.add(price);
		
		JLabel label_6 = new JLabel("Source :- ");
		label_6.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		label_6.setBounds(59, 261, 145, 32);
		contentPane.add(label_6);
		
		JTextArea src = new JTextArea();
		src.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		src.setBounds(235, 262, 166, 37);
		contentPane.add(src);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(btnNewButton,"Are you sure?");
				//JOptionPane.setRootFrame(null);
				if(a==JOptionPane.YES_OPTION){
				
					String name=bkname.getText();
					String writer= wrtrname.getText();
					String  condition="Old";
					String source=src.getText();
					String publisher=publs.getText();
					String subject= (String) sub.getSelectedItem();
					String prc=price.getText();
					String dt=(String) date.getSelectedItem();
					String mnth=(String) month.getSelectedItem();
					String yr=(String) year.getSelectedItem();
					
					if(name != "" && writer != "" && source != null && prc != null && publisher != null)
					{
						String n="\n";
						
						
						JOptionPane.showMessageDialog(btnNewButton,"Congratulations,"+n+"Book is added sucessfully"+n+"Thankyou.");
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
