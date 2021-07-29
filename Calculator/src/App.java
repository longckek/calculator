import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private boolean newOperation = true;
	private float score = 0;
	private String operation = null;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		textField.setText("0");
		textField.setBounds(22, 20, 443, 62);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true) {
					textField.setText(btnNewButton.getText());
					newOperation = false;
				}else {
					String currentText = textField.getText();
					textField.setText(currentText + btnNewButton.getText());
				}
			}
		});
		btnNewButton.setBounds(22, 102, 76, 62);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true) {
					textField.setText(btnNewButton_1.getText());
					newOperation = false;
				}else {
					String currentText = textField.getText();
					textField.setText(currentText + btnNewButton_1.getText());
				}
			}
		});
		btnNewButton_1.setBounds(110, 102, 76, 62);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true) {
					textField.setText(btnNewButton_2.getText());
					newOperation = false;
				}else {
					String currentText = textField.getText();
					textField.setText(currentText + btnNewButton_2.getText());
				}
			}
		});
		btnNewButton_2.setBounds(198, 102, 76, 62);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true) {
					textField.setText(btnNewButton_3.getText());
					newOperation = false;
				}else {
					String currentText = textField.getText();
					textField.setText(currentText + btnNewButton_3.getText());
				}
			}
		});
		btnNewButton_3.setBounds(22, 190, 76, 62);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true) {
					textField.setText(btnNewButton_4.getText());
					newOperation = false;
				}else {
					String currentText = textField.getText();
					textField.setText(currentText + btnNewButton_4.getText());
				}
			}
		});
		btnNewButton_4.setBounds(110, 190, 76, 62);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true) {
					textField.setText(btnNewButton_5.getText());
					newOperation = false;
				}else {
					String currentText = textField.getText();
					textField.setText(currentText + btnNewButton_5.getText());
				}
			}
		});
		btnNewButton_5.setBounds(198, 190, 76, 62);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true) {
					textField.setText(btnNewButton_6.getText());
					newOperation = false;
				}else {
					String currentText = textField.getText();
					textField.setText(currentText + btnNewButton_6.getText());
				}
			}
		});
		btnNewButton_6.setBounds(22, 274, 76, 62);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true) {
					textField.setText(btnNewButton_7.getText());
					newOperation = false;
				}else {
					String currentText = textField.getText();
					textField.setText(currentText + btnNewButton_7.getText());
				}
			}
		});
		btnNewButton_7.setBounds(110, 274, 76, 62);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true) {
					textField.setText(btnNewButton_8.getText());
					newOperation = false;
				}else {
					String currentText = textField.getText();
					textField.setText(currentText + btnNewButton_8.getText());
				}
			}
		});
		btnNewButton_8.setBounds(198, 274, 76, 62);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("+");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(operation != null) {
					 switch (operation) {
					 case "+":
						score += Float.parseFloat(textField.getText());
						break;
						
					 case "-":
						score -= Float.parseFloat(textField.getText());
						break;
					}
				 }else {
					 score = Float.parseFloat(textField.getText());
				 }
				 textField.setText(String.valueOf(score));
				 operation = "+";
				 newOperation = true;
			}
			
		});
		btnNewButton_9.setBounds(301, 358, 76, 62);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_9_1 = new JButton("Clr");
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = 0;
				textField.setText("0");
				newOperation = true;
				operation = null;
			}
		});
		btnNewButton_9_1.setBounds(389, 102, 76, 62);
		contentPane.add(btnNewButton_9_1);
		
		JButton btnNewButton_9_2 = new JButton("-");
		btnNewButton_9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operation != null) {
					 switch (operation) {
					 case "+":
						score += Float.parseFloat(textField.getText());
						break;
						
					 case "-":
						score -= Float.parseFloat(textField.getText());
						break;
					}
				 }else {
					 score = Float.parseFloat(textField.getText());
				 }
				 textField.setText(String.valueOf(score));
				 operation = "-";
				 newOperation = true;
			}
		});
		btnNewButton_9_2.setBounds(301, 274, 76, 62);
		contentPane.add(btnNewButton_9_2);
		
		JButton btnNewButton_9_3 = new JButton("=");
		btnNewButton_9_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operation != null) {
					 switch (operation) {
					 case "+":
						score += Float.parseFloat(textField.getText());
						break;
						
					 case "-":
						score -= Float.parseFloat(textField.getText());
						break;
						
					 case "x":
							score *= Float.parseFloat(textField.getText());
							break;
							
					 case ":":
							score /= Float.parseFloat(textField.getText());
							break;
					 case "1/x":
						    score = 1/score;
						    break;
					}
				 }else {
					 score = Float.parseFloat(textField.getText());
				 }
				 textField.setText(String.valueOf(score));
				 operation = null;
				 newOperation = true;
			}
		});
		btnNewButton_9_3.setBounds(389, 358, 76, 62);
		contentPane.add(btnNewButton_9_3);
		
		JButton btnNewButton_9_4 = new JButton("0");
		btnNewButton_9_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true) {
					textField.setText(btnNewButton_9_4.getText());
					newOperation = false;
				}else {
					String currentText = textField.getText();
					textField.setText(currentText + btnNewButton_9_4.getText());
				}
			}
		});
		btnNewButton_9_4.setBounds(22, 358, 164, 62);
		contentPane.add(btnNewButton_9_4);
		
		JButton btnNewButton_9_5 = new JButton(".");
		btnNewButton_9_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true) {
					textField.setText("0.");
					newOperation = false;
				}else {
					String currentText = textField.getText();
					if(currentText.indexOf(".") == -1) {
						textField.setText(currentText + btnNewButton_9_5.getText());
					}
				}
			}
		});
		btnNewButton_9_5.setBounds(198, 358, 76, 62);
		contentPane.add(btnNewButton_9_5);
		
		JButton btnNewButton_9_1_1 = new JButton(":");
		btnNewButton_9_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operation != null) {
					 switch (operation) {
					 case "+":
						score += Float.parseFloat(textField.getText());
						break;
						
					 case "-":
						score -= Float.parseFloat(textField.getText());
						break;
						
					 case "x":
							score *= Float.parseFloat(textField.getText());
							break;
							
					 case ":":
							score /= Float.parseFloat(textField.getText());
							break;
					}
				 }else {
					 score = Float.parseFloat(textField.getText());
				 }
				 textField.setText(String.valueOf(score));
				 operation = ":";
				 newOperation = true;
			}
		});
		btnNewButton_9_1_1.setBounds(301, 102, 76, 62);
		contentPane.add(btnNewButton_9_1_1);
		
		JButton btnNewButton_9_1_2 = new JButton("x");
		btnNewButton_9_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operation != null) {
					 switch (operation) {
					 case "+":
						score += Float.parseFloat(textField.getText());
						break;
						
					 case "-":
						score -= Float.parseFloat(textField.getText());
						break;
						
					 case "x":
							score *= Float.parseFloat(textField.getText());
							break;
					}
				 }else {
					 score = Float.parseFloat(textField.getText());
				 }
				 textField.setText(String.valueOf(score));
				 operation = "x";
				 newOperation = true;
			}
		});
		btnNewButton_9_1_2.setBounds(301, 190, 76, 62);
		contentPane.add(btnNewButton_9_1_2);
		
		JButton btnNewButton_9_1_3 = new JButton("%");
		btnNewButton_9_1_3.setBounds(389, 190, 76, 62);
		contentPane.add(btnNewButton_9_1_3);
		
		JButton btnNewButton_9_1_4 = new JButton("1/x");
		btnNewButton_9_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operation != null) {
					switch (operation) {
					case "1/x":
						score = 1/score;
						break;
					}
				}else {
					score = Float.parseFloat(textField.getText());
				}
				textField.setText(String.valueOf(score));
				operation = "1/x";
				newOperation = true;
			}
		});
		btnNewButton_9_1_4.setBounds(389, 274, 76, 62);
		contentPane.add(btnNewButton_9_1_4);
	}
	
}
