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

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Admin_host extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_host frame = new Admin_host();
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
	public Admin_host() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\STDM.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		//setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1010, 26);
		contentPane.add(menuBar);
		
		JMenu mnAddEvents = new JMenu("Add events");
		mnAddEvents.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnAddEvents);
		
		JMenu mnNewMenu = new JMenu("Add Cricket");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnAddEvents.add(mnNewMenu);
		
		JMenuItem mntmAddOdi = new JMenuItem("Add ODI");
		mntmAddOdi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_events ae=new Add_events();
				setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\STDM.jpg"));
				ae.setTitle("Add_events");
				ae.setVisible(true);
			}
		});
		mnNewMenu.add(mntmAddOdi);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Add Test");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_events ae=new Add_events();
				setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\STDM.jpg"));
				ae.setTitle("Add_events");
				ae.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmAddT = new JMenuItem("Add T20");
		mntmAddT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_events ae=new Add_events();
				setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\STDM.jpg"));
				ae.setTitle("Add_events");
				ae.setVisible(true);
			}
		});
		mnNewMenu.add(mntmAddT);
		
		JMenuItem mntmAddRanji = new JMenuItem("Add Ranji");
		mntmAddRanji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_events ae=new Add_events();
				ae.setVisible(true);
			}
		});
		mnNewMenu.add(mntmAddRanji);
		
		JMenuItem mntmAddFootball = new JMenuItem("Add Football");
		mntmAddFootball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_events ae=new Add_events();
				ae.setVisible(true);
			}
		});
		mntmAddFootball.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnAddEvents.add(mntmAddFootball);
		
		JMenuItem mntmAddOthers = new JMenuItem("Add Others");
		mntmAddOthers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_events ae=new Add_events();
				ae.setVisible(true);
			}
		});
		mntmAddOthers.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnAddEvents.add(mntmAddOthers);
		
		JMenu mnShowBookings = new JMenu("Show bookings");
		mnShowBookings.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnShowBookings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuBar.add(mnShowBookings);
		
		JMenu mnManageBookings = new JMenu("Manage bookings");
		mnManageBookings.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnManageBookings);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(btnLogout,"Are you sure?");
				//JOptionPane.setRootFrame(null);
				if(a==JOptionPane.YES_OPTION){
				dispose();
				MainScreen ms=new MainScreen();
				ms.setTitle("Stadium Management System");
				ms.setVisible(true);
				}
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogout.setBounds(887, 40, 97, 25);
		contentPane.add(btnLogout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Soumyadeep\\Desktop\\REDSTD!.jpeg"));
		lblNewLabel.setBounds(0, 25, 1010, 574);
		contentPane.add(lblNewLabel);
		
	}
}
