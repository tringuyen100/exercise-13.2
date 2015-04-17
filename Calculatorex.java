import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculatorex implements ActionListener {
	
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JLabel output;
	private JTextField textField1;
	private JTextField textField2;
	private JButton button;
	private JButton button1;
	
	public Calculatorex() {
		frame = new JFrame("Calculator");
		frame.setVisible(true);
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.GRAY);
		
		label = new JLabel();
		label.setText("Input number");
		output = new JLabel();
		output.setText("......");
		
		textField1 = new JTextField(10);
		textField2 = new JTextField(10);
		
		button = new JButton("Find the Sum");
		button.addActionListener(this);
		button1 = new JButton("Find the Product");
		button1.addActionListener(this);
		
		panel.add(label);
		 panel.add(textField1);
		 panel.add(textField2);
		 panel.add(button);
		 panel.add(button1);
		 panel.add(output);
		 
		 frame.add(panel);
		
	}
	public void actionPerformed(ActionEvent e) {
		
		double num1 = Double.parseDouble(textField1.getText());
		double num2 = Double.parseDouble(textField2.getText());
		double sum = num1+num2;
		double product = num1*num2;
		if (e.getActionCommand().equals("Find the Sum")) 
			output.setText(String.valueOf(sum));
		
		else if(e.getActionCommand().equals("Find the Product"))
			output.setText(String.valueOf(product));
		else System.out.println("LOL");
	}
		
		
	}


