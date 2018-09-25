package calculator1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Frame3 {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textFieldans;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3 window = new Frame3();
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
	public Frame3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(34, 11, 164, 44);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(233, 11, 164, 44);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				try
				{
					num1=Integer.parseInt(textField1.getText());
					num2=Integer.parseInt(textField2.getText());
					ans=num1+num2;
					textFieldans.setText(Integer.toString(ans));
				}catch (Exception e)
				{
					JOptionPane.showMessageDialog(null, "enter correct input ");
				}
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(76, 66, 89, 46);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MINUS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1,num2,ans;
				try
				{
					num1=Integer.parseInt(textField1.getText());
					num2=Integer.parseInt(textField2.getText());
					ans=num1-num2;
					textFieldans.setText(Integer.toString(ans));
				}catch (Exception e)
				{
					JOptionPane.showMessageDialog(null, "enter correct input ");
				}
				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(276, 66, 89, 46);
		frame.getContentPane().add(btnNewButton_1);
		
		textFieldans = new JTextField();
		textFieldans.setBounds(248, 206, 117, 44);
		frame.getContentPane().add(textFieldans);
		textFieldans.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ANSWER IS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(95, 211, 117, 29);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton_2 = new JButton("multiply");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				try
				{
					num1=Integer.parseInt(textField1.getText());
					num2=Integer.parseInt(textField2.getText());
					ans=num1*num2;
					textFieldans.setText(Integer.toString(ans));
				}catch (Exception e)
				{
					JOptionPane.showMessageDialog(null, "enter correct input ");
				}
				
				
				
				
				
				
				
			}
		});
		btnNewButton_2.setBounds(76, 123, 89, 47);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("divide");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				try
				{
					num1=Integer.parseInt(textField1.getText());
					num2=Integer.parseInt(textField2.getText());
					ans=num1/num2;
					textFieldans.setText(Integer.toString(ans));
				}catch (Exception e)
				{
					JOptionPane.showMessageDialog(null, "enter correct input ");
				}
				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton_3.setBounds(276, 123, 89, 47);
		frame.getContentPane().add(btnNewButton_3);
	}
}
