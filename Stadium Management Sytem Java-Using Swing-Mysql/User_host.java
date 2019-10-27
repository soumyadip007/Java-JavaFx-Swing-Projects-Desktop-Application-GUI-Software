package Stedium_Management;
/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
import java.util.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.InetAddress;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JSplitPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class User_host extends JFrame {

	private JPanel contentPane;
	JButton btnLogout ;
	private String date;
	private JComboBox seatcb;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_host frame = new User_host();
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
	public User_host() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\STDM.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(btnLogout,"Are you sure?");
				if(a==JOptionPane.YES_OPTION){
					dispose();
				MainScreen ms=new MainScreen();
				ms.setTitle("Stadium Management System");
				ms.setVisible(true);
				}
			}
		});
		btnLogout.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnLogout.setBounds(901, 13, 97, 25);
		contentPane.add(btnLogout);
		
		JLabel lblNewLabel = new JLabel("Event");
		JComboBox<String> tktcb = new JComboBox();
		JLabel lblNewLabel_1 = new JLabel("Ticket");
		JComboBox<String> eventcb = new JComboBox();
		JComboBox<String> seatcb = new JComboBox();
		JLabel lblSeat = new JLabel("Seat");
		JComboBox agecb = new JComboBox();
		JLabel lblNewLabel_2 = new JLabel("Age");
		JCheckBox chckbxTcApplied = new JCheckBox("I agree to the terms and conditions");
		JButton btnNewButton = new JButton("Process");
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 28));

		JLabel lblPromo = new JLabel("Promo");
		lblPromo.setEnabled(false);
		JTextArea textArea = new JTextArea();
		textArea.setEnabled(false);
		
		JComboBox<String> datecb = new JComboBox();
		datecb.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		datecb.setSelectedItem(null);
		//datecb.setSelectedIndex(-1);
		datecb.addItem("(none)");
		datecb.addItem("02-07-2018");
		datecb.addItem("05-07-2018");
		datecb.addItem("07-07-2018");
		datecb.addItem("09-07-2018");
		datecb.addItem("11-07-2018");
		datecb.addItem("19-07-2018");
		datecb.addItem("23-07-2018");
		datecb.addItem("27-07-2018");
		datecb.addItem("29-07-2018");
		datecb.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e)
			{
				if((date=datecb.getItemAt(datecb.getSelectedIndex()))!=null)
				{
					eventcb.setEnabled(true);
					lblNewLabel.setEnabled(true);
					tktcb.setEnabled(true);
					lblNewLabel_1.setEnabled(true);
					seatcb.setEnabled(true);
					lblSeat.setEnabled(true);
					agecb.setEnabled(true);
					lblNewLabel_2.setEnabled(true);
					chckbxTcApplied.setEnabled(true);
					lblPromo.setEnabled(true);
					textArea.setEnabled(true);

				}
				else if((date=datecb.getItemAt(datecb.getSelectedIndex()))!="none")
				{
					eventcb.setEnabled(false);
					lblNewLabel.setEnabled(false);

				}
			}
			});
		datecb.setBounds(139, 85, 166, 37);
		contentPane.add(datecb);
		
		eventcb.setEnabled(false);
		eventcb.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		eventcb.addItem("IND vs SL");
		eventcb.addItem("KKR vs CSK");
		eventcb.addItem("KKR vs RCB");
		eventcb.addItem("KKR vs DD");
		eventcb.addItem("IND vs AUS");
		eventcb.addItem("KKR vs RR");
		eventcb.setBounds(451, 85,  166, 37);
		contentPane.add(eventcb);
		
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblDate.setBounds(74, 87, 43, 28);
		contentPane.add(lblDate);
		
		JLabel lblHi = new JLabel("Welcome");
		lblHi.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 18));
		lblHi.setBounds(45, 14, 85, 24);
		contentPane.add(lblHi);
		
		
		
		
		lblNewLabel.setEnabled(false);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel.setBounds(383, 94, 56, 16);
		contentPane.add(lblNewLabel);
		
		
		lblSeat.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblSeat.setEnabled(false);
		lblSeat.setBounds(74, 184,56, 22);
		contentPane.add(lblSeat);
		

		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBounds(383, 184, 56, 22);
		contentPane.add(lblNewLabel_1);
		
		
		seatcb.setEnabled(false);
		seatcb.setBounds(139, 174, 166, 37);
		seatcb.addItem("Regular (500 Onwards)");
		seatcb.addItem("Upper Tire (800 Onwards)");
		seatcb.addItem("Dress Cycle (1,550 Onwards)");
		seatcb.addItem("Premimum (2,450 Onwards)");
		seatcb.addItem("VIP Box (5,500 Onwards)");
		
		
		seatcb.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		contentPane.add(seatcb);
		
		
		tktcb.setEnabled(false);
		tktcb.addItem("1");
		tktcb.addItem("2");
		tktcb.addItem("3");
		tktcb.addItem("4");
		tktcb.addItem("5");
		tktcb.addItem("10");
		tktcb.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		tktcb.setBounds(451, 178,  166, 37);
		contentPane.add(tktcb);
		
	
		agecb.setEnabled(false);
		agecb.addItem("Above 15 years");
		agecb.addItem("Below 15 years");
		agecb.addItem("Below 3 years");
		
		agecb.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		agecb.setBounds(139, 273, 166, 37);
		contentPane.add(agecb);
		
	
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));

		lblNewLabel_2.setEnabled(false);
		lblNewLabel_2.setBounds(74, 271, 43, 37);
		contentPane.add(lblNewLabel_2);
		
		
		chckbxTcApplied.setEnabled(false);
		chckbxTcApplied.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		chckbxTcApplied.setBounds(285, 367, 266, 25);
		contentPane.add(chckbxTcApplied);
		chckbxTcApplied.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e)
			{
				if(e.getStateChange()==1)
					btnNewButton.setEnabled(true);
				else
					btnNewButton.setEnabled(false);
			}
			});
		
		
		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(797, 83, 201, 37);
		
		
		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(797, 111, 201, 37);
	
		contentPane.add(lblNewLabel_3);
		contentPane.add(lblNewLabel_4);
		
		
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(btnNewButton,"Are you sure?");
				//JOptionPane.setRootFrame(null);
				if(a==JOptionPane.YES_OPTION){
					
					
					String promo=textArea.getText();
					String tkt=tktcb.getItemAt(tktcb.getSelectedIndex());
					String date=datecb.getItemAt(datecb.getSelectedIndex());
					String event=eventcb.getItemAt(eventcb.getSelectedIndex());
					String age=(String) agecb.getItemAt(agecb.getSelectedIndex());
					String seatb= seatcb.getItemAt(seatcb.getSelectedIndex());
					Random rand=new Random();
					
					int i=rand.nextInt(9999999);
					String tktno=String.valueOf(i);
					tktno+="\n";
					String n="\n";
					seatb+=")\n";

					
					lblNewLabel_3.setText("Your ticket no is:-");
					lblNewLabel_4.setText(tktno);
					JOptionPane.showMessageDialog(btnNewButton,"Congratulations,"+n+"Your booking is confirmed"+n+"Your ticket no. is "+tktno+"( "+tkt+ " of "+seatb+"Thankyou.");
					
					
				}
			}
		});
		btnNewButton.setBounds(311, 424, 200, 60);
		contentPane.add(btnNewButton);
		
		
		
		lblPromo.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblPromo.setBounds(383, 285, 70, 25);
		contentPane.add(lblPromo);
		
		textArea.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		textArea.setBounds(451, 279, 166, 37);
		contentPane.add(textArea);
		
		JLabel ipfld = new JLabel("");
		ipfld.setBounds(862, 51, 201, 37);
		String ipa="";
		try{
			InetAddress ip=InetAddress.getLocalHost();
			ipa+=ip.getHostAddress();
		}
		catch(Exception e){
			System.out.println(e);
		}
		ipfld.setText(ipa);
		ipfld.setFont(new Font("Segoe UI", Font.BOLD, 20));
		contentPane.add(ipfld);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Soumyadeep\\Desktop\\blue-sky-dsc03155-wp.jpg"));
		label.setBounds(0, 0, 1031, 562);
		contentPane.add(label);
		
		
	
	
		
	}
}
