package Project;
/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
import java.awt.EventQueue;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;
public class Calculator {

	public JFrame frame;
	public JTextField textField;
	public double first,second,result;
	String answer,operation;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame("Calculator");
		
		frame.setSize(376, 576);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField.setBounds(12, 13, 348, 82);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		ButtonGroup btg=new ButtonGroup();
		JRadioButton rdbtnNewRadioButton = new JRadioButton("On");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnNewRadioButton.setBounds(12, 108, 74, 32);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Off");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnNewRadioButton_1.setBounds(12, 145, 74, 32);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		btg.add(rdbtnNewRadioButton);
		btg.add(rdbtnNewRadioButton_1);
		
		
		JButton bspc = new JButton("<-");
		bspc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String bsp;
					if(textField.getText().length()>0)
					{
						StringBuilder obj=new StringBuilder(textField.getText());
						obj.deleteCharAt(textField.getText().length()-1);
						bsp=obj.toString();
						textField.setText(bsp);
					}
					
					} catch (Exception e1) {
				
				}
			}
		});
		bspc.setFont(new Font("Tahoma", Font.BOLD, 22));
		bspc.setForeground(new Color(0, 0, 0));
		bspc.setBounds(94, 108, 72, 69);
		frame.getContentPane().add(bspc);
		
		JButton bc = new JButton("C");
		bc.setFont(new Font("Tahoma", Font.BOLD, 22));
		bc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		bc.setBounds(178, 108, 85, 69);
		frame.getContentPane().add(bc);
		

		JButton bplus = new JButton("+");
		bplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					first=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="+";
					} catch (Exception e1) {
				
				}
				}
		});
		bplus.setFont(new Font("Tahoma", Font.BOLD, 22));
		bplus.setBounds(275, 108, 85, 69);
		frame.getContentPane().add(bplus);
	
		
		////////////////ROW/////////////////////////
		
		
	
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+b7.getText();
				textField.setText(num);
			}
		});
		b7.setFont(new Font("Tahoma", Font.BOLD, 22));
		b7.setBounds(12, 190, 85, 75);
		frame.getContentPane().add(b7);
		
		
		JButton b8 = new JButton();
		b8.setText("8");
		b8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String num=textField.getText()+b8.getText();
					textField.setText(num);
				}
		});
		b8.setFont(new Font("Tahoma", Font.BOLD, 22));
		b8.setBounds(108, 190, 85, 75);
		frame.getContentPane().add(b8);
		
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+b9.getText();
				textField.setText(num);
			}
		});
		b9.setFont(new Font("Tahoma", Font.BOLD, 22));
		b9.setBounds(205, 190, 85, 75);
		frame.getContentPane().add(b9);
		
		
		JButton bmin = new JButton("-");
		bmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					first=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="-";
					} catch (Exception e1) {
				
				}
				}
		});
		bmin.setFont(new Font("Tahoma", Font.BOLD, 22));
		bmin.setBounds(297, 190, 63, 75);
		frame.getContentPane().add(bmin);
		
		/////////////////////Row 3/////////////////////
		

		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+b4.getText();
				textField.setText(num);
			}
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 22));
		b4.setBounds(12, 278, 85, 75);
		frame.getContentPane().add(b4);
		
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+b5.getText();
				textField.setText(num);
			}
		});
		b5.setFont(new Font("Tahoma", Font.BOLD, 22));
		b5.setBounds(108, 278, 85, 75);
		frame.getContentPane().add(b5);
		
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+b6.getText();
				textField.setText(num);
			}
		});
		b6.setFont(new Font("Tahoma", Font.BOLD, 22));
		b6.setBounds(205, 278, 85, 75);
		frame.getContentPane().add(b6);
		
		
		JButton bx = new JButton("x");
		bx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					first=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="x";
					} catch (Exception e1) {
				
				}
				}
		});
		bx.setFont(new Font("Tahoma", Font.BOLD, 22));
		bx.setBounds(297, 278, 63, 75);
		frame.getContentPane().add(bx);
		
		//////////////////////Row 4
		


		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+b1.getText();
				textField.setText(num);
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 22));
		b1.setBounds(12, 366, 85, 75);
		frame.getContentPane().add(b1);
		
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+b2.getText();
				textField.setText(num);
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 22));
		b2.setBounds(108, 366, 85, 75);
		frame.getContentPane().add(b2);
		
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String num=textField.getText()+b3.getText();
			textField.setText(num);			
			}
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 22));
		b3.setBounds(205, 366, 85, 75);
		frame.getContentPane().add(b3);
		
	
		JButton bd = new JButton("/");
		bd.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					first=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="/";
					} catch (Exception e1) {
				
				}
				}
		});
		bd.setFont(new Font("Tahoma", Font.BOLD, 22));
		bd.setBounds(297, 366, 63, 75);
		frame.getContentPane().add(bd);

		//////////////////////ROW 5///////////////////////////////////////////////////////
		

		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+b0.getText();
				textField.setText(num);	
				
			}
		});
		b0.setFont(new Font("Tahoma", Font.BOLD, 22));
		b0.setBounds(12, 454, 56, 75);
		frame.getContentPane().add(b0);
		
		
		JButton bp = new JButton("%");
		bp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					first=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="%";
					} catch (Exception e1) {
					}
			}
		});
		bp.setFont(new Font("Tahoma", Font.BOLD, 28));
		bp.setBounds(149, 454, 74, 75);
		frame.getContentPane().add(bp);
		
		
		JButton btnNewButton = new JButton(".");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String num=textField.getText()+btnNewButton.getText();
					textField.setText(num);	
					
					} catch (Exception e1) {
					}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnNewButton.setBounds(81, 454, 56, 75);
		frame.getContentPane().add(btnNewButton);
		
		
		
		JButton beql = new JButton("=");
		beql.setFont(new Font("Tahoma", Font.BOLD, 28));
		beql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					second=Double.parseDouble(textField.getText());
					switch(operation)
					{
						case "+":
							result=first+second;
							answer=String.format("%.2f",result);
							textField.setText(answer);	
							break;
						case "-":
							result=first-second;
							answer=String.format("%.2f",result);
							textField.setText(answer);	
							break;
						case "x":
							result=first*second;
							answer=String.format("%.2f",result);
							textField.setText(answer);	
							break;
						case "/":
							result=first/second;
							answer=String.format("%.2f",result);
							textField.setText(answer);	
							break;
						case "%":
							result=first%second;
							answer=String.format("%.2f",result);
							textField.setText(answer);	
							break;
					}
				}
				catch(Exception e1){
					
				}
				
			}
		});
		beql.setBounds(236, 454, 124, 75);
		frame.getContentPane().add(beql);
		
		
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnNewRadioButton.setEnabled(false);
				rdbtnNewRadioButton_1.setEnabled(true);
				textField.setEnabled(true);
				b1.setEnabled(true);
				b2.setEnabled(true);
				b3.setEnabled(true);
				b4.setEnabled(true);
				b5.setEnabled(true);
				b6.setEnabled(true);
				b7.setEnabled(true);
				b8.setEnabled(true);
				b9.setEnabled(true);
				b0.setEnabled(true);
				bspc.setEnabled(true);
				bplus.setEnabled(true);
				bmin.setEnabled(true);
				bx.setEnabled(true);
				bd.setEnabled(true);
				beql.setEnabled(true);
				bc.setEnabled(true);
				bp.setEnabled(true);
				btnNewButton.setEnabled(true);
			}
		});
		
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnNewRadioButton.setEnabled(true);
				rdbtnNewRadioButton_1.setEnabled(false);
				textField.setEnabled(false);
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				b0.setEnabled(false);
				bspc.setEnabled(false);
				bplus.setEnabled(false);
				bmin.setEnabled(false);
				bx.setEnabled(false);
				bd.setEnabled(false);
				beql.setEnabled(false);
				bc.setEnabled(false);
				bp.setEnabled(false);
				btnNewButton.setEnabled(false);
			}
		});
	}	
}