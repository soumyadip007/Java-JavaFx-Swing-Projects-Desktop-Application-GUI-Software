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

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Request extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Request frame = new Request();
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
	public Request() {
		setBounds(450, 319, 1014, 460);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textArea.setBounds(12, 66, 984, 276);
		contentPane.add(textArea);
	
		JLabel lblNewLabel = new JLabel("Enter your Email :-");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel.setBounds(12, 13, 168, 39);
		contentPane.add(lblNewLabel);
		
		
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textField.setBounds(192, 13, 423, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnRequest = new JButton("Request");
		btnRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email=textField.getText();
				String complain=textArea.getText();
				
				
				Random rand=new Random();
				int i=rand.nextInt(9999999);
				String tktno=String.valueOf(i);
				tktno+="\n";
				String n="\n";
				//seatb+=")\n";

				String id=String.valueOf(i);

				JOptionPane.showMessageDialog(btnRequest,"Congratulations,"+n+"We have recived your request"+n+"We'll contact to you within 24 working hrs"+n+"Your Request id is"+i+n+"Thankyou.");
				
			}
		});
		btnRequest.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		btnRequest.setBounds(405, 355, 259, 57);
		contentPane.add(btnRequest);
	}
}