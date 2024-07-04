package com.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.text.JTextComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double ans,num;
	int calculation;
	
	public void arithmetic_Operation() {
		
		switch(calculation) {
		case 1: // Addition
			ans=num+Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
			
		case 2: // Subtraction
			ans=num-Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 3: // Multiplication
			ans=num*Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 4: // Division
			ans=num/Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
			
		}
	}
	
	public static void main(String[] args) {
		try {
            //here you can put the selected theme class name in JTattoo
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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

	
	public Calculator() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setForeground(new Color(100, 149, 237));
		frame.setBounds(100, 100, 572, 577);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setBounds(37, 47, 509, 60);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		
		JLabel myLabel = new JLabel("");
		myLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		myLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		myLabel.setBounds(441, 10, 105, 27);
		frame.getContentPane().add(myLabel);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(51, 139, 85, 53);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(172, 139, 85, 53);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(306, 139, 85, 53);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num= Double.parseDouble(textField.getText());
				calculation=1;
				myLabel.setText(textField.getText()+"+");
				textField.setText("");
				
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(442, 139, 85, 53);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4.setBounds(51, 232, 85, 53);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("7");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5.setBounds(51, 316, 85, 53);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnClear = new JButton(".");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setBounds(51, 397, 85, 53);
		frame.getContentPane().add(btnClear);
		
		JButton btnNewButton_7 = new JButton("5");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_7.setBounds(172, 232, 85, 53);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_8.setBounds(172, 316, 85, 53);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_10 = new JButton("6");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_10.setBounds(306, 232, 85, 53);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("9");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_11.setBounds(306, 316, 85, 53);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnResult = new JButton("0");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		btnResult.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnResult.setBounds(172, 397, 85, 53);
		frame.getContentPane().add(btnResult);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num= Double.parseDouble(textField.getText());
				calculation=2;
				myLabel.setText(textField.getText()+"-");
				textField.setText("");
				
				
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_13.setBounds(442, 232, 85, 53);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("*");
		btnNewButton_14.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				num= Double.parseDouble(textField.getText());
				calculation=3;
				myLabel.setText(textField.getText()+"*");
				textField.setText("");
				
				
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_14.setBounds(442, 316, 85, 53);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_8_1 = new JButton("BACK");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length = textField.getText().length();
				int number= textField.getText().length()-1;
				String store;
				if(length>0) {
				StringBuilder sb = new StringBuilder(textField.getText());
				sb.deleteCharAt(number);
				store=sb.toString();
				textField.setText(store);
				}
			}
		});
		btnNewButton_8_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_8_1.setBounds(306, 397, 85, 53);
		frame.getContentPane().add(btnNewButton_8_1);
		
		JButton btnNewButton_8_2 = new JButton("/");
		btnNewButton_8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num= Double.parseDouble(textField.getText());
				calculation=4;
				myLabel.setText(textField.getText()+"/");
				textField.setText("");
				
				
			}
		});
		btnNewButton_8_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_8_2.setBounds(442, 397, 85, 53);
		frame.getContentPane().add(btnNewButton_8_2);
		
		JButton btnNewButton_8_3 = new JButton("CLEAR");
		btnNewButton_8_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				myLabel.setText("");
			}
		});
		btnNewButton_8_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_8_3.setBounds(51, 472, 206, 53);
		frame.getContentPane().add(btnNewButton_8_3);
		
		JButton btnNewButton_8_4 = new JButton("RESULT");
		btnNewButton_8_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic_Operation();
				myLabel.setText("");

			}
		});
		btnNewButton_8_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_8_4.setBounds(306, 472, 221, 53);
		frame.getContentPane().add(btnNewButton_8_4);
	}
}
