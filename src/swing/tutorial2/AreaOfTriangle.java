package swing.tutorial2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AreaOfTriangle {

	private JFrame frame;
	private JTextField aField;
	private JTextField hField;
	private JTextField resultField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaOfTriangle window = new AreaOfTriangle();
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
	public AreaOfTriangle() {
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
		
		JLabel aLabel = new JLabel("a=");
		aLabel.setBounds(164, 11, 46, 14);
		frame.getContentPane().add(aLabel);
		
		aField = new JTextField();
		aField.setBounds(164, 34, 86, 20);
		frame.getContentPane().add(aField);
		aField.setColumns(10);
		
		JLabel hLabel = new JLabel("h=");
		hLabel.setBounds(164, 65, 46, 14);
		frame.getContentPane().add(hLabel);
		
		hField = new JTextField();
		hField.setBounds(164, 90, 86, 20);
		frame.getContentPane().add(hField);
		hField.setColumns(10);
		
		JButton countButton = new JButton("Licz");
		countButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				try{
					double a = Double.parseDouble(aField.getText());
					double h = Double.parseDouble(hField.getText());
					double area = a*h/2;
					resultField.setText(Double.toString(area));
				}catch(NumberFormatException exception){
					resultField.setText("-");
				}
				
			}
		});
		countButton.setBounds(164, 121, 89, 23);
		frame.getContentPane().add(countButton);
		
		resultField = new JTextField();
		resultField.setBounds(164, 155, 86, 20);
		frame.getContentPane().add(resultField);
		resultField.setColumns(10);
	}
}
